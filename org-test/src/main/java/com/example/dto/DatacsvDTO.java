package com.example.dto;

import org.apache.ibatis.type.Alias;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Alias("Datacsv")

@Getter
@Setter
@ToString
public class DatacsvDTO {

	private String step_time;
	private String current;
	private String voltage;
	private String charge_capacity;
	private String discharge_capacity;
	private String temperature_1;
}
