package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(path = "/api2")
public class TestController {
    Logger log = LoggerFactory.getLogger(TestController.class);

    @PostMapping(path = "/answer1")
    public String test1(HttpServletRequest request) {

        log.info("Request Received /api :");
        log.info("Verb: {}", request.getMethod());
        log.info("URL: {}", request.getRequestURL());
        log.info("Host: {}", request.getRemoteHost());

        return "Test success 1";
    }

    @GetMapping(path = "/answer2")
    public String test2(HttpServletRequest request) {

        log.info("Request Received /api :");
        log.info("Verb: {}", request.getMethod());
        log.info("URL: {}", request.getRequestURL());
        log.info("Host: {}", request.getRemoteHost());

        return "Test success 2";
    }

    @PutMapping(path = "/{id}")
    public String test3(HttpServletRequest request) {

        log.info("Request Received /api :");
        log.info("Verb: {}", request.getMethod());
        log.info("URL: {}", request.getRequestURL());
        log.info("Host: {}", request.getRemoteHost());

        return "Test success 3";
    }

    @GetMapping("/{id}/answer5")
    public String  findById2(
            @PathVariable long id, HttpServletRequest request) {


        log.info("Request Received /api :");
        log.info("Verb: {}", request.getMethod());
        log.info("URL: {}", request.getRequestURL());
        log.info("Host: {}", request.getRemoteHost());

        return "Test success 5";
    }

    @PostMapping("/{id}/answer6/{example}")
    public String  findById3(
            @PathVariable long id,
            @PathVariable String example,
            HttpServletRequest request) {
/*
        String body = "";

        log.info("Request Received /api :");
        log.info("Verb: {}", request.getMethod());
        log.info("URL: {}", request.getRequestURL());
        log.info("Host: {}", request.getRemoteHost());
        log.info(example);

        Enumeration<String> nameHeaders = request.getHeaderNames();
        while (nameHeaders.hasMoreElements()) {
            String name = nameHeaders.nextElement();
            Enumeration<String> valueHeaders = request.getHeaders(name);
            while (valueHeaders.hasMoreElements()) {
                String value = valueHeaders.nextElement();
                log.info("Key: {}, Value: {}", name, value);
            }
        }

        try {
            log.info("Body: ");
            body = request.getReader().lines().collect(Collectors.joining(System.lineSeparator()));
            log.info(body);
        } catch (Exception e) {
            log.info("Exception: {}", e.getMessage());
        }
*/


        return "Success";
    }


}
