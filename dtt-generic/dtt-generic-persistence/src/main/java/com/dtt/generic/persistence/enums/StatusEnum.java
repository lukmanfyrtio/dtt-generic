package com.dtt.generic.persistence.enums;
public enum StatusEnum {
	
	LIVE("L"),
	DELETED("D");
	
	
	private String name;
	
	StatusEnum(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
}