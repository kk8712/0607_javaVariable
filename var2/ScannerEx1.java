package org.java.var2;

import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
		System.out.println("scanner");
		System.out.println("������ ���ڸ� �Է��ϼ���");

		System.out.println("���� �Է�");
		// new ��ü ���� ������ (��ü�� �ּҰ�)
		Scanner sca = new Scanner(System.in);
		int i1 = sca.nextInt();
		System.out.println("���� �Է°� " + i1);
		System.out.println("2�� ���� �Է�");
		int i2 = sca.nextInt();
		System.out.println("2�� ���� �Է°�" + i2);

		System.out.println(i1 + "+" + i2 + "=" + (i1 + i2));
		System.out.println(i1 + "-" + i2 + "=" + (i1 - i2));
		System.out.println(i1 + "/" + i2 + "=" + (i1 / i2));
		System.out.println(i1 + "*" + i2 + "=" + (i1 * i2));

		System.out.println("�����ڸ� �Է��� ������.");
		String str = sca.next(); // ���ڿ��� �Է�

		System.out.println("�Է��� ������ : " + str);

		sca.close();
	}
}
