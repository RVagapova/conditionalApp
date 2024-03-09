package ru.netology.conditionalapp.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.conditionalapp.model.DevProfile;
import ru.netology.conditionalapp.model.ProductionProfile;
import ru.netology.conditionalapp.model.SystemProfile;

@Configuration
public class AppConfig {

    @Bean
    @ConditionalOnProperty(prefix = "netology", name = "profile.dev", havingValue = "true")
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty(prefix = "netology", name = "profile.production", havingValue = "true")
    public SystemProfile productionProfile() {
        return new ProductionProfile();
    }
}
