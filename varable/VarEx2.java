package org.java.varable;

public class VarEx2 {
	public static void main(String[] args) {
		System.out.println("변수의 데이터 타입");


		//정수형 데이터
		//1byte=8bit 
		byte b = -128; 	 //1byte를 저장할수 있는 변수 b를 선언하고 127로 초기화 -128~127
		short s = 32767; //2byte를 저장할수 있는 변수 s를 선언하고 32767으로 초기화 -32,768~32,767
		int i = 10;		 //4byte를 저장할수 있는 변수 i를 선언하고 10으로 초기화  -2,147,483,648~2,147,483,647
		long l = 101;	 //8byte를 저장할수 있는 변수 l를 선언하고 10으로 초기화  -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807

		//실수형 데이터
		float f = 1.1f; //실수형 데이터 4byte를 저장 할수 있는f를 선언하고 1.1f처럼 f를 붙여 표기.
		double d = 1.23232323; //실수형 데이터 8byte를 저장 할수 있는d를 선언

		//문자형 데이터
		char c = 'a';  // 문자형 데이터 2byte를 저장 할수 있는 변수 ch를 선언하고 'a'로 초기화 했다.

		//논리형 데이터
		boolean bool = false; //boolean형 1byte를 저장 할수 있는 변수 bool을 선언하고 false로 초기화 했다.
		

	}
}