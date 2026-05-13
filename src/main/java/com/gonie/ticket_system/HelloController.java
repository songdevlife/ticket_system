package com.gonie.ticket_system;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloController {
    
    // @GetMapping("/hello")
    // public String hello() {
    //     return "Hello Gonie";
    // }

    @GetMapping("/hello")
    public String hello(){
        return "Hello Gonie";
    }
    
}
