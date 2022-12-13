package com.develhope.Interceptor.Middleware2.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.HandlerInterceptor;


@RestController
@RequestMapping(value = "")
public class BasicController implements HandlerInterceptor {

    @GetMapping("")
    public String sayHello(){
        return "Benvenuto nel localhost 8080";
    }


}
