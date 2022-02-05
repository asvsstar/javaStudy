package com.it.main;
// 단한연산자
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 증감연산자 (++,--) => 한개 증가, 한개 감소 => 조회수, 반복문
		// 전치연산자 ++변수, 후치연산자 변수++
		// 증가가 먼저 나중에 다른 연산 수행, 다른 연산자 수행 나중에 증가
		int a=10;
		int b=++a; //a=11, b=11
		System.out.println("a="+a+",b="+b);
		
		//초기화
		a=10;
		b=a++;
		System.out.println("a="+a+",b="+b);
		
		char c='A';
		System.out.println(c++);
		System.out.println(c);
		System.out.println(++c);
		
	}

}
