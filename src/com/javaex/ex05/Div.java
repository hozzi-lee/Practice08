package com.javaex.ex05;

public class Div extends CalculateExtends {

	private int a;
	private int b;

	public Div(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void setValue(int a, int b) {
	}

	public int calculate() {
		int result;
		if ( a >= b ) {
			result = a / b;
		} else {
			result = b / a ;
		}
		return result;
	}

}
