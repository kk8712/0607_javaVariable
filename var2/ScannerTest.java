package org.java.var2;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		final double PI =3.14;
		System.out.println("���� �������� �Է��ϼ���");
		Scanner scn =new Scanner(System.in);
		int d1=scn.nextInt();
		/*double radius=d1*d1*PI;*/
		int radius=(int)(d1*d1*PI);
		System.out.println("�������� ���̴�"+d1+"�Դϴ�.");
		System.out.println("���� ���̴�"+radius+"�Դϴ�.");
		
		scn.close();
	}
}
