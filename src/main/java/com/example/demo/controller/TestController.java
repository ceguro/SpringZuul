package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.stream.Collectors;

@RestController
public class TestController {
    Logger log = LoggerFactory.getLogger(TestController.class);

    @RequestMapping(path = "/api", method = {})
    public String test(HttpServletRequest request) {

        // check values

        String body = "";

        /*log.info("Request Received /api :");
        log.info("Verb: {}", request.getMethod());
        log.info("URL: {}", request.getRequestURL());
        log.info("Host: {}", request.getRemoteHost());
        log.info("----- Headers ----");

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
        } catch (Exception e) {
            log.info("Exception: {}", e.getMessage());
        }

        return body;*/

        return null;
    }
}
