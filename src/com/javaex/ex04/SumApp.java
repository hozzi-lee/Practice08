package com.javaex.ex04;

import java.util.Scanner;

public class SumApp {

	public static void main(String[] args) {

		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 공백으로 구분해서 입력하세요");
		String numLine = sc.nextLine();

		//		int a = 49;
		//		System.out.println((char)a);

		//코드를 작성하세요
		String[] numArray = numLine.split(" ");

		for ( int i = 0; i < numArray.length; i++ ) {
			/* 이런 저런 시도... Try Try Try...
			System.out.println(numArray[i]);

			int num = numArray[i].charAt(0); --> 입력된 숫자로 만든 배열에서 i번째의 첫번째 자리만(두자리입력시 앞에만 선택됨) char형 이라서 int형으로 변환하면 아스키값으로 숫자가 엄청 커지거나 작아짐.
			String num = numArray[i].substring(0); --> 입력된 숫자로 만든 배열에서 i번째 배열 모든요소를 String형으로 출력, int형으로 변경하지 못함

			sum += num; --> char형은 아스키 값으로 더해지고 String형은 오류.

			System.out.println(num); // 두 시도 모두 출력은 같음

			sum += (int)(numArray[i].charAt(0)); --> int num과 같음...바보짓..
			 */

			// 구글검색...
			int num = Integer.parseInt(numArray[i].substring(0)); // 문자열에 있는 숫자를 int형으로 변환
			sum += num;
			System.out.println(num);
		}
		// java책 + 구글검색...
		/*
		for (String lang : numArray) { // 변수(lang)에는 배열(strArray)의 각 요소(String형)가 대입됨
			int num = Integer.parseInt(lang); // 문자열에 있는 숫자를 int형으로 변환
			sum += num;
			System.out.println(lang);
		}
		 */

		System.out.println("합:" + sum);

		sc.close();
	}

}
