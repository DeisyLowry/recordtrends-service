package com.ttrc.recordtrendsService.mapper;

import java.util.List;
import java.util.stream.Collectors;



import org.modelmapper.ModelMapper;

        import java.util.List;
        import java.util.stream.Collectors;

public class RecordTrendsModelMapper {

    private static ModelMapper modelMapper;


    public static <S, T> List<T> mapList(List<S> source, Class<T> targetClass) {
        return source
                .stream()
                .map(element -> modelMapper.map(element, targetClass))
                .collect(Collectors.toList());
    }
}