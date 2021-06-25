package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.service.CalceService;

@SpringBootTest
class OrgTestApplicationTests {

	@Test
	void contextLoads() {
		CalceService service = new CalceService();
		System.out.println(service.hello());
	}

}
