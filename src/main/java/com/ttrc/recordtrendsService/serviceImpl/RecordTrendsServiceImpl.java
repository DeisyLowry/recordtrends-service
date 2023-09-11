package com.ttrc.recordtrendsService.serviceImpl;

import com.ttrc.recordtrendsService.dto.RecordTrendsDto;
import com.ttrc.recordtrendsService.entity.RecordTrends;
import com.ttrc.recordtrendsService.repository.RecordTrendsRepository;
import com.ttrc.recordtrendsService.service.RecordTrendsService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@AllArgsConstructor
@NoArgsConstructor
@Slf4j

public class RecordTrendsServiceImpl implements RecordTrendsService {

    @Autowired
    private RecordTrendsRepository recordTrendsRepository;

   // @Autowired
    //private ModelMapper modelMapper;

    @Override
    //public List<RecordTrendsDto> getAllRecordTrends() {
    public List<RecordTrends> getAllRecordTrends() {
        List<RecordTrends> recordTrends = recordTrendsRepository.findAll();
      /*  List<RecordTrendsDto> dtos = recordTrends
                .stream()
                .map(recordTrend -> modelMapper.map(recordTrend, RecordTrendsDto.class))
                .collect(Collectors.toList());

        //List<User> users = userRepository.findAll();
        List<UserDto> dtos = users
                .stream()
                .map(user -> modelMapper.map(user, UserDto.class))
                .collect(Collectors.toList());


     */
        return recordTrends;

    }



}
