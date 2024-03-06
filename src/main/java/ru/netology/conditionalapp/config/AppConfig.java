package ru.netology.conditionalapp.config;

import org.springframework.context.annotation.Bean;
import ru.netology.conditionalapp.DevProfile;
import ru.netology.conditionalapp.ProductionProfile;
import ru.netology.conditionalapp.SystemProfile;

public class AppConfig {
    @Bean
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    public SystemProfile productionProfile() {
        return new ProductionProfile();
    }
}
