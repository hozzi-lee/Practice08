package com.javaex.ex03;

public class Point {
	
	// field
	private int x;
	private int y;
	
	
	// constructors
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// method
	//toString()을 작성 하세요
	public String toString() {
		return "[포인트] x:" + x + ", y:" + y + " 입니다.";
	}

}
