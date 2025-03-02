package config;

import components.Computer;
import components.Smartphone;
import components.Laptop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = {"components","layers"})
public class AppConfig {

    @Bean
    @Lazy
    public Computer computerLazy() {
        return new Computer("Windows 11", 16);
    }

    @Bean
    public Computer computerEager() {
        return new Computer("Linux Ubuntu", 32);
    }
}