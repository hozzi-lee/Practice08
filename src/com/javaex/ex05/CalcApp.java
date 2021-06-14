package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String numLine = scan.nextLine();
		String[] numArray = numLine.split(" ");

		int a = Integer.parseInt(numArray[0].substring(0));
		int b = Integer.parseInt(numArray[2].substring(0));

		CalculateExtends[] calc = {
				new Add(a, b),
				new Sub(a, b),
				new Mul(a, b),
				new Div(a, b)
		};

		for (int i = 0; i < calc.length; i++) {
			//			calc[i].setValue(a, b);
			//			continue;

			if ( numArray[1].equals("+") ) {
				System.out.println(calc[0].calculate());
				break;
			}else if ( numArray[1].equals("-") ) {
				System.out.println(calc[1].calculate());
				break;
			}else if ( numArray[1].equals("*") ) {
				System.out.println(calc[2].calculate());
				break;
			}else if ( numArray[1].equals("/") ) {
				System.out.println(calc[3].calculate());
				break;
			}else if ( numLine.equals("/q") ) {
				System.out.println("종료합니다.");
				break;
			}else {
				System.out.println("알 수 없는 연산입니다.");
				break;
			}

		}

		scan.close();

	}

}
