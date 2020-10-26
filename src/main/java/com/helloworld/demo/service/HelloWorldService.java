package com.helloworld.demo.service;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class HelloWorldService {

    public Mono<String> hello() {
        return Mono.just("Hello World");
    }

    public Mono<String> helloMe(String name) {
        return Mono.just("Hello " + name);
    }
}
