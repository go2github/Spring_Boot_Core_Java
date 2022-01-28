package com.learning.controller;

import com.learning.request.Server;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
//@ResponseBody
@RestController
public class ControllerVsRestController {




    //By default, Spring Boot RESTful Web service endpoints consume and produce JSON representation.
    // But we can easily make our RESTful Spring Boot Web service endpoints consume and
    // produce an XML representation of a resource as well.


//    To make our Spring Boot project consume and produce an XML representation of a resource,
//    we will need to add to our POM.xml one additional dependency.

    //https://appsdeveloperblog.com/consuming-xml-in-spring-boot-rest/#:~:text=By%20default%2C%20Spring%20Boot%20RESTful,of%20a%20resource%20as%20well

    //https://www.bezkoder.com/spring-boot-rest-xml/



    @RequestMapping(value = "/server",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_XML_VALUE)

    private Server getServerInfo(){
        System.out.println("server info");
        return new Server();
    }



    @RequestMapping(value = "/api/server/",method = RequestMethod.POST,
             produces = MediaType.APPLICATION_XML_VALUE,
            consumes = MediaType.APPLICATION_XML_VALUE
             )
    public Server serverModify(@RequestBody Server server){
        System.out.println("server info "+server);
        return server;
    }
}
