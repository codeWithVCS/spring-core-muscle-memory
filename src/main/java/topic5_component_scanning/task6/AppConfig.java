package topic5_component_scanning.task6;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        basePackages = "topic5_component_scanning.task6",
        includeFilters = @ComponentScan.Filter(
                type = FilterType.ANNOTATION,
                classes = org.springframework.stereotype.Service.class
        ),
        excludeFilters = @ComponentScan.Filter(
                type = FilterType.ASSIGNABLE_TYPE,
                classes = topic5_component_scanning.task6.BetaComponent.class
        )
)
public class AppConfig {
}
