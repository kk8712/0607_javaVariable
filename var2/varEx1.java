package org.java.var2;

public class varEx1 {

	public static void main(String[] args) {
		System.out.println("����, ����ȯ, ������");
		
		int i=10;
		char ch = 'a';
		

		ClassBasic c1 = new ClassBasic();
//		String str1 = new string();
		//��������� Ÿ��(Ŭ����)
				VarSub v1= new VarSub();
				v1.num1 = 100;
				v1.num2 = 200;
				v1.sum();
				v1.method(300, 500);
				
				String str1=new String();
				str1="���ڿ� ��ü�� �ڷ���";
				System.out.println(str1);
				
				System.out.println(i +" "+ ch+"" + c1+" " + v1.num2);
				
	}
}
