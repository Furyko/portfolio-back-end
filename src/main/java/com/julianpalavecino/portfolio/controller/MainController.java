package com.julianpalavecino.portfolio.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import java.util.*;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:8080"})
public class MainController {

    @GetMapping("/")
    public Map<String, String> getEndpoints() {
        Map<String, String> endpoints = new HashMap<>();

        endpoints.put("About Me", "/about-me/all");
        endpoints.put("Contacts", "/contact/all");
        endpoints.put("Experiences", "/experience/all");
        endpoints.put("Extra experiences", "/extra-project/all");
        endpoints.put("Knowledge", "/knowledge/all");
        endpoints.put("Study", "/study/all");
        endpoints.put("User", "/user/all");

        return endpoints;
    }
}

