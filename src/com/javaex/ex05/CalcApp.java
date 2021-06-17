package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {

		/*
		Scanner scan = new Scanner(System.in);
		System.out.print(">> ");
		String numLine = scan.nextLine();

		String[] numArray = numLine.split(" ");
		int a = Integer.parseInt(numArray[0].substring(0));
		int b = Integer.parseInt(numArray[2].substring(0));
		String calculate = numArray[1];
		int result;

		CalculateExtends[] calc = {
				new Add(a, b),
				new Sub(a, b),
				new Mul(a, b),
				new Div(a, b)
		};

		while (true) {
			if ( numLine.equals("/q") ) {
				System.out.println("종료합니다.");
				break;
			}else if ( calculate.equals("+") ) {
				System.out.println(calc[0].calculate());
				break;
			}else if ( calculate.equals("-") ) {
				System.out.println(calc[1].calculate());
				break;
			}else if ( calculate.equals("*") ) {
				System.out.println(calc[2].calculate());
				break;
			}else if ( calculate.equals("/") ) {
				System.out.println(calc[3].calculate());
				break;
			}else {
				System.out.println("알 수 없는 연산입니다.");
				break;
			}
		}
		 */

		///////// 위 /////////
			//// 비교 ////
		///////// 아래 /////////
		
		Scanner scan = new Scanner(System.in);
		int result;

		while (true) {

			System.out.print(">> ");
			String numLine = scan.nextLine();

			if ( numLine.equals("/q") ) {
				System.out.println("종료합니다.");
				break;
			}

			String[] numArray = numLine.split(" ");
			int a = Integer.parseInt(numArray[0].substring(0));
			int b = Integer.parseInt(numArray[2].substring(0));
			String calculate = numArray[1];

			switch(calculate) {
			case "+":  
				Add add = new Add(a, b);
				result = add.calculate();
				System.out.println(">> " + result);
				break;

			case "-":  
				Sub sub = new Sub(a, b);
				result = sub.calculate();
				System.out.println(">> " + result);
				break;

			case "*":  
				Mul mul = new Mul(a, b);
				result = mul.calculate();
				System.out.println(">> " + result);
				break;

			case "/":  
				Div div = new Div(a, b);
				result = div.calculate();
				System.out.println(">> " + result);
				break;

			default: 
				System.out.println("알 수 없는 연산입니다.");
				break;

			}
			break;

		}scan.close();

	}
}
