package proba.demo;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ImportResource({
        "classpath*:/rest_config.xml"
})
@ComponentScan(basePackages = org.rest")
@PropertySource({
        "classpath:rest.properties",
        "classpath:web.properties"
})
public class DemoConfiguration {

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
