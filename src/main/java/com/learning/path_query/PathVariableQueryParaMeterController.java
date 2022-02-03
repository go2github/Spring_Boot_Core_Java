package com.learning.path_query;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class PathVariableQueryParaMeterController {

    @GetMapping("/test/{id}")
    private void pathVariable(@PathVariable String id){

        System.out.println(id);

    }
    //default required value is true
    @GetMapping("/demo")
    private void pathVariable(@RequestHeader Map<String,String> header, @RequestParam(required = true ,defaultValue = "defaaault value") String id){

        System.out.println(id);

    }
}
