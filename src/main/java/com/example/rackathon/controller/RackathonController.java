package com.example.rackathon.controller;

import com.example.rackathon.engine.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/rak")
public class RackathonController {

    private final ApiService apiService;

    public RackathonController(ApiService apiService) {
        this.apiService = apiService;
    }

    @GetMapping(path = "/consumeSimpleUri")
    public String consumeApi(@RequestParam String uri) {
        return apiService.consume(uri);
    }
}
