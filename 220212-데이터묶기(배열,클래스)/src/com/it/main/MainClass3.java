package com.it.main;
/*
 *  데이터 묶는 방법 => 	관련있는 데이터만 묶어서 사용
 *  			 	-------------
 *  				3명의 학생 => 국어, 영어, 수학
 *  				배열, 클래스
 * 	명령문을 묶어서 사용하는 방법 => 메소드
 * 	-------------------------------------------- 클래스(컴포넌트 => 부품)
 * 	메소드 : 기능 (변수를 제어하는 프로그램) => 연산자, 제어문
 * 	----- 재사용이 가능한 기능을 제작
 * 	----- 반복이 많은 경우 (반복 제거)
 * 	----- 구조적인 프로그램 제작 (단락) => 수정이 편리하게, 에러 처리
 * 	메소드 제작 방식 (4가지)
 * 	------------ 입력값(매개변수), 결과값(리턴형)
 * 	게산기 => 사용자 숫자2ㅐ => 결과값은 산술연산값
 * 	로그인 => id,pwd > boolean
 * 	아이디체크 => id => boolean
 * 	검색 => 사용자 : 검색어 ==> []
 * 
 * 사용자가 요청한 값을 이용해서 요청처리 => 처리결과를 보여준다.
 * ----------------------------------------------------------
 * 			리턴형(결과값)					매개변수(입력값)
 * ----------------------------------------------------------
 * 				O							O
 * ----------------------------------------------------------
 * 				O							X	=> Math.random()
 * ----------------------------------------------------------
 * 				X							o	=> void main(String[] arg)
 * 				==> 결과값이 없다 void
 * ----------------------------------------------------------
 * 				X							X	=> System.out.println()
 * ----------------------------------------------------------
 * 
 * 	1. 메소드 : 선언부 / 구현부
 * 						--------객체마다 따라  -----마지막
 * 		  => 종류 (static,instance,abstract,final)
 * 				  ------ 공유		  -------추상
 * 		선엄부
 * 		리턴형 메소드명(매개변수...)
 * 		{
 * 			구현부
 * 			return 결과값
 * 		}
 * 		예) 로그인 : id, pwd
 * 		boolean login(String id, String pwd)
 *		{
 * 			로그인처리
 * 			return 결과값 (true/false)
 *		}
 *		아이디체크 : id
 *		boolean idcheck(String id)
 *		{
 *			아이디중복체크
 *			return 결과값
 *		}	
 *		***** 사용자가 보내주는 데이터(매개변수) => 3개이상 초과X (권장)
 *			  => 배열, 클래스
 *		검색 : 검색어 => 데이터가 많다
 *		***** 결과값은 1개만 사용
 *		String[] movieFind(String fd)
 *		{
 *		검색
 *		return 배열
 *		}
 *		------------------------------------------------------
 *		리턴형(결과값) ==> 사용자가 보내주는 값이 없는 경우
 *		random, trim
 *		double random(), String trim() => 좌우의 공백 제거
 *		==> 목록출력 String[] list()
 *		------------------------------------------------------
 *		결과값이 없는 경우
 *		--> 자체 출력
 *			구구단
 *			void gugudan() ==> return을 생략이 가능 (컴파일러가 자동으로 추가)
 *			void gugudan(int dan)
 *
 */
import java.util.*;
//클래스의 핵심 9변수, 메소드:재사용)
public class MainClass3 {
	// 로그인 => id,pwd => 결과값은 boolean
	static boolean login(String id, String pwd)
	{
		final String ID="admin";
		final String PWD="1234";
		boolean bCheck=false;
		if(id.equals(ID) && pwd.equals(PWD))
		{
			bCheck=true;
		}
		else
		{
			bCheck=false;
		}
		return bCheck;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//사용자 입력
		Scanner scan = new Scanner(System.in);
		System.out.print("ID입력:");
		String id=scan.next();
		System.out.print("Password입력:");
		String pwd=scan.next();
		//결과값을 받는다
		boolean bCheck = login(id,pwd); // 호출 =>  메소드명(값,값)
		if(bCheck==true)
		{
			
			System.out.println(id+"님 로그인되었습니다!!");
		}
		else
		{
			System.out.println("아이디나 비밀번호가 틀립니다!!");
		}
				
		
		// 자동으로 return
		

	}

}
