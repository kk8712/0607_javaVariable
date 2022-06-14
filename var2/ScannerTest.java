package org.java.var2;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		final double PI =3.14;
		System.out.println("원의 반지름을 입력하세요");
		Scanner scn =new Scanner(System.in);
		int d1=scn.nextInt();
		/*double radius=d1*d1*PI;*/
		int radius=(int)(d1*d1*PI);
		System.out.println("반지름의 길이는"+d1+"입니다.");
		System.out.println("원의 넓이는"+radius+"입니다.");
		
		scn.close();
	}
}
