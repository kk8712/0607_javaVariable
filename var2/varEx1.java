package org.java.var2;

public class varEx1 {

	public static void main(String[] args) {
		System.out.println("변수, 형변환, 연산자");
		
		int i=10;
		char ch = 'a';
		

		ClassBasic c1 = new ClassBasic();
//		String str1 = new string();
		//사용자정의 타입(클래스)
				VarSub v1= new VarSub();
				v1.num1 = 100;
				v1.num2 = 200;
				v1.sum();
				v1.method(300, 500);
				
				String str1=new String();
				str1="문자열 객체형 자료형";
				System.out.println(str1);
				
				System.out.println(i +" "+ ch+"" + c1+" " + v1.num2);
				
	}
}
