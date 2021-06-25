package com.example.service;

import org.springframework.stereotype.Service;

import com.example.mapper.SampleMapper;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class SampleService {

    private final SampleMapper sampleMapper;

    public SampleService(SampleMapper sampleMapper) {
        this.sampleMapper = sampleMapper;
    }
}
