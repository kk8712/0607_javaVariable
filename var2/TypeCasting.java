package org.java.var2;

public class TypeCasting {
	
	public static void main(String[] args) {
		//int 형 아래 타입 연산시 자동으로 int형으로 형변환됨.
		byte b1 = 10;
		byte b2 = 20;
		
		int i = b1+b2;
		//byte + byte = int + int
		byte b3 = (byte)(b1+b2);//강제 형변환
		
		System.out.println(b3);
		System.out.println(i);
		
		// 형의 크기가 다른 타입의 연산시 용량이 큰 형의 타입으로 강제 변환됨
		int i2 =10;
		double d=1.1;
		double d2 = i2 + d;
		int i22=(int)(i2+d);//강제 형변환
		System.out.println(d2);
		System.out.println(i22);
		
		int i3 = i2 +(int)d;
		int i4 = (int)(i2+d);
		
		System.out.println("i3은"+i3);
		System.out.println("i4는"+i4);
		
		float f1 = 1.3f;
		float f2 = 2.4f;
		float f3 = f1+f2;
		float f4 = (float)(f1+f2);
		System.out.println(f3);
		System.out.println(f4);
	}
}
