package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.CellDataDTO;
import com.example.mapper.CalceMapper;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CalceService {

	@Autowired
	CalceMapper calceMapper;
	
	
	
	public List<CellDataDTO> test(){
		List<CellDataDTO> list = calceMapper.test();
		return list;
	}
	
	public String hello() {
		return "hello";
	}
}
