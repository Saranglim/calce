package com.example.dto;

import org.apache.ibatis.type.Alias;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Alias("CellSampleDump")

@Getter
@Setter
@ToString
public class CellSampleDump2DTO {

	private String seq;
	private String group_code;
	private String sample_code;
	private String depth1;
	private String depth2;
	private String depth3;
	private String sample_file_name;
	private String row_count;
	private String temperature1_yn;
	private String current_min;
	private String current_max;
	private String voltage_min;
	private String voltage_max;
	private String charge_capacity_max;
	private String discharge_capacity_min;
	private String temperature1_min;
	private String temperature2_min;

}
