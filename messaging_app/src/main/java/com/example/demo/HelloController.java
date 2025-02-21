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

    // POST method - Accepts a name and returns a personalized hello message
    @PostMapping("/hello")
    public String sayHelloPost(@RequestParam String name) {
        return "Hello, " + name + " from BridgeLabz!";
    }

    // PUT method - Updates and responds with a message
    @PutMapping("/hello")
    public String updateHello(@RequestParam String name) {
        return "Hello, " + name + "! Your greeting has been updated.";
    }

    // DELETE method - Deletes user and responds with a message
    @DeleteMapping("/hello")
    public String deleteHello(@RequestParam String name) {
        return "Goodbye, " + name + "! Your greeting has been deleted.";
    }
}
