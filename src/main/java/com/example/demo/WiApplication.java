package com.example.demo;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
public class WiApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(WiApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }
}
