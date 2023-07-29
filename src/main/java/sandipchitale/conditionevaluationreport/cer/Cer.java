package sandipchitale.conditionevaluationreport.cer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.actuate.autoconfigure.condition.ConditionsReportEndpoint;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class Cer implements CommandLineRunner {
    private final ApplicationContext applicationContext;

    public Cer(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public void run(String... args) throws Exception {
        ConditionsReportEndpoint conditionsReportEndpoint
                = new ConditionsReportEndpoint((ConfigurableApplicationContext) applicationContext);
        ConditionsReportEndpoint.ConditionsDescriptor conditions = conditionsReportEndpoint.conditions();
        System.out.println(genIndent(0, "\uD83C\uDFD8\uFE0F") + " Contexts");
        Map<String, ConditionsReportEndpoint.ContextConditionsDescriptor> contexts = conditions.getContexts();
        contexts.forEach((contextName, contextConditionsDescriptor) -> {
            System.out.println(genIndent(1, "\uD83C\uDFE0") + " Context: " + contextName);
            System.out.println(genIndent(2, "✅") + " Positive Matches: ");
            contextConditionsDescriptor.getPositiveMatches().forEach((String conditionName, List<ConditionsReportEndpoint.MessageAndConditionDescriptor> condition) -> {
                System.out.println(genIndent(3, "\uD83D\uDC4D") + " Condition Name: " + conditionName);
                condition.forEach((ConditionsReportEndpoint.MessageAndConditionDescriptor messageAndConditionDescriptor) -> {
                    System.out.println(genIndent(4, "✅") + " Matched Condition: " + messageAndConditionDescriptor.getCondition());
                    System.out.println(genIndent(4, " \uD83D\uDEC8") + " Message: " + messageAndConditionDescriptor.getMessage());
                });
            });
            System.out.println(" │  └─⛔ Negative Matches (at least one did not match): " + contextName);
            contextConditionsDescriptor.getNegativeMatches().forEach((String conditionName, ConditionsReportEndpoint.MessageAndConditionsDescriptor messageAndConditionsDescriptor) -> {
                if (!messageAndConditionsDescriptor.getMatched().isEmpty() || !messageAndConditionsDescriptor.getNotMatched().isEmpty()) {
                    System.out.println(genIndent(3, "\uD83D\uDC4E") + " Condition Name: " + conditionName);
                    messageAndConditionsDescriptor.getNotMatched().forEach((ConditionsReportEndpoint.MessageAndConditionDescriptor messageAndConditionDescriptor) -> {
                        System.out.println(genIndent(4, "⛔") + " Unmatched Condition: " + messageAndConditionDescriptor.getCondition());
                        System.out.println(genIndent(4, " \uD83D\uDEC8") + " Message: " + messageAndConditionDescriptor.getMessage());
                    });
                    messageAndConditionsDescriptor.getMatched().forEach((ConditionsReportEndpoint.MessageAndConditionDescriptor messageAndConditionDescriptor) -> {
                        System.out.println(genIndent(4, "✅") + " Matched Condition: " + messageAndConditionDescriptor.getCondition());
                        System.out.println(genIndent(4, " \uD83D\uDEC8") + " Message: " + messageAndConditionDescriptor.getMessage());
                    });
                }
            });
            System.out.println(genIndent(2, "✅") + " Unconditional Classes: ");
            contextConditionsDescriptor.getUnconditionalClasses().forEach((String className) -> {
                System.out.println(genIndent(3, "✅") + " Class: " + className);
            });
        });
    }

    private static String genIndent(int indent, String icon) {
        if (indent == 0) {
            return icon;
        }
        StringBuilder sb = new StringBuilder(" ");
        for (int i = 0; i < (indent - 1); i++) {
            sb.append("│  ");
        }
        sb.append("└─");
        sb.append(icon);
        return sb.toString();
    }
}
