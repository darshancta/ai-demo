package com.example.ai.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    Logger log = LoggerFactory.getLogger(TestController.class);


    @GetMapping("/test")
    public String test() {
        log.info("in test controller");
         return "Test controller";
    }
}
