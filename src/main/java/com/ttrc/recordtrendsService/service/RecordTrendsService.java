package com.ttrc.recordtrendsService.service;

import com.ttrc.recordtrendsService.dto.RecordTrendsDto;
import com.ttrc.recordtrendsService.entity.RecordTrends;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RecordTrendsService {

    //List<RecordTrendsDto> getAllRecordTrends();
    List<RecordTrends> getAllRecordTrends();
}
