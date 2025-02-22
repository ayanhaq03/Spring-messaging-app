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
    

    // Handles GET requests to /hello/param/{name} with a path variable
    @GetMapping("/param/{name}")
    public String sayHelloWithPath(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }
   
    

    @PostMapping("/post")
    public String sayHello(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz!";
    }
    
    // Handles PUT requests to /hello/put/{firstName} with a path variable and query parameter
    @PutMapping("/put/{firstName}")
    public String sayHelloWithPut(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
}
