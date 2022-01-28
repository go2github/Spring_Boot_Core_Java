package com.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = {
        SecurityAutoConfiguration.class
})

@RestController
public class JavaBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaBootApplication.class, args);
    }

    @GetMapping(value = "/welcome")
    private String welcome(){
        return "The api is running";
    }

}
