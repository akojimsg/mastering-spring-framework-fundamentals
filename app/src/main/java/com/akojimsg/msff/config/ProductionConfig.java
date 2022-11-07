package com.akojimsg.msff.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Profile("prod")
@Configuration
@ComponentScan("com.akojimsg.msff")
@PropertySource("classpath:application-prod.properties")
public class ProductionConfig {
}
