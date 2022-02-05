package com.it.main;
// 비교연산자 / 논리연산자 / 대입연산자
// 부정연산자, 비교연산자, 논리연산자 => 결과값 (boolean) : true/false => 조건문에서 주로 사용
// if()
// 비교연산자 : ==(같다), !=(같지 않다), <(작다), >(크다), <=(작거나같다), >=(크거나같다)
// 숫자 비교 가능 (문자열은 비교(X)) => id =="admin" => 문자열 자체가 주소
// 논리연산자 ( &&=> 기간이나 범위에 포함 ,|| => 범위를 벗어난 경우 )
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bCheck=10==9;
		System.out.println(bCheck);//check
		bCheck=10!=9;
		System.out.println(bCheck);

		bCheck=10<9;
		System.out.println(bCheck);
		bCheck=10>9;
		System.out.println(bCheck);

		bCheck=10<=9;
		System.out.println(bCheck);
		bCheck=10>=9;
		System.out.println(bCheck);

 
				

	}

}
