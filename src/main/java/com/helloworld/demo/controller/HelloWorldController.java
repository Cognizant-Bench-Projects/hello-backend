package com.helloworld.demo.controller;

import com.helloworld.demo.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping("/greeting")
    public Mono<String> hello() {
        return this.helloWorldService.hello();
    }

    @PostMapping("/greeting")
    public Mono<String> helloMe(@RequestParam String name) {
        return this.helloWorldService.helloMe(name);
    }
}
