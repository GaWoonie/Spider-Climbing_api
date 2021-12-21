package com.example.spider_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpiderController {
    @GetMapping("/hello")
    @ResponseBody
    public String helloworldString() {
        return "helloworld";
    }
    @GetMapping("/world")
    @ResponseBody
    public String worldString(){
        return "가나다라마바사";
    }

}
