package com.sumit.learning.spring.spring;

public class Triangle {

	Point p1;
	Point p2;
	Point p3;

	public void draw() {
		System.out.println("First Point would be drwan at corndinate x = " + p1.getX() + " y = " + p1.getY());
		System.out.println("Second Point would be drwan at corndinate x = " + p2.getX() + " y = " + p2.getY());
		System.out.println("Third Point would be drwan at corndinate x = " + p3.getX() + " y = " + p3.getY());
	}

	public Point getP1() {
		return p1;
	}

	public void setP1(Point p1) {
		this.p1 = p1;
	}

	public Point getP2() {
		return p2;
	}

	public void setP2(Point p2) {
		this.p2 = p2;
	}

	public Point getP3() {
		return p3;
	}

	public void setP3(Point p3) {
		this.p3 = p3;
	}

}
