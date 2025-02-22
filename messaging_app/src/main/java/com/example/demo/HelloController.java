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
   
    // Handles GET requests to /hello/query with a name parameter
    @GetMapping("/query")
    public String sayHelloWithName(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }
   
}
