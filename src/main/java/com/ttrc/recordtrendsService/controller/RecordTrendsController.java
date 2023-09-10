package com.ttrc.recordtrendsService.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
@RequestMapping("api/v1/recordtrends")
public class RecordTrendsController {

    // Port is http://localhost:3000/api/v1/recordtrends/test
    // Test API
    @GetMapping("/test")
    public String test() {
        return "Hello Test Inside";
    }
}