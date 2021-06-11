package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {

		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(5, 3);
		Point p4 = p1;

		System.out.println(p1 == p2);
		System.out.println(p2 == p3);
		System.out.println(p3 == p4);
		System.out.println(p4 == p1);		
		System.out.println(p1.equals(p2));
		System.out.println(p4.equals(p1));

		/*
		equals는 boolean형 메서드이고 Objcet.class에 포함되어 있다.
		Point로 생성된 instance값에 .을 입력하면 equals-Object가 나온다.

		instance값을 출력 해 보면 주소값이 나온다.
		따라서 == 연사자와 equals메서드는 주소값이 같은지 알아보는 것이다.
		Point클래스에 equals를 매개변수가 같다면~ 으로 재정의 해 준다면,
		p1과 p2를 비교 할 경우 true가 출력 된다. 하지만 ==연산자는 여전히 주소값을 비교한다.

		public boolean equals(Point point) {
		return (this.x == point.x) && (this.y == point.y);
		}

		or

		public boolean equals(Object obj) {
			return (this.x == ((Point)obj).x) && (this.y == ((Point)obj).y);
		}
		 */
	}

}


