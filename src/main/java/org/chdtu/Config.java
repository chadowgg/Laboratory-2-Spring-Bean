package org.chdtu;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:myApp.properties")
public class Config {
    public static void main(String[] args) {
    }
}
