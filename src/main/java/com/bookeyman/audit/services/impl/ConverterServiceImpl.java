package com.bookeyman.audit.services.impl;

import com.bookeyman.audit.services.ConverterService;
import lombok.AllArgsConstructor;

import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ConverterServiceImpl implements ConverterService {

    private final ConversionService conversionService;

    @Override
    public <T> T convert(Object source, Class<T> targetType) {
        return conversionService.convert(source, targetType);
    }
}
