package com.bishe2.bishe2.web1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Hello1Controller {
    @GetMapping("/hello1")
    public String hello() {
        return "hello";
    }
}
