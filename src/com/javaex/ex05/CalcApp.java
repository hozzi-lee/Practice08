package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String numLine = scan.nextLine();
		String[] numArray = numLine.split(" ");

		/* 출력 확인
		for (int i = 0; i < numArray.length; i++) {
			System.out.println(numArray[i]);
		}
		 */
		
		

		int result;
		int a = Integer.parseInt(numArray[0].substring(0));
		int b = Integer.parseInt(numArray[2].substring(0));

		CalculateExtends[] calc = {
				new Add(),
				new Sub(),
				new Mul(),
				new Div()
			};
			
			for (int i = 0; i < calc.length; i++) {
				calc[i].setValue(a, b);
				
				if ( numArray[1].equals("+") ) {
					 System.out.println(calc[0].calculate());
//					result = a + b;
//					System.out.println(result);
				}else if ( numArray[1].equals("-") ) {
//					 System.out.println(***.Sub());
					if ( a >= b ) {
						result = a - b;
					} else {
						result = b - a;
					}
					System.out.println(result);
				}else if ( numArray[1].equals("*") ) {
//					 System.out.println(***.Mul());
					result = a * b;
					System.out.println(result);
				}else if ( numArray[1].equals("/") ) {
//					 System.out.println(***.Div());
					if ( a >= b ) {
						result = a / b;
					} else {
						result = b / a ;
					}
					System.out.println(result);
				}else if ( numLine.equals("/q") ) {
					System.out.println("종료합니다.");
				}else {
					System.out.println("알 수 없는 연산입니다.");
				}

				
			}
			
		
		
		scan.close();

	}

}
