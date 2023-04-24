package net.javaguides.springbootrestapi.controller;

//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//tell this Spring MVC controller
//@Controller
//this return as json
//@ResponseBody

@RestController
//berisi baik Controller dan Response body (2 perintah ditulis untuk pengingat saja)
public class HelloWorldController {
//  HTTP GET Result
//  http://localhost:8080/hello-world

//mapping to handler
    @GetMapping("/hello-world")
    public String helloWorld(){
        return "Hello World";
    }
    /*
    lainnya: Post, Put, Delete
     */
}
