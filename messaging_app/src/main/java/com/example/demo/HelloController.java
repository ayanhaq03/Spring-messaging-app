package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {

    // GET method - Returns "Hello from BridgeLabz"
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from BridgeLabz";
    }
   
    
   
}
