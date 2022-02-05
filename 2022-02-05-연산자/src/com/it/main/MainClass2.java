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
		
		//부정연산자
		boolean bCheck=false;
		//예약일때 !예약일 ㅇ ㅏ니면 ==> 비활성화
//		while(true)
//		{
//			bCheck=!bCheck;
//			if(bCheck==true) {
//				System.out.println("사용자차례");
//			}
//			else
//			{
//				System.out.println("컴퓨터 차례");
//			}
//		}
//		//형변환 연산자
		int aa=(int)10.5; //강제 형변환
		System.out.println(aa);
		char cc='홍';
		System.out.println((int)cc);
		int aaa='A';
		System.out.println(aaa);
		// int <==> double => boolean은 형변환이 없다
		aaa=67;
		System.out.println((char)aaa);
		System.out.println((int)'0');
		/*
		 * 자바에서 숫자 표현
		 * 문자 => '문자한개'
		 * 문자열 => '여러문자"
		 * 숫자표현 : 
		 * 			10진번
		 * 			16진번 0xFF		//0x 붙음
		 * 			8진법  012 		// 0붙음
		 * 			2진법 0b01111111 // 0b붙음
		 */
		System.out.println(012);
		System.out.println(0xff);
		System.out.println(0b1111111);
	
	}

}
