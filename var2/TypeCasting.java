package org.java.var2;

public class TypeCasting {
	
	public static void main(String[] args) {
		//int �� �Ʒ� Ÿ�� ����� �ڵ����� int������ ����ȯ��.
		byte b1 = 10;
		byte b2 = 20;
		
		int i = b1+b2;
		//byte + byte = int + int
		byte b3 = (byte)(b1+b2);//���� ����ȯ
		
		System.out.println(b3);
		System.out.println(i);
		
		// ���� ũ�Ⱑ �ٸ� Ÿ���� ����� �뷮�� ū ���� Ÿ������ ���� ��ȯ��
		int i2 =10;
		double d=1.1;
		double d2 = i2 + d;
		int i22=(int)(i2+d);//���� ����ȯ
		System.out.println(d2);
		System.out.println(i22);
		
		int i3 = i2 +(int)d;
		int i4 = (int)(i2+d);
		
		System.out.println("i3��"+i3);
		System.out.println("i4��"+i4);
		
		float f1 = 1.3f;
		float f2 = 2.4f;
		float f3 = f1+f2;
		float f4 = (float)(f1+f2);
		System.out.println(f3);
		System.out.println(f4);
	}
}
