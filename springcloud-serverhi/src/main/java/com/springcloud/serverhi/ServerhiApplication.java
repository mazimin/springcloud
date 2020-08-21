package com.springcloud.serverhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ServerhiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerhiApplication.class, args);
    }

    @GetMapping("/hi")
    public String home(@RequestParam String name) {
        return LocalDate.now() + ":" + name;
    }
}
