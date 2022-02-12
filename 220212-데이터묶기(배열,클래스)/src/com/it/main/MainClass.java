package com.it.main;
// 여러개의 데이트를 모아서 관리
/*
 * ----------------------------------------------
 * 같은 데이터형 (정수,실수,문자, 문자열) => 배열 (1차원 배열)
 * 다른 데이터형 (정수+문자열+실수) => 클래스
 * ---------------------------------------------- 저장공간의 이름을 한개로 제어
 * 데이터 + 명령문 (메소드) 
 * ---------------------------------------------- 한개의 부품 제작
 * 자바 : CBD
 * 		-- Component (부품) -- 조립 (레고)
 * 
 * 배열 (고정적) => 가변경 변경 (클래스 => 컬렉\
 * 	1) 여러개의 데이터를 한곳에 모아서 처리
 * 	2) 고정적 (저장갯수를 수정하기 어렵다)
 * 	3) 같은 데이터만 모아서 사용
 * 	4) 연속적인 메모리 구졸
 *	5) 배열선	언
 *		  데이터형[] 배열명;
 *		데이터형 배열명[]; => C언어
 *	6) 초기값
 *		배열명 = new 데이터형[5]; => 자동 최화	
 *								int => 0, double => 0.0; boolen => false
 *		예)
 *			String s1="Hello";
 *			String s2 He o";
 *			String s3=new String("Hello");
 *		배열명 = {값,값,값...}
 *	9) 출력, 값변경
 *		출력시 사용되는 제어문 : For-each
 *		for(데이터형 변수 : 배열,컬렉션)
 *		{
 *			//브라우저에서 출력시 가장 많이 사용 for => 출력용
 *		}
 *		값변경
 *		-----
 *		1. 직접 값 입력
 *		2. 입력값ㅇ르 받서 대입
 *		3. 임의의 값을 받아서 대입 (난수) => 로또
 *
 */

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for - each
		int[] arr =new int[5];
		/*
		 * 	arr=100
		 *   ----------------------------------------------
		 * 		0		0				0			0		0
		 *  |-------|------------|----------|-----------|-------|----------
		 * arr+0  	  arr+1	  	arr+2    arr+3  	   arr+4
		 * arr+0*4 	  arr+1*4	arr+2*4	 arr3*4		   arr+4*4
		 * 100	  	  104		108		 112		   116
		 * arr[0]	  arr[1]	arr[2]   arr[3]		   arr[4]
		 * 연속적이기 때문에 인덱스번호 0번호 ~ 순차적으로 지정 ==> 반복문 사용이 좋다
		 * *** 배열의 갯수 => 배열명.length
		 */
		//1. 배열에 값을 설정
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
			/*
			 * 	random() => 0.0 ~ 0.99
			 * 0.0~0.99 => *100 ==> (int)0.0 ~99.0 => 0~99+1 => 1~100
			 */
		}
		// 저장된 값을 확인 => for-each
		for(int i:arr) // 실제로 저장된 값을 가지고 온다 ( 같거나 큰 데이터형을 이용한다)
		{
			// 배열 : int ==> int, long, double
			System.out.println(i+" ");
		}
	}

}
