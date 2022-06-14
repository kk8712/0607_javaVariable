package org.java.var2;

import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
		System.out.println("scanner");
		System.out.println("정수형 숫자를 입력하세요");

		System.out.println("숫자 입력");
		// new 객체 생성 연산자 (객체의 주소값)
		Scanner sca = new Scanner(System.in);
		int i1 = sca.nextInt();
		System.out.println("숫자 입력값 " + i1);
		System.out.println("2번 숫자 입력");
		int i2 = sca.nextInt();
		System.out.println("2번 숫자 입력값" + i2);

		System.out.println(i1 + "+" + i2 + "=" + (i1 + i2));
		System.out.println(i1 + "-" + i2 + "=" + (i1 - i2));
		System.out.println(i1 + "/" + i2 + "=" + (i1 / i2));
		System.out.println(i1 + "*" + i2 + "=" + (i1 * i2));

		System.out.println("연산자를 입력해 보세요.");
		String str = sca.next(); // 문자열을 입력

		System.out.println("입력할 연산자 : " + str);

		sca.close();
	}
}
