package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(path = "/api2")
public class TestController2 {
    Logger log = LoggerFactory.getLogger(TestController2.class);

    @PostMapping(path = "/answer1")
    public String test1(HttpServletRequest request) {

        return "Test success 1";
    }

    @GetMapping(path = "/answer2")
    public String test2(HttpServletRequest request) {

        return "Test success 2";
    }

    @PutMapping(path = "/answer3")
    public String test3(HttpServletRequest request) {

        return "Test success 3";
    }


}
