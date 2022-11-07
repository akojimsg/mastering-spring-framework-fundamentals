package com.akojimsg.msff;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.akojimsg.msff")
@PropertySource("classpath:application.properties")
public class AppConfig {
}
