package com.sumit.learning.spring.spring;

public class Triangle {

	private String type;

	public void draw() {
		System.out.println(getType() + "   trangle drawn");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
