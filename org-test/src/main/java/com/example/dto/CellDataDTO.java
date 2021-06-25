package com.example.dto;

import org.apache.ibatis.type.Alias;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Alias("CellData")

@Getter
@Setter
@ToString
public class CellDataDTO {

	private String seq;
	private String type_seq;
	private String data_point;
	private String test_time;
	private String date_time;
	private String step_time;
	private String step_Index;
	private String cycle_Index;
	private String current;
	private String voltage;
	private String charge_capacity;
	private String discharge_capacity;
	private String charge_energy;
	private String discharge_energy;
	private String dv_dt;
	private String internal_resistance;
	private String is_fc_data;
	private String ac_impedance;
	private String aci_phase_angle;
	private String temperature_1;
	private String temperature_2;
	
	private Long minCurrent;
	
}
