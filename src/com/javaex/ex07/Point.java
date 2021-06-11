package com.javaex.ex07;

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
	//equals() 메소드를 작성하세요.
	public boolean equals(Point point) {
		return this.x == point.x;
	}

	// or
	/*
	public boolean equals(Object obj) {
		return this.x == ((Point)obj).x;
	}
	 */
}
