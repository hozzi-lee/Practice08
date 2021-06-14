package com.javaex.ex05;

public class Mul extends CalculateExtends {

	private int a;
	private int b;

	public Mul(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void setValue(int a, int b) {
	}

	public int calculate() {
		int result;
		result = a * b;
		return result;
	}

}
