package com.learning;

import com.learning.request.Server;
import com.learning.transcational.DummyService;
import com.learning.transcational.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Access;

@SpringBootApplication(exclude = {
        SecurityAutoConfiguration.class
})

@RestController
public class JavaBootApplication implements CommandLineRunner {

    @Autowired
    DummyService service;

    public static void main(String[] args) {
        SpringApplication.run(JavaBootApplication.class, args);
    }

    @GetMapping(value = "/welcome")
    private String welcome(){
        return "The api is running";
    }

    @Override
    public void run(String... args) throws Exception {
        Server server=new Server();
        System.out.println(server.hashCode());
        //server=null;
       // System.gc();
        System.out.println("end of garbage collection");
        service.saveObj();
    }
}
