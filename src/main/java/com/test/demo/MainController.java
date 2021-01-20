package com.test.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/getVideo")
    public String getVideoLink() {
        return "https://www.youtube.com/watch?v=-l61NE0eqkw";
    }
}
