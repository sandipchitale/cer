# Springboot configuration Condition Evaluation Report (CER)

This exposes the `/actuator/conditions` endpoint which can be accessed via browser.

This also shows the Condition Evaluation Report for the Springboot configuration in the console, at the startup.

Sample output:

```
Springboot
   ___             _ _ _   _            ___          _           _   _            ___                   _
  / __|___ _ _  __| (_) |_(_)___ _ _   | __|_ ____ _| |_  _ __ _| |_(_)___ _ _   | _ \___ _ __  ___ _ _| |_ ™️
 | (__/ _ \ ' \/ _` | |  _| / _ \ ' \  | _|\ V / _` | | || / _` |  _| / _ \ ' \  |   / -_) '_ \/ _ \ '_|  _|
  \___\___/_||_\__,_|_|\__|_\___/_||_| |___|\_/\__,_|_|\_,_\__,_|\__|_\___/_||_| |_|_\___| .__/\___/_|  \__|
                                                                                         |_|
🏘️ Contexts
 └─🏠 Context: application
 │  └─✅ Positive Matches: 
 │  │  └─👍 Condition Name: AuditEventsEndpointAutoConfiguration
 │  │  │  └─✅ Matched Condition: OnAvailableEndpointCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnAvailableEndpoint marked as exposed by a 'management.endpoints.jmx.exposure' property
 │  │  └─👍 Condition Name: BeansEndpointAutoConfiguration
 │  │  │  └─✅ Matched Condition: OnAvailableEndpointCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnAvailableEndpoint marked as exposed by a 'management.endpoints.jmx.exposure' property
 │  │  └─👍 Condition Name: BeansEndpointAutoConfiguration#beansEndpoint
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: org.springframework.boot.actuate.beans.BeansEndpoint; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: CachesEndpointAutoConfiguration
 │  │  │  └─✅ Matched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass found required class 'org.springframework.cache.CacheManager'
 │  │  │  └─✅ Matched Condition: OnAvailableEndpointCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnAvailableEndpoint marked as exposed by a 'management.endpoints.jmx.exposure' property
 │  │  └─👍 Condition Name: CachesEndpointAutoConfiguration#cachesEndpoint
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: org.springframework.boot.actuate.cache.CachesEndpoint; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: ConditionsReportEndpointAutoConfiguration
 │  │  │  └─✅ Matched Condition: OnAvailableEndpointCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnAvailableEndpoint marked as exposed by a 'management.endpoints.web.exposure' property
 │  │  └─👍 Condition Name: ConditionsReportEndpointAutoConfiguration#conditionsReportEndpoint
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: org.springframework.boot.actuate.autoconfigure.condition.ConditionsReportEndpoint; SearchStrategy: current) did not find any beans
 │  │  └─👍 Condition Name: ConfigurationPropertiesReportEndpointAutoConfiguration
 │  │  │  └─✅ Matched Condition: OnAvailableEndpointCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnAvailableEndpoint marked as exposed by a 'management.endpoints.jmx.exposure' property
 │  │  └─👍 Condition Name: ConfigurationPropertiesReportEndpointAutoConfiguration#configurationPropertiesReportEndpoint
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: org.springframework.boot.actuate.context.properties.ConfigurationPropertiesReportEndpoint; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: EndpointAutoConfiguration#endpointCachingOperationInvokerAdvisor
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: org.springframework.boot.actuate.endpoint.invoker.cache.CachingOperationInvokerAdvisor; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: EndpointAutoConfiguration#endpointOperationParameterMapper
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: org.springframework.boot.actuate.endpoint.invoke.ParameterValueMapper; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: JacksonEndpointAutoConfiguration#endpointObjectMapper
 │  │  │  └─✅ Matched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass found required classes 'com.fasterxml.jackson.databind.ObjectMapper', 'org.springframework.http.converter.json.Jackson2ObjectMapperBuilder'
 │  │  │  └─✅ Matched Condition: OnPropertyCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnProperty (management.endpoints.jackson.isolated-object-mapper) matched
 │  │  └─👍 Condition Name: JmxEndpointAutoConfiguration
 │  │  │  └─✅ Matched Condition: OnPropertyCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnProperty (spring.jmx.enabled=true) matched
 │  │  └─👍 Condition Name: JmxEndpointAutoConfiguration#endpointObjectNameFactory
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: org.springframework.boot.actuate.endpoint.jmx.EndpointObjectNameFactory; SearchStrategy: current) did not find any beans
 │  │  └─👍 Condition Name: JmxEndpointAutoConfiguration#jmxAnnotationEndpointDiscoverer
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: org.springframework.boot.actuate.endpoint.jmx.JmxEndpointsSupplier; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: JmxEndpointAutoConfiguration#jmxMBeanExporter
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnSingleCandidate (types: javax.management.MBeanServer; SearchStrategy: all) found a single bean 'mbeanServer'
 │  │  └─👍 Condition Name: ServletEndpointManagementContextConfiguration
 │  │  │  └─✅ Matched Condition: OnWebApplicationCondition
 │  │  │  └─ 🛈 Message: found 'session' scope
 │  │  └─👍 Condition Name: ServletEndpointManagementContextConfiguration.WebMvcServletEndpointManagementContextConfiguration
 │  │  │  └─✅ Matched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass found required class 'org.springframework.web.servlet.DispatcherServlet'
 │  │  └─👍 Condition Name: WebEndpointAutoConfiguration
 │  │  │  └─✅ Matched Condition: OnWebApplicationCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnWebApplication (required) found 'session' scope
 │  │  └─👍 Condition Name: WebEndpointAutoConfiguration#controllerEndpointDiscoverer
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: org.springframework.boot.actuate.endpoint.web.annotation.ControllerEndpointsSupplier; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: WebEndpointAutoConfiguration#endpointMediaTypes
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: org.springframework.boot.actuate.endpoint.web.EndpointMediaTypes; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: WebEndpointAutoConfiguration#pathMappedEndpoints
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: org.springframework.boot.actuate.endpoint.web.PathMappedEndpoints; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: WebEndpointAutoConfiguration#webEndpointDiscoverer
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: org.springframework.boot.actuate.endpoint.web.WebEndpointsSupplier; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: WebEndpointAutoConfiguration.WebEndpointServletConfiguration
 │  │  │  └─✅ Matched Condition: OnWebApplicationCondition
 │  │  │  └─ 🛈 Message: found 'session' scope
 │  │  └─👍 Condition Name: WebEndpointAutoConfiguration.WebEndpointServletConfiguration#servletEndpointDiscoverer
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: org.springframework.boot.actuate.endpoint.web.annotation.ServletEndpointsSupplier; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: WebMvcEndpointManagementContextConfiguration
 │  │  │  └─✅ Matched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass found required class 'org.springframework.web.servlet.DispatcherServlet'
 │  │  │  └─✅ Matched Condition: OnWebApplicationCondition
 │  │  │  └─ 🛈 Message: found 'session' scope
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnBean (types: org.springframework.web.servlet.DispatcherServlet,org.springframework.boot.actuate.endpoint.web.WebEndpointsSupplier; SearchStrategy: all) found beans 'webEndpointDiscoverer', 'dispatcherServlet'
 │  │  └─👍 Condition Name: WebMvcEndpointManagementContextConfiguration#controllerEndpointHandlerMapping
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: org.springframework.boot.actuate.endpoint.web.servlet.ControllerEndpointHandlerMapping; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: WebMvcEndpointManagementContextConfiguration#endpointObjectMapperWebMvcConfigurer
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnBean (types: org.springframework.boot.actuate.endpoint.jackson.EndpointObjectMapper; SearchStrategy: all) found bean 'endpointObjectMapper'
 │  │  └─👍 Condition Name: WebMvcEndpointManagementContextConfiguration#webEndpointServletHandlerMapping
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: org.springframework.boot.actuate.endpoint.web.servlet.WebMvcEndpointHandlerMapping; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: EnvironmentEndpointAutoConfiguration
 │  │  │  └─✅ Matched Condition: OnAvailableEndpointCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnAvailableEndpoint marked as exposed by a 'management.endpoints.jmx.exposure' property
 │  │  └─👍 Condition Name: EnvironmentEndpointAutoConfiguration#environmentEndpoint
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: org.springframework.boot.actuate.env.EnvironmentEndpoint; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: HealthContributorAutoConfiguration#pingHealthContributor
 │  │  │  └─✅ Matched Condition: OnEnabledHealthIndicatorCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnEnabledHealthIndicator management.health.defaults.enabled is considered true
 │  │  └─👍 Condition Name: HealthEndpointAutoConfiguration
 │  │  │  └─✅ Matched Condition: OnAvailableEndpointCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnAvailableEndpoint marked as exposed by a 'management.endpoints.jmx.exposure' property
 │  │  └─👍 Condition Name: HealthEndpointConfiguration#healthContributorRegistry
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: org.springframework.boot.actuate.health.HealthContributorRegistry; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: HealthEndpointConfiguration#healthEndpoint
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: org.springframework.boot.actuate.health.HealthEndpoint; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: HealthEndpointConfiguration#healthEndpointGroupMembershipValidator
 │  │  │  └─✅ Matched Condition: OnPropertyCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnProperty (management.endpoint.health.validate-group-membership=true) matched
 │  │  └─👍 Condition Name: HealthEndpointConfiguration#healthEndpointGroups
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: org.springframework.boot.actuate.health.HealthEndpointGroups; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: HealthEndpointConfiguration#healthHttpCodeStatusMapper
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: org.springframework.boot.actuate.health.HttpCodeStatusMapper; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: HealthEndpointConfiguration#healthStatusAggregator
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: org.springframework.boot.actuate.health.StatusAggregator; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: InfoEndpointAutoConfiguration
 │  │  │  └─✅ Matched Condition: OnAvailableEndpointCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnAvailableEndpoint marked as exposed by a 'management.endpoints.jmx.exposure' property
 │  │  └─👍 Condition Name: InfoEndpointAutoConfiguration#infoEndpoint
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: org.springframework.boot.actuate.info.InfoEndpoint; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: LogFileWebEndpointAutoConfiguration
 │  │  │  └─✅ Matched Condition: OnAvailableEndpointCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnAvailableEndpoint marked as exposed by a 'management.endpoints.jmx.exposure' property
 │  │  └─👍 Condition Name: LoggersEndpointAutoConfiguration
 │  │  │  └─✅ Matched Condition: OnAvailableEndpointCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnAvailableEndpoint marked as exposed by a 'management.endpoints.jmx.exposure' property
 │  │  └─👍 Condition Name: LoggersEndpointAutoConfiguration#loggersEndpoint
 │  │  │  └─✅ Matched Condition: LoggersEndpointAutoConfiguration.OnEnabledLoggingSystemCondition
 │  │  │  └─ 🛈 Message: Logging System enabled
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnBean (types: org.springframework.boot.logging.LoggingSystem; SearchStrategy: all) found bean 'springBootLoggingSystem'; @ConditionalOnMissingBean (types: org.springframework.boot.actuate.logging.LoggersEndpoint; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: HeapDumpWebEndpointAutoConfiguration
 │  │  │  └─✅ Matched Condition: OnAvailableEndpointCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnAvailableEndpoint marked as exposed by a 'management.endpoints.jmx.exposure' property
 │  │  └─👍 Condition Name: HeapDumpWebEndpointAutoConfiguration#heapDumpWebEndpoint
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: org.springframework.boot.actuate.management.HeapDumpWebEndpoint; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: ThreadDumpEndpointAutoConfiguration
 │  │  │  └─✅ Matched Condition: OnAvailableEndpointCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnAvailableEndpoint marked as exposed by a 'management.endpoints.jmx.exposure' property
 │  │  └─👍 Condition Name: ThreadDumpEndpointAutoConfiguration#dumpEndpoint
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: org.springframework.boot.actuate.management.ThreadDumpEndpoint; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: CompositeMeterRegistryAutoConfiguration
 │  │  │  └─✅ Matched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass found required class 'io.micrometer.core.instrument.composite.CompositeMeterRegistry'
 │  │  └─👍 Condition Name: JvmMetricsAutoConfiguration
 │  │  │  └─✅ Matched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass found required class 'io.micrometer.core.instrument.MeterRegistry'
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnBean (types: io.micrometer.core.instrument.MeterRegistry; SearchStrategy: all) found bean 'simpleMeterRegistry'
 │  │  └─👍 Condition Name: JvmMetricsAutoConfiguration#classLoaderMetrics
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: io.micrometer.core.instrument.binder.jvm.ClassLoaderMetrics; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: JvmMetricsAutoConfiguration#jvmCompilationMetrics
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: io.micrometer.core.instrument.binder.jvm.JvmCompilationMetrics; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: JvmMetricsAutoConfiguration#jvmGcMetrics
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: io.micrometer.core.instrument.binder.jvm.JvmGcMetrics; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: JvmMetricsAutoConfiguration#jvmHeapPressureMetrics
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: io.micrometer.core.instrument.binder.jvm.JvmHeapPressureMetrics; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: JvmMetricsAutoConfiguration#jvmInfoMetrics
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: io.micrometer.core.instrument.binder.jvm.JvmInfoMetrics; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: JvmMetricsAutoConfiguration#jvmMemoryMetrics
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: io.micrometer.core.instrument.binder.jvm.JvmMemoryMetrics; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: JvmMetricsAutoConfiguration#jvmThreadMetrics
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: io.micrometer.core.instrument.binder.jvm.JvmThreadMetrics; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: LogbackMetricsAutoConfiguration
 │  │  │  └─✅ Matched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass found required classes 'io.micrometer.core.instrument.MeterRegistry', 'ch.qos.logback.classic.LoggerContext', 'org.slf4j.LoggerFactory'
 │  │  │  └─✅ Matched Condition: LogbackMetricsAutoConfiguration.LogbackLoggingCondition
 │  │  │  └─ 🛈 Message: LogbackLoggingCondition ILoggerFactory is a Logback LoggerContext
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnBean (types: io.micrometer.core.instrument.MeterRegistry; SearchStrategy: all) found bean 'simpleMeterRegistry'
 │  │  └─👍 Condition Name: LogbackMetricsAutoConfiguration#logbackMetrics
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: io.micrometer.core.instrument.binder.logging.LogbackMetrics; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: MetricsAutoConfiguration
 │  │  │  └─✅ Matched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass found required class 'io.micrometer.core.annotation.Timed'
 │  │  └─👍 Condition Name: MetricsAutoConfiguration#micrometerClock
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: io.micrometer.core.instrument.Clock; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: MetricsEndpointAutoConfiguration
 │  │  │  └─✅ Matched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass found required class 'io.micrometer.core.annotation.Timed'
 │  │  │  └─✅ Matched Condition: OnAvailableEndpointCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnAvailableEndpoint marked as exposed by a 'management.endpoints.jmx.exposure' property
 │  │  └─👍 Condition Name: MetricsEndpointAutoConfiguration#metricsEndpoint
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnBean (types: io.micrometer.core.instrument.MeterRegistry; SearchStrategy: all) found bean 'simpleMeterRegistry'; @ConditionalOnMissingBean (types: org.springframework.boot.actuate.metrics.MetricsEndpoint; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: SystemMetricsAutoConfiguration
 │  │  │  └─✅ Matched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass found required class 'io.micrometer.core.instrument.MeterRegistry'
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnBean (types: io.micrometer.core.instrument.MeterRegistry; SearchStrategy: all) found bean 'simpleMeterRegistry'
 │  │  └─👍 Condition Name: SystemMetricsAutoConfiguration#diskSpaceMetrics
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: org.springframework.boot.actuate.metrics.system.DiskSpaceMetricsBinder; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: SystemMetricsAutoConfiguration#fileDescriptorMetrics
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: io.micrometer.core.instrument.binder.system.FileDescriptorMetrics; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: SystemMetricsAutoConfiguration#processorMetrics
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: io.micrometer.core.instrument.binder.system.ProcessorMetrics; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: SystemMetricsAutoConfiguration#uptimeMetrics
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: io.micrometer.core.instrument.binder.system.UptimeMetrics; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: CacheMeterBinderProvidersConfiguration
 │  │  │  └─✅ Matched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass found required class 'io.micrometer.core.instrument.binder.MeterBinder'
 │  │  └─👍 Condition Name: SimpleMetricsExportAutoConfiguration
 │  │  │  └─✅ Matched Condition: OnMetricsExportEnabledCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnEnabledMetricsExport management.defaults.metrics.export.enabled is considered true
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnBean (types: io.micrometer.core.instrument.Clock; SearchStrategy: all) found bean 'micrometerClock'; @ConditionalOnMissingBean (types: io.micrometer.core.instrument.MeterRegistry; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: SimpleMetricsExportAutoConfiguration#simpleConfig
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: io.micrometer.core.instrument.simple.SimpleConfig; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: StartupTimeMetricsListenerAutoConfiguration
 │  │  │  └─✅ Matched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass found required class 'io.micrometer.core.instrument.MeterRegistry'
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnBean (types: io.micrometer.core.instrument.MeterRegistry; SearchStrategy: all) found bean 'simpleMeterRegistry'
 │  │  └─👍 Condition Name: StartupTimeMetricsListenerAutoConfiguration#startupTimeMetrics
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: org.springframework.boot.actuate.metrics.startup.StartupTimeMetricsListener; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: TaskExecutorMetricsAutoConfiguration
 │  │  │  └─✅ Matched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass found required class 'io.micrometer.core.instrument.binder.jvm.ExecutorServiceMetrics'
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnBean (types: java.util.concurrent.Executor,io.micrometer.core.instrument.MeterRegistry; SearchStrategy: all) found beans 'applicationTaskExecutor', 'simpleMeterRegistry'
 │  │  └─👍 Condition Name: TomcatMetricsAutoConfiguration
 │  │  │  └─✅ Matched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass found required classes 'io.micrometer.core.instrument.binder.tomcat.TomcatMetrics', 'org.apache.catalina.Manager'
 │  │  │  └─✅ Matched Condition: OnWebApplicationCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnWebApplication (required) found 'session' scope
 │  │  └─👍 Condition Name: TomcatMetricsAutoConfiguration#tomcatMetricsBinder
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnBean (types: io.micrometer.core.instrument.MeterRegistry; SearchStrategy: all) found bean 'simpleMeterRegistry'; @ConditionalOnMissingBean (types: io.micrometer.core.instrument.binder.tomcat.TomcatMetrics,org.springframework.boot.actuate.metrics.web.tomcat.TomcatMetricsBinder; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: ObservationAutoConfiguration
 │  │  │  └─✅ Matched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass found required class 'io.micrometer.observation.ObservationRegistry'
 │  │  └─👍 Condition Name: ObservationAutoConfiguration#observationRegistry
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: io.micrometer.observation.ObservationRegistry; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: ObservationAutoConfiguration.MeterObservationHandlerConfiguration
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnBean (types: io.micrometer.core.instrument.MeterRegistry; SearchStrategy: all) found bean 'simpleMeterRegistry'; @ConditionalOnMissingBean (types: io.micrometer.core.instrument.observation.MeterObservationHandler; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: ObservationAutoConfiguration.MeterObservationHandlerConfiguration.OnlyMetricsMeterObservationHandlerConfiguration
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: io.micrometer.tracing.Tracer; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: ObservationAutoConfiguration.OnlyMetricsConfiguration
 │  │  │  └─✅ Matched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass found required class 'io.micrometer.core.instrument.MeterRegistry'; @ConditionalOnMissingClass did not find unwanted class 'io.micrometer.tracing.Tracer'
 │  │  └─👍 Condition Name: HttpClientObservationsAutoConfiguration
 │  │  │  └─✅ Matched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass found required class 'io.micrometer.observation.Observation'
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnBean (types: io.micrometer.observation.ObservationRegistry; SearchStrategy: all) found bean 'observationRegistry'
 │  │  └─👍 Condition Name: HttpClientObservationsAutoConfiguration.MeterFilterConfiguration
 │  │  │  └─✅ Matched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass found required class 'io.micrometer.core.instrument.MeterRegistry'
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnBean (types: io.micrometer.core.instrument.MeterRegistry; SearchStrategy: all) found bean 'simpleMeterRegistry'
 │  │  └─👍 Condition Name: RestTemplateObservationConfiguration
 │  │  │  └─✅ Matched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass found required class 'org.springframework.web.client.RestTemplate'
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnBean (types: org.springframework.boot.web.client.RestTemplateBuilder; SearchStrategy: all) found bean 'restTemplateBuilder'
 │  │  └─👍 Condition Name: WebMvcObservationAutoConfiguration
 │  │  │  └─✅ Matched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass found required classes 'org.springframework.web.servlet.DispatcherServlet', 'io.micrometer.observation.Observation'
 │  │  │  └─✅ Matched Condition: OnWebApplicationCondition
 │  │  │  └─ 🛈 Message: found 'session' scope
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnBean (types: io.micrometer.observation.ObservationRegistry; SearchStrategy: all) found bean 'observationRegistry'
 │  │  └─👍 Condition Name: WebMvcObservationAutoConfiguration#webMvcObservationFilter
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: org.springframework.web.filter.ServerHttpObservationFilter; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: WebMvcObservationAutoConfiguration.MeterFilterConfiguration
 │  │  │  └─✅ Matched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass found required class 'io.micrometer.core.instrument.MeterRegistry'
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnBean (types: io.micrometer.core.instrument.MeterRegistry; SearchStrategy: all) found bean 'simpleMeterRegistry'
 │  │  └─👍 Condition Name: ScheduledTasksEndpointAutoConfiguration
 │  │  │  └─✅ Matched Condition: OnAvailableEndpointCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnAvailableEndpoint marked as exposed by a 'management.endpoints.jmx.exposure' property
 │  │  └─👍 Condition Name: ScheduledTasksEndpointAutoConfiguration#scheduledTasksEndpoint
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: org.springframework.boot.actuate.scheduling.ScheduledTasksEndpoint; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: DiskSpaceHealthContributorAutoConfiguration
 │  │  │  └─✅ Matched Condition: OnEnabledHealthIndicatorCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnEnabledHealthIndicator management.health.defaults.enabled is considered true
 │  │  └─👍 Condition Name: DiskSpaceHealthContributorAutoConfiguration#diskSpaceHealthIndicator
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (names: diskSpaceHealthIndicator; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: HttpExchangesEndpointAutoConfiguration
 │  │  │  └─✅ Matched Condition: OnAvailableEndpointCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnAvailableEndpoint marked as exposed by a 'management.endpoints.jmx.exposure' property
 │  │  └─👍 Condition Name: MappingsEndpointAutoConfiguration
 │  │  │  └─✅ Matched Condition: OnAvailableEndpointCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnAvailableEndpoint marked as exposed by a 'management.endpoints.jmx.exposure' property
 │  │  └─👍 Condition Name: MappingsEndpointAutoConfiguration.ServletWebConfiguration
 │  │  │  └─✅ Matched Condition: OnWebApplicationCondition
 │  │  │  └─ 🛈 Message: found 'session' scope
 │  │  └─👍 Condition Name: MappingsEndpointAutoConfiguration.ServletWebConfiguration.SpringMvcConfiguration
 │  │  │  └─✅ Matched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass found required class 'org.springframework.web.servlet.DispatcherServlet'
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnBean (types: org.springframework.web.servlet.DispatcherServlet; SearchStrategy: all) found bean 'dispatcherServlet'
 │  │  └─👍 Condition Name: ManagementContextAutoConfiguration.SameManagementContextConfiguration
 │  │  │  └─✅ Matched Condition: OnManagementPortCondition
 │  │  │  └─ 🛈 Message: Management Port actual port type (SAME) matched required type
 │  │  └─👍 Condition Name: ServletManagementContextAutoConfiguration
 │  │  │  └─✅ Matched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass found required class 'jakarta.servlet.Servlet'
 │  │  │  └─✅ Matched Condition: OnWebApplicationCondition
 │  │  │  └─ 🛈 Message: found 'session' scope
 │  │  └─👍 Condition Name: SpringApplicationAdminJmxAutoConfiguration
 │  │  │  └─✅ Matched Condition: OnPropertyCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnProperty (spring.application.admin.enabled=true) matched
 │  │  └─👍 Condition Name: SpringApplicationAdminJmxAutoConfiguration#springApplicationAdminRegistrar
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: org.springframework.boot.admin.SpringApplicationAdminMXBeanRegistrar; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: AopAutoConfiguration
 │  │  │  └─✅ Matched Condition: OnPropertyCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnProperty (spring.aop.auto=true) matched
 │  │  └─👍 Condition Name: AopAutoConfiguration.ClassProxyingConfiguration
 │  │  │  └─✅ Matched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingClass did not find unwanted class 'org.aspectj.weaver.Advice'
 │  │  │  └─✅ Matched Condition: OnPropertyCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnProperty (spring.aop.proxy-target-class=true) matched
 │  │  └─👍 Condition Name: ApplicationAvailabilityAutoConfiguration#applicationAvailability
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: org.springframework.boot.availability.ApplicationAvailability; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: GenericCacheConfiguration
 │  │  │  └─✅ Matched Condition: CacheCondition
 │  │  │  └─ 🛈 Message: Cache org.springframework.boot.autoconfigure.cache.GenericCacheConfiguration automatic cache type
 │  │  └─👍 Condition Name: NoOpCacheConfiguration
 │  │  │  └─✅ Matched Condition: CacheCondition
 │  │  │  └─ 🛈 Message: Cache org.springframework.boot.autoconfigure.cache.NoOpCacheConfiguration automatic cache type
 │  │  └─👍 Condition Name: SimpleCacheConfiguration
 │  │  │  └─✅ Matched Condition: CacheCondition
 │  │  │  └─ 🛈 Message: Cache org.springframework.boot.autoconfigure.cache.SimpleCacheConfiguration automatic cache type
 │  │  └─👍 Condition Name: LifecycleAutoConfiguration#defaultLifecycleProcessor
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (names: lifecycleProcessor; SearchStrategy: current) did not find any beans
 │  │  └─👍 Condition Name: PropertyPlaceholderAutoConfiguration#propertySourcesPlaceholderConfigurer
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: org.springframework.context.support.PropertySourcesPlaceholderConfigurer; SearchStrategy: current) did not find any beans
 │  │  └─👍 Condition Name: HttpMessageConvertersAutoConfiguration
 │  │  │  └─✅ Matched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass found required class 'org.springframework.http.converter.HttpMessageConverter'
 │  │  │  └─✅ Matched Condition: HttpMessageConvertersAutoConfiguration.NotReactiveWebApplicationCondition
 │  │  │  └─ 🛈 Message: NoneNestedConditions 0 matched 1 did not; NestedCondition on HttpMessageConvertersAutoConfiguration.NotReactiveWebApplicationCondition.ReactiveWebApplication did not find reactive web application classes
 │  │  └─👍 Condition Name: HttpMessageConvertersAutoConfiguration#messageConverters
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: org.springframework.boot.autoconfigure.http.HttpMessageConverters; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: HttpMessageConvertersAutoConfiguration.StringHttpMessageConverterConfiguration
 │  │  │  └─✅ Matched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass found required class 'org.springframework.http.converter.StringHttpMessageConverter'
 │  │  └─👍 Condition Name: HttpMessageConvertersAutoConfiguration.StringHttpMessageConverterConfiguration#stringHttpMessageConverter
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: org.springframework.http.converter.StringHttpMessageConverter; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: JacksonHttpMessageConvertersConfiguration.MappingJackson2HttpMessageConverterConfiguration
 │  │  │  └─✅ Matched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass found required class 'com.fasterxml.jackson.databind.ObjectMapper'
 │  │  │  └─✅ Matched Condition: OnPropertyCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnProperty (spring.mvc.converters.preferred-json-mapper=jackson) matched
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnBean (types: com.fasterxml.jackson.databind.ObjectMapper; SearchStrategy: all) found bean 'jacksonObjectMapper'
 │  │  └─👍 Condition Name: JacksonHttpMessageConvertersConfiguration.MappingJackson2HttpMessageConverterConfiguration#mappingJackson2HttpMessageConverter
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: org.springframework.http.converter.json.MappingJackson2HttpMessageConverter ignored: org.springframework.hateoas.server.mvc.TypeConstrainedMappingJackson2HttpMessageConverter,org.springframework.data.rest.webmvc.alps.AlpsJsonHttpMessageConverter; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: JacksonAutoConfiguration
 │  │  │  └─✅ Matched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass found required class 'com.fasterxml.jackson.databind.ObjectMapper'
 │  │  └─👍 Condition Name: JacksonAutoConfiguration.Jackson2ObjectMapperBuilderCustomizerConfiguration
 │  │  │  └─✅ Matched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass found required class 'org.springframework.http.converter.json.Jackson2ObjectMapperBuilder'
 │  │  └─👍 Condition Name: JacksonAutoConfiguration.JacksonObjectMapperBuilderConfiguration
 │  │  │  └─✅ Matched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass found required class 'org.springframework.http.converter.json.Jackson2ObjectMapperBuilder'
 │  │  └─👍 Condition Name: JacksonAutoConfiguration.JacksonObjectMapperBuilderConfiguration#jacksonObjectMapperBuilder
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: org.springframework.http.converter.json.Jackson2ObjectMapperBuilder; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: JacksonAutoConfiguration.JacksonObjectMapperConfiguration
 │  │  │  └─✅ Matched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass found required class 'org.springframework.http.converter.json.Jackson2ObjectMapperBuilder'
 │  │  └─👍 Condition Name: JacksonAutoConfiguration.JacksonObjectMapperConfiguration#jacksonObjectMapper
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: com.fasterxml.jackson.databind.ObjectMapper; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: JacksonAutoConfiguration.ParameterNamesModuleConfiguration
 │  │  │  └─✅ Matched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass found required class 'com.fasterxml.jackson.module.paramnames.ParameterNamesModule'
 │  │  └─👍 Condition Name: JacksonAutoConfiguration.ParameterNamesModuleConfiguration#parameterNamesModule
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: com.fasterxml.jackson.module.paramnames.ParameterNamesModule; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: JmxAutoConfiguration
 │  │  │  └─✅ Matched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass found required class 'org.springframework.jmx.export.MBeanExporter'
 │  │  │  └─✅ Matched Condition: OnPropertyCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnProperty (spring.jmx.enabled=true) matched
 │  │  └─👍 Condition Name: JmxAutoConfiguration#mbeanExporter
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: org.springframework.jmx.export.MBeanExporter; SearchStrategy: current) did not find any beans
 │  │  └─👍 Condition Name: JmxAutoConfiguration#mbeanServer
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: javax.management.MBeanServer; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: JmxAutoConfiguration#objectNamingStrategy
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: org.springframework.jmx.export.naming.ObjectNamingStrategy; SearchStrategy: current) did not find any beans
 │  │  └─👍 Condition Name: SqlInitializationAutoConfiguration
 │  │  │  └─✅ Matched Condition: OnPropertyCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnProperty (spring.sql.init.enabled) matched
 │  │  │  └─✅ Matched Condition: SqlInitializationAutoConfiguration.SqlInitializationModeCondition
 │  │  │  └─ 🛈 Message: NoneNestedConditions 0 matched 1 did not; NestedCondition on SqlInitializationAutoConfiguration.SqlInitializationModeCondition.ModeIsNever @ConditionalOnProperty (spring.sql.init.mode=never) did not find property 'mode'
 │  │  └─👍 Condition Name: SslAutoConfiguration#sslBundleRegistry
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: org.springframework.boot.ssl.SslBundleRegistry,org.springframework.boot.ssl.SslBundles; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: TaskExecutionAutoConfiguration
 │  │  │  └─✅ Matched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass found required class 'org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor'
 │  │  └─👍 Condition Name: TaskExecutionAutoConfiguration#applicationTaskExecutor
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: java.util.concurrent.Executor; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: TaskExecutionAutoConfiguration#taskExecutorBuilder
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: org.springframework.boot.task.TaskExecutorBuilder; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: TaskSchedulingAutoConfiguration
 │  │  │  └─✅ Matched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass found required class 'org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler'
 │  │  └─👍 Condition Name: TaskSchedulingAutoConfiguration#taskSchedulerBuilder
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: org.springframework.boot.task.TaskSchedulerBuilder; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: RestTemplateAutoConfiguration
 │  │  │  └─✅ Matched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass found required class 'org.springframework.web.client.RestTemplate'
 │  │  │  └─✅ Matched Condition: RestTemplateAutoConfiguration.NotReactiveWebApplicationCondition
 │  │  │  └─ 🛈 Message: NoneNestedConditions 0 matched 1 did not; NestedCondition on RestTemplateAutoConfiguration.NotReactiveWebApplicationCondition.ReactiveWebApplication did not find reactive web application classes
 │  │  └─👍 Condition Name: RestTemplateAutoConfiguration#restTemplateBuilder
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: org.springframework.boot.web.client.RestTemplateBuilder; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: RestTemplateAutoConfiguration#restTemplateBuilderConfigurer
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: org.springframework.boot.autoconfigure.web.client.RestTemplateBuilderConfigurer; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: EmbeddedWebServerFactoryCustomizerAutoConfiguration
 │  │  │  └─✅ Matched Condition: OnWebApplicationCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnWebApplication (required) found 'session' scope
 │  │  │  └─✅ Matched Condition: OnWarDeploymentCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnWarDeployment the application is not deployed as a WAR file.
 │  │  └─👍 Condition Name: EmbeddedWebServerFactoryCustomizerAutoConfiguration.TomcatWebServerFactoryCustomizerConfiguration
 │  │  │  └─✅ Matched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass found required classes 'org.apache.catalina.startup.Tomcat', 'org.apache.coyote.UpgradeProtocol'
 │  │  └─👍 Condition Name: DispatcherServletAutoConfiguration
 │  │  │  └─✅ Matched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass found required class 'org.springframework.web.servlet.DispatcherServlet'
 │  │  │  └─✅ Matched Condition: OnWebApplicationCondition
 │  │  │  └─ 🛈 Message: found 'session' scope
 │  │  └─👍 Condition Name: DispatcherServletAutoConfiguration.DispatcherServletConfiguration
 │  │  │  └─✅ Matched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass found required class 'jakarta.servlet.ServletRegistration'
 │  │  │  └─✅ Matched Condition: DispatcherServletAutoConfiguration.DefaultDispatcherServletCondition
 │  │  │  └─ 🛈 Message: Default DispatcherServlet did not find dispatcher servlet beans
 │  │  └─👍 Condition Name: DispatcherServletAutoConfiguration.DispatcherServletRegistrationConfiguration
 │  │  │  └─✅ Matched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass found required class 'jakarta.servlet.ServletRegistration'
 │  │  │  └─✅ Matched Condition: DispatcherServletAutoConfiguration.DispatcherServletRegistrationCondition
 │  │  │  └─ 🛈 Message: DispatcherServlet Registration did not find servlet registration bean
 │  │  └─👍 Condition Name: DispatcherServletAutoConfiguration.DispatcherServletRegistrationConfiguration#dispatcherServletRegistration
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnBean (names: dispatcherServlet types: org.springframework.web.servlet.DispatcherServlet; SearchStrategy: all) found bean 'dispatcherServlet'
 │  │  └─👍 Condition Name: HttpEncodingAutoConfiguration
 │  │  │  └─✅ Matched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass found required class 'org.springframework.web.filter.CharacterEncodingFilter'
 │  │  │  └─✅ Matched Condition: OnWebApplicationCondition
 │  │  │  └─ 🛈 Message: found 'session' scope
 │  │  │  └─✅ Matched Condition: OnPropertyCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnProperty (server.servlet.encoding.enabled) matched
 │  │  └─👍 Condition Name: HttpEncodingAutoConfiguration#characterEncodingFilter
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: org.springframework.web.filter.CharacterEncodingFilter; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: MultipartAutoConfiguration
 │  │  │  └─✅ Matched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass found required classes 'jakarta.servlet.Servlet', 'org.springframework.web.multipart.support.StandardServletMultipartResolver', 'jakarta.servlet.MultipartConfigElement'
 │  │  │  └─✅ Matched Condition: OnWebApplicationCondition
 │  │  │  └─ 🛈 Message: found 'session' scope
 │  │  │  └─✅ Matched Condition: OnPropertyCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnProperty (spring.servlet.multipart.enabled) matched
 │  │  └─👍 Condition Name: MultipartAutoConfiguration#multipartConfigElement
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: jakarta.servlet.MultipartConfigElement; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: MultipartAutoConfiguration#multipartResolver
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: org.springframework.web.multipart.MultipartResolver; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: ServletWebServerFactoryAutoConfiguration
 │  │  │  └─✅ Matched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass found required class 'jakarta.servlet.ServletRequest'
 │  │  │  └─✅ Matched Condition: OnWebApplicationCondition
 │  │  │  └─ 🛈 Message: found 'session' scope
 │  │  └─👍 Condition Name: ServletWebServerFactoryAutoConfiguration#tomcatServletWebServerFactoryCustomizer
 │  │  │  └─✅ Matched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass found required class 'org.apache.catalina.startup.Tomcat'
 │  │  └─👍 Condition Name: ServletWebServerFactoryConfiguration.EmbeddedTomcat
 │  │  │  └─✅ Matched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass found required classes 'jakarta.servlet.Servlet', 'org.apache.catalina.startup.Tomcat', 'org.apache.coyote.UpgradeProtocol'
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: org.springframework.boot.web.servlet.server.ServletWebServerFactory; SearchStrategy: current) did not find any beans
 │  │  └─👍 Condition Name: WebMvcAutoConfiguration
 │  │  │  └─✅ Matched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass found required classes 'jakarta.servlet.Servlet', 'org.springframework.web.servlet.DispatcherServlet', 'org.springframework.web.servlet.config.annotation.WebMvcConfigurer'
 │  │  │  └─✅ Matched Condition: OnWebApplicationCondition
 │  │  │  └─ 🛈 Message: found 'session' scope
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: WebMvcAutoConfiguration#formContentFilter
 │  │  │  └─✅ Matched Condition: OnPropertyCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnProperty (spring.mvc.formcontent.filter.enabled) matched
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: org.springframework.web.filter.FormContentFilter; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: WebMvcAutoConfiguration.EnableWebMvcConfiguration#flashMapManager
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (names: flashMapManager; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: WebMvcAutoConfiguration.EnableWebMvcConfiguration#localeResolver
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (names: localeResolver; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: WebMvcAutoConfiguration.EnableWebMvcConfiguration#themeResolver
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (names: themeResolver; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter#defaultViewResolver
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: org.springframework.web.servlet.view.InternalResourceViewResolver; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter#requestContextFilter
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: org.springframework.web.context.request.RequestContextListener,org.springframework.web.filter.RequestContextFilter; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter#viewResolver
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnBean (types: org.springframework.web.servlet.ViewResolver; SearchStrategy: all) found beans 'defaultViewResolver', 'beanNameViewResolver', 'mvcViewResolver'; @ConditionalOnMissingBean (names: viewResolver types: org.springframework.web.servlet.view.ContentNegotiatingViewResolver; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: ErrorMvcAutoConfiguration
 │  │  │  └─✅ Matched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass found required classes 'jakarta.servlet.Servlet', 'org.springframework.web.servlet.DispatcherServlet'
 │  │  │  └─✅ Matched Condition: OnWebApplicationCondition
 │  │  │  └─ 🛈 Message: found 'session' scope
 │  │  └─👍 Condition Name: ErrorMvcAutoConfiguration#basicErrorController
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: org.springframework.boot.web.servlet.error.ErrorController; SearchStrategy: current) did not find any beans
 │  │  └─👍 Condition Name: ErrorMvcAutoConfiguration#errorAttributes
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: org.springframework.boot.web.servlet.error.ErrorAttributes; SearchStrategy: current) did not find any beans
 │  │  └─👍 Condition Name: ErrorMvcAutoConfiguration.DefaultErrorViewResolverConfiguration#conventionErrorViewResolver
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnBean (types: org.springframework.web.servlet.DispatcherServlet; SearchStrategy: all) found bean 'dispatcherServlet'; @ConditionalOnMissingBean (types: org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: ErrorMvcAutoConfiguration.WhitelabelErrorViewConfiguration
 │  │  │  └─✅ Matched Condition: OnPropertyCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnProperty (server.error.whitelabel.enabled) matched
 │  │  │  └─✅ Matched Condition: ErrorMvcAutoConfiguration.ErrorTemplateMissingCondition
 │  │  │  └─ 🛈 Message: ErrorTemplate Missing did not find error template view
 │  │  └─👍 Condition Name: ErrorMvcAutoConfiguration.WhitelabelErrorViewConfiguration#beanNameViewResolver
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: org.springframework.web.servlet.view.BeanNameViewResolver; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: ErrorMvcAutoConfiguration.WhitelabelErrorViewConfiguration#defaultErrorView
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (names: error; SearchStrategy: all) did not find any beans
 │  │  └─👍 Condition Name: WebSocketServletAutoConfiguration
 │  │  │  └─✅ Matched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass found required classes 'jakarta.servlet.Servlet', 'jakarta.websocket.server.ServerContainer'
 │  │  │  └─✅ Matched Condition: OnWebApplicationCondition
 │  │  │  └─ 🛈 Message: found 'session' scope
 │  │  └─👍 Condition Name: WebSocketServletAutoConfiguration.TomcatWebSocketConfiguration
 │  │  │  └─✅ Matched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass found required classes 'org.apache.catalina.startup.Tomcat', 'org.apache.tomcat.websocket.server.WsSci'
 │  │  └─👍 Condition Name: WebSocketServletAutoConfiguration.TomcatWebSocketConfiguration#websocketServletWebServerCustomizer
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (names: websocketServletWebServerCustomizer; SearchStrategy: all) did not find any beans
 │  └─⛔ Negative Matches (at least one did not match): application
 │  │  └─👎 Condition Name: RabbitHealthContributorAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.amqp.rabbit.core.RabbitTemplate'
 │  │  └─👎 Condition Name: AuditAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnBean (types: org.springframework.boot.actuate.audit.AuditEventRepository; SearchStrategy: all) did not find any beans of type org.springframework.boot.actuate.audit.AuditEventRepository
 │  │  │  └─✅ Matched Condition: OnPropertyCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnProperty (management.auditevents.enabled) matched
 │  │  └─👎 Condition Name: AuditEventsEndpointAutoConfiguration#auditEventsEndpoint
 │  │  │  └─⛔ Unmatched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnBean (types: org.springframework.boot.actuate.audit.AuditEventRepository; SearchStrategy: all) did not find any beans of type org.springframework.boot.actuate.audit.AuditEventRepository
 │  │  └─👎 Condition Name: AvailabilityHealthContributorAutoConfiguration#livenessStateHealthIndicator
 │  │  │  └─⛔ Unmatched Condition: OnPropertyCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnProperty (management.health.livenessstate.enabled=true) did not find property 'enabled'
 │  │  └─👎 Condition Name: AvailabilityHealthContributorAutoConfiguration#readinessStateHealthIndicator
 │  │  │  └─⛔ Unmatched Condition: OnPropertyCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnProperty (management.health.readinessstate.enabled=true) did not find property 'enabled'
 │  │  └─👎 Condition Name: AvailabilityProbesAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: AvailabilityProbesAutoConfiguration.ProbesCondition
 │  │  │  └─ 🛈 Message: Probes availability not running on a supported cloud platform
 │  │  └─👎 Condition Name: CachesEndpointAutoConfiguration#cachesEndpointWebExtension
 │  │  │  └─⛔ Unmatched Condition: OnAvailableEndpointCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnAvailableEndpoint no 'management.endpoints' property marked it as exposed
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnBean (types: org.springframework.boot.actuate.cache.CachesEndpoint; SearchStrategy: all) found bean 'cachesEndpoint'; @ConditionalOnMissingBean (types: org.springframework.boot.actuate.cache.CachesEndpointWebExtension; SearchStrategy: all) did not find any beans
 │  │  └─👎 Condition Name: CassandraHealthContributorAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'com.datastax.oss.driver.api.core.CqlSession'
 │  │  └─👎 Condition Name: CassandraReactiveHealthContributorAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'com.datastax.oss.driver.api.core.CqlSession'
 │  │  └─👎 Condition Name: ReactiveCloudFoundryActuatorAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnWebApplicationCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnWebApplication did not find reactive web application classes
 │  │  └─👎 Condition Name: CloudFoundryActuatorAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnCloudPlatformCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnCloudPlatform did not find CLOUD_FOUNDRY
 │  │  │  └─✅ Matched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass found required class 'org.springframework.web.servlet.DispatcherServlet'
 │  │  │  └─✅ Matched Condition: OnWebApplicationCondition
 │  │  │  └─ 🛈 Message: found 'session' scope
 │  │  │  └─✅ Matched Condition: OnPropertyCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnProperty (management.cloudfoundry.enabled) matched
 │  │  └─👎 Condition Name: ShutdownEndpointAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnAvailableEndpointCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnAvailableEndpoint no property management.endpoint.shutdown.enabled found so using endpoint default of false
 │  │  └─👎 Condition Name: ConfigurationPropertiesReportEndpointAutoConfiguration#configurationPropertiesReportEndpointWebExtension
 │  │  │  └─⛔ Unmatched Condition: OnAvailableEndpointCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnAvailableEndpoint no 'management.endpoints' property marked it as exposed
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnBean (types: org.springframework.boot.actuate.context.properties.ConfigurationPropertiesReportEndpoint; SearchStrategy: all) found bean 'configurationPropertiesReportEndpoint'; @ConditionalOnMissingBean (types: org.springframework.boot.actuate.context.properties.ConfigurationPropertiesReportEndpointWebExtension; SearchStrategy: all) did not find any beans
 │  │  └─👎 Condition Name: CouchbaseHealthContributorAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'com.couchbase.client.java.Cluster'
 │  │  └─👎 Condition Name: CouchbaseReactiveHealthContributorAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'com.couchbase.client.java.Cluster'
 │  │  └─👎 Condition Name: ElasticsearchReactiveHealthContributorAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'reactor.core.publisher.Flux'
 │  │  └─👎 Condition Name: MongoHealthContributorAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.data.mongodb.core.MongoTemplate'
 │  │  └─👎 Condition Name: MongoReactiveHealthContributorAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'reactor.core.publisher.Flux'
 │  │  └─👎 Condition Name: RedisHealthContributorAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.data.redis.connection.RedisConnectionFactory'
 │  │  └─👎 Condition Name: RedisReactiveHealthContributorAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'reactor.core.publisher.Flux'
 │  │  └─👎 Condition Name: ElasticsearchRestHealthContributorAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.elasticsearch.client.RestClient'
 │  │  └─👎 Condition Name: ServletEndpointManagementContextConfiguration.JerseyServletEndpointManagementContextConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.glassfish.jersey.server.ResourceConfig'
 │  │  └─👎 Condition Name: JerseyWebEndpointManagementContextConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.glassfish.jersey.server.ResourceConfig'
 │  │  └─👎 Condition Name: WebFluxEndpointManagementContextConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.web.reactive.DispatcherHandler'
 │  │  └─👎 Condition Name: WebMvcEndpointManagementContextConfiguration#managementHealthEndpointWebMvcHandlerMapping
 │  │  │  └─⛔ Unmatched Condition: OnManagementPortCondition
 │  │  │  └─ 🛈 Message: Management Port actual port type (SAME) did not match required type (DIFFERENT)
 │  │  └─👎 Condition Name: EnvironmentEndpointAutoConfiguration#environmentEndpointWebExtension
 │  │  │  └─⛔ Unmatched Condition: OnAvailableEndpointCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnAvailableEndpoint no 'management.endpoints' property marked it as exposed
 │  │  │  └─✅ Matched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnBean (types: org.springframework.boot.actuate.env.EnvironmentEndpoint; SearchStrategy: all) found bean 'environmentEndpoint'; @ConditionalOnMissingBean (types: org.springframework.boot.actuate.env.EnvironmentEndpointWebExtension; SearchStrategy: all) did not find any beans
 │  │  └─👎 Condition Name: FlywayEndpointAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.flywaydb.core.Flyway'
 │  │  └─👎 Condition Name: HazelcastHealthContributorAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'com.hazelcast.core.HazelcastInstance'
 │  │  └─👎 Condition Name: HealthEndpointReactiveWebExtensionConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnWebApplicationCondition
 │  │  │  └─ 🛈 Message: did not find reactive web application classes
 │  │  └─👎 Condition Name: HealthEndpointWebExtensionConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnAvailableEndpointCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnAvailableEndpoint no 'management.endpoints' property marked it as exposed
 │  │  │  └─✅ Matched Condition: OnWebApplicationCondition
 │  │  │  └─ 🛈 Message: found 'session' scope
 │  │  └─👎 Condition Name: ReactiveHealthEndpointConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'reactor.core.publisher.Flux'
 │  │  └─👎 Condition Name: InfluxDbHealthContributorAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.influxdb.InfluxDB'
 │  │  └─👎 Condition Name: InfoContributorAutoConfiguration#buildInfoContributor
 │  │  │  └─⛔ Unmatched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnSingleCandidate (types: org.springframework.boot.info.BuildProperties; SearchStrategy: all) did not find any beans
 │  │  │  └─✅ Matched Condition: OnEnabledInfoContributorCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnEnabledInfoContributor management.info.defaults.enabled is considered true
 │  │  └─👎 Condition Name: InfoContributorAutoConfiguration#envInfoContributor
 │  │  │  └─⛔ Unmatched Condition: OnEnabledInfoContributorCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnEnabledInfoContributor management.info.env.enabled is not true
 │  │  └─👎 Condition Name: InfoContributorAutoConfiguration#gitInfoContributor
 │  │  │  └─⛔ Unmatched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnSingleCandidate (types: org.springframework.boot.info.GitProperties; SearchStrategy: all) did not find any beans
 │  │  │  └─✅ Matched Condition: OnEnabledInfoContributorCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnEnabledInfoContributor management.info.defaults.enabled is considered true
 │  │  └─👎 Condition Name: InfoContributorAutoConfiguration#javaInfoContributor
 │  │  │  └─⛔ Unmatched Condition: OnEnabledInfoContributorCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnEnabledInfoContributor management.info.java.enabled is not true
 │  │  └─👎 Condition Name: InfoContributorAutoConfiguration#osInfoContributor
 │  │  │  └─⛔ Unmatched Condition: OnEnabledInfoContributorCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnEnabledInfoContributor management.info.os.enabled is not true
 │  │  └─👎 Condition Name: IntegrationGraphEndpointAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.integration.graph.IntegrationGraphServer'
 │  │  └─👎 Condition Name: DataSourceHealthContributorAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.jdbc.core.JdbcTemplate'
 │  │  └─👎 Condition Name: JmsHealthContributorAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'jakarta.jms.ConnectionFactory'
 │  │  └─👎 Condition Name: LdapHealthContributorAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.ldap.core.LdapOperations'
 │  │  └─👎 Condition Name: LiquibaseEndpointAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'liquibase.integration.spring.SpringLiquibase'
 │  │  └─👎 Condition Name: LogFileWebEndpointAutoConfiguration#logFileWebEndpoint
 │  │  │  └─⛔ Unmatched Condition: LogFileWebEndpointAutoConfiguration.LogFileCondition
 │  │  │  └─ 🛈 Message: Log File did not find logging file
 │  │  └─👎 Condition Name: MailHealthContributorAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.mail.javamail.JavaMailSenderImpl'
 │  │  └─👎 Condition Name: CompositeMeterRegistryConfiguration
 │  │  │  └─⛔ Unmatched Condition: CompositeMeterRegistryConfiguration.MultipleNonPrimaryMeterRegistriesCondition
 │  │  │  └─ 🛈 Message: NoneNestedConditions 1 matched 1 did not; NestedCondition on CompositeMeterRegistryConfiguration.MultipleNonPrimaryMeterRegistriesCondition.SingleInjectableMeterRegistry @ConditionalOnSingleCandidate (types: io.micrometer.core.instrument.MeterRegistry; SearchStrategy: all) found a single bean 'simpleMeterRegistry'; NestedCondition on CompositeMeterRegistryConfiguration.MultipleNonPrimaryMeterRegistriesCondition.NoMeterRegistryCondition @ConditionalOnMissingBean (types: io.micrometer.core.instrument.MeterRegistry; SearchStrategy: all) found beans of type 'io.micrometer.core.instrument.MeterRegistry' simpleMeterRegistry
 │  │  └─👎 Condition Name: KafkaMetricsAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.kafka.core.ProducerFactory'
 │  │  └─👎 Condition Name: Log4J2MetricsAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.apache.logging.log4j.core.LoggerContext'
 │  │  └─👎 Condition Name: NoOpMeterRegistryConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: io.micrometer.core.instrument.MeterRegistry; SearchStrategy: all) found beans of type 'io.micrometer.core.instrument.MeterRegistry' simpleMeterRegistry
 │  │  └─👎 Condition Name: RabbitMetricsAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'com.rabbitmq.client.ConnectionFactory'
 │  │  └─👎 Condition Name: CacheMeterBinderProvidersConfiguration.Cache2kCacheMeterBinderProviderConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required classes 'org.cache2k.Cache2kBuilder', 'org.cache2k.extra.spring.SpringCache2kCache', 'org.cache2k.extra.micrometer.Cache2kCacheMetrics'
 │  │  └─👎 Condition Name: CacheMeterBinderProvidersConfiguration.CaffeineCacheMeterBinderProviderConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required classes 'org.springframework.cache.caffeine.CaffeineCache', 'com.github.benmanes.caffeine.cache.Cache'
 │  │  └─👎 Condition Name: CacheMeterBinderProvidersConfiguration.HazelcastCacheMeterBinderProviderConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required classes 'com.hazelcast.spring.cache.HazelcastCache', 'com.hazelcast.core.Hazelcast'
 │  │  └─👎 Condition Name: CacheMeterBinderProvidersConfiguration.JCacheCacheMeterBinderProviderConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required classes 'org.springframework.cache.jcache.JCacheCache', 'javax.cache.CacheManager'
 │  │  └─👎 Condition Name: CacheMeterBinderProvidersConfiguration.RedisCacheMeterBinderProviderConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.data.redis.cache.RedisCache'
 │  │  └─👎 Condition Name: CacheMetricsAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnBean (types: org.springframework.cache.CacheManager; SearchStrategy: all) did not find any beans of type org.springframework.cache.CacheManager
 │  │  └─👎 Condition Name: RepositoryMetricsAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.data.repository.Repository'
 │  │  └─👎 Condition Name: AppOpticsMetricsExportAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'io.micrometer.appoptics.AppOpticsMeterRegistry'
 │  │  └─👎 Condition Name: AtlasMetricsExportAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'io.micrometer.atlas.AtlasMeterRegistry'
 │  │  └─👎 Condition Name: DatadogMetricsExportAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'io.micrometer.datadog.DatadogMeterRegistry'
 │  │  └─👎 Condition Name: DynatraceMetricsExportAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'io.micrometer.dynatrace.DynatraceMeterRegistry'
 │  │  └─👎 Condition Name: ElasticMetricsExportAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'io.micrometer.elastic.ElasticMeterRegistry'
 │  │  └─👎 Condition Name: GangliaMetricsExportAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'io.micrometer.ganglia.GangliaMeterRegistry'
 │  │  └─👎 Condition Name: GraphiteMetricsExportAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'io.micrometer.graphite.GraphiteMeterRegistry'
 │  │  └─👎 Condition Name: HumioMetricsExportAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'io.micrometer.humio.HumioMeterRegistry'
 │  │  └─👎 Condition Name: InfluxMetricsExportAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'io.micrometer.influx.InfluxMeterRegistry'
 │  │  └─👎 Condition Name: JmxMetricsExportAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'io.micrometer.jmx.JmxMeterRegistry'
 │  │  └─👎 Condition Name: KairosMetricsExportAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'io.micrometer.kairos.KairosMeterRegistry'
 │  │  └─👎 Condition Name: NewRelicMetricsExportAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'io.micrometer.newrelic.NewRelicMeterRegistry'
 │  │  └─👎 Condition Name: OtlpMetricsExportAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'io.micrometer.registry.otlp.OtlpMeterRegistry'
 │  │  └─👎 Condition Name: PrometheusMetricsExportAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'io.micrometer.prometheus.PrometheusMeterRegistry'
 │  │  └─👎 Condition Name: SignalFxMetricsExportAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'io.micrometer.signalfx.SignalFxMeterRegistry'
 │  │  └─👎 Condition Name: StackdriverMetricsExportAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'io.micrometer.stackdriver.StackdriverMeterRegistry'
 │  │  └─👎 Condition Name: StatsdMetricsExportAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'io.micrometer.statsd.StatsdMeterRegistry'
 │  │  └─👎 Condition Name: WavefrontMetricsExportAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'com.wavefront.sdk.common.WavefrontSender'
 │  │  └─👎 Condition Name: DataSourcePoolMetricsAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnBean (types: javax.sql.DataSource,io.micrometer.core.instrument.MeterRegistry; SearchStrategy: all) did not find any beans of type javax.sql.DataSource
 │  │  │  └─✅ Matched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass found required classes 'javax.sql.DataSource', 'io.micrometer.core.instrument.MeterRegistry'
 │  │  └─👎 Condition Name: DataSourcePoolMetricsAutoConfiguration.HikariDataSourceMetricsConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'com.zaxxer.hikari.HikariDataSource'
 │  │  │  └─⛔ Unmatched Condition: ConditionEvaluationReport.AncestorsMatchedCondition
 │  │  │  └─ 🛈 Message: Ancestor org.springframework.boot.actuate.autoconfigure.metrics.jdbc.DataSourcePoolMetricsAutoConfiguration did not match
 │  │  └─👎 Condition Name: JerseyServerMetricsAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'io.micrometer.core.instrument.binder.jersey.server.MetricsApplicationEventListener'
 │  │  └─👎 Condition Name: MongoMetricsAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'com.mongodb.MongoClientSettings'
 │  │  └─👎 Condition Name: HibernateMetricsAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'jakarta.persistence.EntityManagerFactory'
 │  │  └─👎 Condition Name: ConnectionPoolMetricsAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'io.r2dbc.pool.ConnectionPool'
 │  │  └─👎 Condition Name: LettuceMetricsAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'io.lettuce.core.metrics.MicrometerCommandLatencyRecorder'
 │  │  └─👎 Condition Name: JettyMetricsAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.eclipse.jetty.server.Server'
 │  │  └─👎 Condition Name: Neo4jHealthContributorAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.neo4j.driver.Driver'
 │  │  └─👎 Condition Name: ObservationAutoConfiguration.MeterObservationHandlerConfiguration.TracingAndMetricsObservationHandlerConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnBean did not find required type 'io.micrometer.tracing.Tracer'
 │  │  │  └─⛔ Unmatched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnBean (types: io.micrometer.tracing.Tracer; SearchStrategy: all) did not find any beans of type io.micrometer.tracing.Tracer
 │  │  └─👎 Condition Name: ObservationAutoConfiguration.MetricsWithTracingConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'io.micrometer.tracing.Tracer'
 │  │  └─👎 Condition Name: ObservationAutoConfiguration.OnlyTracingConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'io.micrometer.tracing.Tracer'
 │  │  └─👎 Condition Name: BatchObservationAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.batch.core.configuration.annotation.BatchObservabilityBeanPostProcessor'
 │  │  └─👎 Condition Name: GraphQlObservationAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'graphql.GraphQL'
 │  │  └─👎 Condition Name: WebClientObservationConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.web.reactive.function.client.WebClient'
 │  │  └─👎 Condition Name: WebFluxObservationAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnWebApplicationCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnWebApplication did not find reactive web application classes
 │  │  └─👎 Condition Name: QuartzEndpointAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.quartz.Scheduler'
 │  │  └─👎 Condition Name: ConnectionFactoryHealthContributorAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'io.r2dbc.spi.ConnectionFactory'
 │  │  └─👎 Condition Name: ReactiveManagementWebSecurityAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity'
 │  │  └─👎 Condition Name: ManagementWebSecurityAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: DefaultWebSecurityCondition
 │  │  │  └─ 🛈 Message: AllNestedConditions 1 matched 1 did not; NestedCondition on DefaultWebSecurityCondition.Beans @ConditionalOnMissingBean (types: org.springframework.security.web.SecurityFilterChain; SearchStrategy: all) did not find any beans; NestedCondition on DefaultWebSecurityCondition.Classes @ConditionalOnClass did not find required classes 'org.springframework.security.web.SecurityFilterChain', 'org.springframework.security.config.annotation.web.builders.HttpSecurity'
 │  │  │  └─✅ Matched Condition: OnWebApplicationCondition
 │  │  │  └─ 🛈 Message: found 'session' scope
 │  │  └─👎 Condition Name: SecurityRequestMatchersManagementContextConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.security.web.util.matcher.RequestMatcher'
 │  │  └─👎 Condition Name: SessionsEndpointAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.session.FindByIndexNameSessionRepository'
 │  │  └─👎 Condition Name: StartupEndpointAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: StartupEndpointAutoConfiguration.ApplicationStartupCondition
 │  │  │  └─ 🛈 Message: ApplicationStartup configured applicationStartup is of type class org.springframework.core.metrics.DefaultApplicationStartup, expected BufferingApplicationStartup.
 │  │  └─👎 Condition Name: BraveAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'brave.Tracer'
 │  │  └─👎 Condition Name: MicrometerTracingAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'io.micrometer.tracing.Tracer'
 │  │  └─👎 Condition Name: OpenTelemetryAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'io.micrometer.tracing.otel.bridge.OtelTracer'
 │  │  └─👎 Condition Name: OtlpAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'io.micrometer.tracing.otel.bridge.OtelTracer'
 │  │  └─👎 Condition Name: PrometheusExemplarsAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'io.micrometer.tracing.Tracer'
 │  │  └─👎 Condition Name: WavefrontTracingAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'com.wavefront.sdk.common.WavefrontSender'
 │  │  └─👎 Condition Name: ZipkinAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'zipkin2.reporter.Sender'
 │  │  └─👎 Condition Name: WavefrontAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'com.wavefront.sdk.common.application.ApplicationTags'
 │  │  └─👎 Condition Name: HttpExchangesAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnBean (types: org.springframework.boot.actuate.web.exchanges.HttpExchangeRepository; SearchStrategy: all) did not find any beans of type org.springframework.boot.actuate.web.exchanges.HttpExchangeRepository
 │  │  │  └─✅ Matched Condition: OnWebApplicationCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnWebApplication (required) found 'session' scope
 │  │  │  └─✅ Matched Condition: OnPropertyCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnProperty (management.httpexchanges.recording.enabled) matched
 │  │  └─👎 Condition Name: HttpExchangesAutoConfiguration.ReactiveHttpExchangesConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnWebApplicationCondition
 │  │  │  └─ 🛈 Message: did not find reactive web application classes
 │  │  │  └─⛔ Unmatched Condition: ConditionEvaluationReport.AncestorsMatchedCondition
 │  │  │  └─ 🛈 Message: Ancestor org.springframework.boot.actuate.autoconfigure.web.exchanges.HttpExchangesAutoConfiguration did not match
 │  │  └─👎 Condition Name: HttpExchangesAutoConfiguration.ServletHttpExchangesConfiguration
 │  │  │  └─⛔ Unmatched Condition: ConditionEvaluationReport.AncestorsMatchedCondition
 │  │  │  └─ 🛈 Message: Ancestor org.springframework.boot.actuate.autoconfigure.web.exchanges.HttpExchangesAutoConfiguration did not match
 │  │  │  └─✅ Matched Condition: OnWebApplicationCondition
 │  │  │  └─ 🛈 Message: found 'session' scope
 │  │  └─👎 Condition Name: HttpExchangesEndpointAutoConfiguration#httpExchangesEndpoint
 │  │  │  └─⛔ Unmatched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnBean (types: org.springframework.boot.actuate.web.exchanges.HttpExchangeRepository; SearchStrategy: all) did not find any beans of type org.springframework.boot.actuate.web.exchanges.HttpExchangeRepository
 │  │  └─👎 Condition Name: JerseySameManagementContextConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.glassfish.jersey.server.ResourceConfig'
 │  │  └─👎 Condition Name: MappingsEndpointAutoConfiguration.ReactiveWebConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.web.reactive.DispatcherHandler'
 │  │  └─👎 Condition Name: ReactiveManagementContextAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'reactor.core.publisher.Flux'
 │  │  └─👎 Condition Name: ManagementContextAutoConfiguration.DifferentManagementContextConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnManagementPortCondition
 │  │  │  └─ 🛈 Message: Management Port actual port type (SAME) did not match required type (DIFFERENT)
 │  │  └─👎 Condition Name: ServletManagementContextAutoConfiguration.ApplicationContextFilterConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnPropertyCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnProperty (management.server.add-application-context-header=true) did not find property 'add-application-context-header'
 │  │  └─👎 Condition Name: RabbitAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'com.rabbitmq.client.Channel'
 │  │  └─👎 Condition Name: AopAutoConfiguration.AspectJAutoProxyingConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.aspectj.weaver.Advice'
 │  │  └─👎 Condition Name: BatchAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.batch.core.launch.JobLauncher'
 │  │  └─👎 Condition Name: Cache2kCacheConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.cache2k.Cache2kBuilder'
 │  │  └─👎 Condition Name: CacheAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnBean (types: org.springframework.cache.interceptor.CacheAspectSupport; SearchStrategy: all) did not find any beans of type org.springframework.cache.interceptor.CacheAspectSupport
 │  │  │  └─✅ Matched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass found required class 'org.springframework.cache.CacheManager'
 │  │  └─👎 Condition Name: CacheAutoConfiguration.CacheManagerEntityManagerFactoryDependsOnPostProcessor
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean'
 │  │  │  └─⛔ Unmatched Condition: ConditionEvaluationReport.AncestorsMatchedCondition
 │  │  │  └─ 🛈 Message: Ancestor org.springframework.boot.autoconfigure.cache.CacheAutoConfiguration did not match
 │  │  └─👎 Condition Name: CaffeineCacheConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'com.github.benmanes.caffeine.cache.Caffeine'
 │  │  └─👎 Condition Name: CouchbaseCacheConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'com.couchbase.client.java.Cluster'
 │  │  └─👎 Condition Name: HazelcastCacheConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'com.hazelcast.core.HazelcastInstance'
 │  │  └─👎 Condition Name: InfinispanCacheConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.infinispan.spring.embedded.provider.SpringEmbeddedCacheManager'
 │  │  └─👎 Condition Name: JCacheCacheConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'javax.cache.Caching'
 │  │  └─👎 Condition Name: RedisCacheConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.data.redis.connection.RedisConnectionFactory'
 │  │  └─👎 Condition Name: CassandraAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'com.datastax.oss.driver.api.core.CqlSession'
 │  │  └─👎 Condition Name: MessageSourceAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: MessageSourceAutoConfiguration.ResourceBundleCondition
 │  │  │  └─ 🛈 Message: ResourceBundle did not find bundle with basename messages
 │  │  └─👎 Condition Name: CouchbaseAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'com.couchbase.client.java.Cluster'
 │  │  └─👎 Condition Name: PersistenceExceptionTranslationAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor'
 │  │  └─👎 Condition Name: CassandraDataAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'com.datastax.oss.driver.api.core.CqlSession'
 │  │  └─👎 Condition Name: CassandraReactiveDataAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'com.datastax.oss.driver.api.core.CqlSession'
 │  │  └─👎 Condition Name: CassandraReactiveRepositoriesAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.data.cassandra.ReactiveSession'
 │  │  └─👎 Condition Name: CassandraRepositoriesAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'com.datastax.oss.driver.api.core.CqlSession'
 │  │  └─👎 Condition Name: CouchbaseDataAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'com.couchbase.client.java.Bucket'
 │  │  └─👎 Condition Name: CouchbaseReactiveDataAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'com.couchbase.client.java.Cluster'
 │  │  └─👎 Condition Name: CouchbaseReactiveRepositoriesAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'com.couchbase.client.java.Cluster'
 │  │  └─👎 Condition Name: CouchbaseRepositoriesAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'com.couchbase.client.java.Bucket'
 │  │  └─👎 Condition Name: ElasticsearchDataAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.data.elasticsearch.client.elc.ElasticsearchTemplate'
 │  │  └─👎 Condition Name: ElasticsearchRepositoriesAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.data.elasticsearch.repository.ElasticsearchRepository'
 │  │  └─👎 Condition Name: ReactiveElasticsearchRepositoriesAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.data.elasticsearch.client.elc.ReactiveElasticsearchClient'
 │  │  └─👎 Condition Name: JdbcRepositoriesAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.data.jdbc.repository.config.AbstractJdbcConfiguration'
 │  │  └─👎 Condition Name: JpaRepositoriesAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.data.jpa.repository.JpaRepository'
 │  │  └─👎 Condition Name: LdapRepositoriesAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.data.ldap.repository.LdapRepository'
 │  │  └─👎 Condition Name: MongoDataAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'com.mongodb.client.MongoClient'
 │  │  └─👎 Condition Name: MongoReactiveDataAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'com.mongodb.reactivestreams.client.MongoClient'
 │  │  └─👎 Condition Name: MongoReactiveRepositoriesAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'com.mongodb.reactivestreams.client.MongoClient'
 │  │  └─👎 Condition Name: MongoRepositoriesAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'com.mongodb.client.MongoClient'
 │  │  └─👎 Condition Name: Neo4jDataAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.neo4j.driver.Driver'
 │  │  └─👎 Condition Name: Neo4jReactiveDataAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.neo4j.driver.Driver'
 │  │  └─👎 Condition Name: Neo4jReactiveRepositoriesAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.neo4j.driver.Driver'
 │  │  └─👎 Condition Name: Neo4jRepositoriesAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.neo4j.driver.Driver'
 │  │  └─👎 Condition Name: R2dbcDataAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.data.r2dbc.core.R2dbcEntityTemplate'
 │  │  └─👎 Condition Name: R2dbcRepositoriesAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'io.r2dbc.spi.ConnectionFactory'
 │  │  └─👎 Condition Name: RedisAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.data.redis.core.RedisOperations'
 │  │  └─👎 Condition Name: RedisReactiveAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'reactor.core.publisher.Flux'
 │  │  └─👎 Condition Name: RedisRepositoriesAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.data.redis.repository.configuration.EnableRedisRepositories'
 │  │  └─👎 Condition Name: RepositoryRestMvcAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration'
 │  │  └─👎 Condition Name: SpringDataWebAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.data.web.PageableHandlerMethodArgumentResolver'
 │  │  └─👎 Condition Name: ElasticsearchClientAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'co.elastic.clients.elasticsearch.ElasticsearchClient'
 │  │  └─👎 Condition Name: ElasticsearchRestClientAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.elasticsearch.client.RestClientBuilder'
 │  │  └─👎 Condition Name: ReactiveElasticsearchClientAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'co.elastic.clients.transport.ElasticsearchTransport'
 │  │  └─👎 Condition Name: FlywayAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.flywaydb.core.Flyway'
 │  │  └─👎 Condition Name: FreeMarkerAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'freemarker.template.Configuration'
 │  │  └─👎 Condition Name: GraphQlAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'graphql.GraphQL'
 │  │  └─👎 Condition Name: GraphQlQueryByExampleAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'graphql.GraphQL'
 │  │  └─👎 Condition Name: GraphQlQuerydslAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'graphql.GraphQL'
 │  │  └─👎 Condition Name: GraphQlReactiveQueryByExampleAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'graphql.GraphQL'
 │  │  └─👎 Condition Name: GraphQlReactiveQuerydslAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'graphql.GraphQL'
 │  │  └─👎 Condition Name: GraphQlWebFluxAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'graphql.GraphQL'
 │  │  └─👎 Condition Name: GraphQlRSocketAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'graphql.GraphQL'
 │  │  └─👎 Condition Name: RSocketGraphQlClientAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'graphql.GraphQL'
 │  │  └─👎 Condition Name: GraphQlWebFluxSecurityAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'graphql.GraphQL'
 │  │  └─👎 Condition Name: GraphQlWebMvcSecurityAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'graphql.GraphQL'
 │  │  └─👎 Condition Name: GraphQlWebMvcAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'graphql.GraphQL'
 │  │  └─👎 Condition Name: GroovyTemplateAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'groovy.text.markup.MarkupTemplateEngine'
 │  │  └─👎 Condition Name: GsonAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'com.google.gson.Gson'
 │  │  └─👎 Condition Name: H2ConsoleAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.h2.server.web.JakartaWebServlet'
 │  │  └─👎 Condition Name: HypermediaAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.hateoas.EntityModel'
 │  │  └─👎 Condition Name: HazelcastAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'com.hazelcast.core.HazelcastInstance'
 │  │  └─👎 Condition Name: HazelcastJpaDependencyAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'com.hazelcast.core.HazelcastInstance'
 │  │  └─👎 Condition Name: GsonHttpMessageConvertersConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'com.google.gson.Gson'
 │  │  └─👎 Condition Name: JacksonHttpMessageConvertersConfiguration.MappingJackson2XmlHttpMessageConverterConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'com.fasterxml.jackson.dataformat.xml.XmlMapper'
 │  │  └─👎 Condition Name: JsonbHttpMessageConvertersConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'jakarta.json.bind.Jsonb'
 │  │  └─👎 Condition Name: CodecsAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.web.reactive.function.client.WebClient'
 │  │  └─👎 Condition Name: InfluxDbAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.influxdb.InfluxDB'
 │  │  └─👎 Condition Name: ProjectInfoAutoConfiguration#buildProperties
 │  │  │  └─⛔ Unmatched Condition: OnResourceCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnResource did not find resource '${spring.info.build.location:classpath:META-INF/build-info.properties}'
 │  │  └─👎 Condition Name: ProjectInfoAutoConfiguration#gitProperties
 │  │  │  └─⛔ Unmatched Condition: ProjectInfoAutoConfiguration.GitResourceAvailableCondition
 │  │  │  └─ 🛈 Message: GitResource did not find git info at classpath:git.properties
 │  │  └─👎 Condition Name: IntegrationAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.integration.config.EnableIntegration'
 │  │  └─👎 Condition Name: DataSourceAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType'
 │  │  └─👎 Condition Name: DataSourceTransactionManagerAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.jdbc.core.JdbcTemplate'
 │  │  └─👎 Condition Name: JdbcTemplateAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.jdbc.core.JdbcTemplate'
 │  │  └─👎 Condition Name: JndiDataSourceAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType'
 │  │  └─👎 Condition Name: XADataSourceAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'jakarta.transaction.TransactionManager'
 │  │  └─👎 Condition Name: JerseyAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.glassfish.jersey.server.spring.SpringComponentProvider'
 │  │  └─👎 Condition Name: JmsAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'jakarta.jms.Message'
 │  │  └─👎 Condition Name: JndiConnectionFactoryAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.jms.core.JmsTemplate'
 │  │  └─👎 Condition Name: ActiveMQAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'jakarta.jms.ConnectionFactory'
 │  │  └─👎 Condition Name: ArtemisAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'jakarta.jms.ConnectionFactory'
 │  │  └─👎 Condition Name: JooqAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.jooq.DSLContext'
 │  │  └─👎 Condition Name: JsonbAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'jakarta.json.bind.Jsonb'
 │  │  └─👎 Condition Name: KafkaAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.kafka.core.KafkaTemplate'
 │  │  └─👎 Condition Name: LdapAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.ldap.core.ContextSource'
 │  │  └─👎 Condition Name: EmbeddedLdapAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'com.unboundid.ldap.listener.InMemoryDirectoryServer'
 │  │  └─👎 Condition Name: LiquibaseAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'liquibase.change.DatabaseChange'
 │  │  └─👎 Condition Name: MailSenderAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'jakarta.activation.MimeType'
 │  │  └─👎 Condition Name: MailSenderValidatorAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnSingleCandidate did not find required type 'org.springframework.mail.javamail.JavaMailSenderImpl'
 │  │  └─👎 Condition Name: MongoAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'com.mongodb.client.MongoClient'
 │  │  └─👎 Condition Name: MongoReactiveAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'com.mongodb.reactivestreams.client.MongoClient'
 │  │  └─👎 Condition Name: MustacheAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'com.samskivert.mustache.Mustache'
 │  │  └─👎 Condition Name: Neo4jAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.neo4j.driver.Driver'
 │  │  └─👎 Condition Name: NettyAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'io.netty.util.NettyRuntime'
 │  │  └─👎 Condition Name: HibernateJpaAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'jakarta.persistence.EntityManager'
 │  │  └─👎 Condition Name: QuartzAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.quartz.Scheduler'
 │  │  └─👎 Condition Name: R2dbcAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'io.r2dbc.spi.ConnectionFactory'
 │  │  └─👎 Condition Name: R2dbcTransactionManagerAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.r2dbc.connection.R2dbcTransactionManager'
 │  │  └─👎 Condition Name: RSocketMessagingAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'io.rsocket.RSocket'
 │  │  └─👎 Condition Name: RSocketRequesterAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'io.rsocket.RSocket'
 │  │  └─👎 Condition Name: RSocketServerAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'io.rsocket.core.RSocketServer'
 │  │  └─👎 Condition Name: RSocketStrategiesAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'io.netty.buffer.PooledByteBufAllocator'
 │  │  └─👎 Condition Name: ReactiveOAuth2ClientAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'reactor.core.publisher.Flux'
 │  │  └─👎 Condition Name: OAuth2ClientAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.security.config.annotation.web.configuration.EnableWebSecurity'
 │  │  └─👎 Condition Name: ReactiveOAuth2ResourceServerAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity'
 │  │  └─👎 Condition Name: OAuth2ResourceServerAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.security.oauth2.server.resource.authentication.BearerTokenAuthenticationToken'
 │  │  └─👎 Condition Name: OAuth2AuthorizationServerAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.security.oauth2.server.authorization.OAuth2Authorization'
 │  │  └─👎 Condition Name: OAuth2AuthorizationServerJwtAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.security.oauth2.server.authorization.OAuth2Authorization'
 │  │  └─👎 Condition Name: ReactiveSecurityAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'reactor.core.publisher.Flux'
 │  │  └─👎 Condition Name: ReactiveUserDetailsServiceAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.security.authentication.ReactiveAuthenticationManager'
 │  │  └─👎 Condition Name: RSocketSecurityAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.security.rsocket.core.SecuritySocketAcceptorInterceptor'
 │  │  └─👎 Condition Name: Saml2RelyingPartyAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.security.saml2.provider.service.registration.RelyingPartyRegistrationRepository'
 │  │  └─👎 Condition Name: SecurityAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.security.authentication.DefaultAuthenticationEventPublisher'
 │  │  └─👎 Condition Name: SecurityFilterAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.security.config.http.SessionCreationPolicy'
 │  │  └─👎 Condition Name: UserDetailsServiceAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.security.authentication.AuthenticationManager'
 │  │  └─👎 Condition Name: SendGridAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'com.sendgrid.SendGrid'
 │  │  └─👎 Condition Name: SessionAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.session.Session'
 │  │  └─👎 Condition Name: DataSourceInitializationConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.jdbc.datasource.init.DatabasePopulator'
 │  │  └─👎 Condition Name: R2dbcInitializationConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required classes 'io.r2dbc.spi.ConnectionFactory', 'org.springframework.r2dbc.connection.init.DatabasePopulator'
 │  │  └─👎 Condition Name: TaskSchedulingAutoConfiguration#scheduledBeanLazyInitializationExcludeFilter
 │  │  │  └─⛔ Unmatched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnBean (names: org.springframework.context.annotation.internalScheduledAnnotationProcessor; SearchStrategy: all) did not find any beans named org.springframework.context.annotation.internalScheduledAnnotationProcessor
 │  │  └─👎 Condition Name: TaskSchedulingAutoConfiguration#taskScheduler
 │  │  │  └─⛔ Unmatched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnBean (names: org.springframework.context.annotation.internalScheduledAnnotationProcessor; SearchStrategy: all) did not find any beans named org.springframework.context.annotation.internalScheduledAnnotationProcessor
 │  │  └─👎 Condition Name: ThymeleafAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.thymeleaf.spring6.SpringTemplateEngine'
 │  │  └─👎 Condition Name: TransactionAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.transaction.PlatformTransactionManager'
 │  │  └─👎 Condition Name: JtaAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'jakarta.transaction.Transaction'
 │  │  └─👎 Condition Name: ValidationAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'jakarta.validation.executable.ExecutableValidator'
 │  │  └─👎 Condition Name: EmbeddedWebServerFactoryCustomizerAutoConfiguration.JettyWebServerFactoryCustomizerConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required classes 'org.eclipse.jetty.server.Server', 'org.eclipse.jetty.util.Loader', 'org.eclipse.jetty.webapp.WebAppContext'
 │  │  └─👎 Condition Name: EmbeddedWebServerFactoryCustomizerAutoConfiguration.NettyWebServerFactoryCustomizerConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'reactor.netty.http.server.HttpServer'
 │  │  └─👎 Condition Name: EmbeddedWebServerFactoryCustomizerAutoConfiguration.UndertowWebServerFactoryCustomizerConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required classes 'io.undertow.Undertow', 'org.xnio.SslClientAuthMode'
 │  │  └─👎 Condition Name: HttpHandlerAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.web.reactive.DispatcherHandler'
 │  │  └─👎 Condition Name: ReactiveMultipartAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.web.reactive.config.WebFluxConfigurer'
 │  │  └─👎 Condition Name: ReactiveWebServerFactoryAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnWebApplicationCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnWebApplication did not find reactive web application classes
 │  │  └─👎 Condition Name: WebFluxAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.web.reactive.config.WebFluxConfigurer'
 │  │  └─👎 Condition Name: WebSessionIdResolverAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'reactor.core.publisher.Mono'
 │  │  └─👎 Condition Name: ErrorWebFluxAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.web.reactive.config.WebFluxConfigurer'
 │  │  └─👎 Condition Name: ClientHttpConnectorAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.web.reactive.function.client.WebClient'
 │  │  └─👎 Condition Name: WebClientAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.web.reactive.function.client.WebClient'
 │  │  └─👎 Condition Name: DispatcherServletAutoConfiguration.DispatcherServletConfiguration#multipartResolver
 │  │  │  └─⛔ Unmatched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnBean (types: org.springframework.web.multipart.MultipartResolver; SearchStrategy: all) did not find any beans of type org.springframework.web.multipart.MultipartResolver
 │  │  └─👎 Condition Name: ServletWebServerFactoryAutoConfiguration.ForwardedHeaderFilterConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnPropertyCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnProperty (server.forward-headers-strategy=framework) did not find property 'server.forward-headers-strategy'
 │  │  └─👎 Condition Name: ServletWebServerFactoryConfiguration.EmbeddedJetty
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required classes 'org.eclipse.jetty.server.Server', 'org.eclipse.jetty.util.Loader', 'org.eclipse.jetty.webapp.WebAppContext'
 │  │  └─👎 Condition Name: ServletWebServerFactoryConfiguration.EmbeddedUndertow
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required classes 'io.undertow.Undertow', 'org.xnio.SslClientAuthMode'
 │  │  └─👎 Condition Name: WebMvcAutoConfiguration#hiddenHttpMethodFilter
 │  │  │  └─⛔ Unmatched Condition: OnPropertyCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnProperty (spring.mvc.hiddenmethod.filter.enabled) did not find property 'enabled'
 │  │  └─👎 Condition Name: WebMvcAutoConfiguration.ProblemDetailsErrorHandlingConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnPropertyCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnProperty (spring.mvc.problemdetails.enabled=true) did not find property 'enabled'
 │  │  └─👎 Condition Name: WebMvcAutoConfiguration.ResourceChainCustomizerConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnEnabledResourceChainCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnEnabledResourceChain did not find class org.webjars.WebJarAssetLocator
 │  │  └─👎 Condition Name: WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter#beanNameViewResolver
 │  │  │  └─⛔ Unmatched Condition: OnBeanCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnMissingBean (types: org.springframework.web.servlet.view.BeanNameViewResolver; SearchStrategy: all) found beans of type 'org.springframework.web.servlet.view.BeanNameViewResolver' beanNameViewResolver
 │  │  └─👎 Condition Name: WebServicesAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.ws.transport.http.MessageDispatcherServlet'
 │  │  └─👎 Condition Name: WebServiceTemplateAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.oxm.Marshaller'
 │  │  └─👎 Condition Name: WebSocketReactiveAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnWebApplicationCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnWebApplication did not find reactive web application classes
 │  │  └─👎 Condition Name: WebSocketMessagingAutoConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer'
 │  │  └─👎 Condition Name: WebSocketServletAutoConfiguration.JettyWebSocketConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'org.eclipse.jetty.websocket.jakarta.server.config.JakartaWebSocketServletContainerInitializer'
 │  │  └─👎 Condition Name: WebSocketServletAutoConfiguration.UndertowWebSocketConfiguration
 │  │  │  └─⛔ Unmatched Condition: OnClassCondition
 │  │  │  └─ 🛈 Message: @ConditionalOnClass did not find required class 'io.undertow.websockets.jsr.Bootstrap'
 │  └─✅ Unconditional Classes: 
 │  │  └─✅ Class: org.springframework.boot.autoconfigure.context.ConfigurationPropertiesAutoConfiguration
 │  │  └─✅ Class: org.springframework.boot.actuate.autoconfigure.availability.AvailabilityHealthContributorAutoConfiguration
 │  │  └─✅ Class: org.springframework.boot.autoconfigure.ssl.SslAutoConfiguration
 │  │  └─✅ Class: org.springframework.boot.actuate.autoconfigure.info.InfoContributorAutoConfiguration
 │  │  └─✅ Class: org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration
 │  │  └─✅ Class: org.springframework.boot.autoconfigure.context.LifecycleAutoConfiguration
 │  │  └─✅ Class: org.springframework.boot.actuate.autoconfigure.metrics.integration.IntegrationMetricsAutoConfiguration
 │  │  └─✅ Class: org.springframework.boot.actuate.autoconfigure.endpoint.EndpointAutoConfiguration
 │  │  └─✅ Class: org.springframework.boot.actuate.autoconfigure.web.server.ManagementContextAutoConfiguration
 │  │  └─✅ Class: org.springframework.boot.actuate.autoconfigure.health.HealthContributorAutoConfiguration
 │  │  └─✅ Class: org.springframework.boot.actuate.autoconfigure.endpoint.jackson.JacksonEndpointAutoConfiguration
 │  │  └─✅ Class: org.springframework.boot.autoconfigure.availability.ApplicationAvailabilityAutoConfiguration
 │  │  └─✅ Class: org.springframework.boot.autoconfigure.info.ProjectInfoAutoConfiguration

```