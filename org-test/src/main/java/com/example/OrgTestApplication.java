package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.dto.CellDataDTO;
import com.example.service.CalceService;

@SpringBootApplication
public class OrgTestApplication {
	
	public static void main(String[] args) {			
		SpringApplication.run(OrgTestApplication.class, args);
		CalceService service = new CalceService();
		
		
		//조회
		List<CellDataDTO> list = service.test();
		
		//업데이트
		
		
		
	}
	
}
