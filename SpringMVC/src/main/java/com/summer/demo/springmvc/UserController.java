package com.summer.demo.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping(value = "/user/hello")
    public String sayHello(){
        System.out.println("the firstly demo of spring MVC");
        return "WEB-INF/view/hello.jsp";
    }

}
