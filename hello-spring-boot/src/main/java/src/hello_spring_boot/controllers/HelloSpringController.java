package src.hello_spring_boot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringController {
    @GetMapping("/hello")
    String HelloSpringBoot() {
        return "Hello Spring Boot........";
    }
}
