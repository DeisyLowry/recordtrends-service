package com.ttrc.recordtrendsService.controller;

import com.ttrc.recordtrendsService.dto.RecordTrendsDto;
import com.ttrc.recordtrendsService.entity.RecordTrends;
import com.ttrc.recordtrendsService.service.RecordTrendsService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@AllArgsConstructor
@NoArgsConstructor
@RequestMapping("api/v1/recordtrends")
public class RecordTrendsController {

    @Autowired
    RecordTrendsService recordTrendsService;

    // Port is http://localhost:3000/api/v1/recordtrends/test
    // Test API
    @GetMapping("/test")
    public String test() {
        return "Hello Test Inside";
    }


    // Crud APIS

    // @GetMapping
    // Build Get one User by Id REST API
    // http://localhost:8080/api/v1/users
    // Post RequestBody contains the information
    @GetMapping
    public ResponseEntity<List<RecordTrends>> getAllRecordTrends(){
        List<RecordTrends> retRecordsTrends = recordTrendsService.getAllRecordTrends();
        return new ResponseEntity<>(retRecordsTrends, HttpStatus.OK);
    }
}