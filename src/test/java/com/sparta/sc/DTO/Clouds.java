package com.sparta.sc.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Clouds{

	@JsonProperty("all")
	private int all;

	public int getAll(){
		return all;
	}
}