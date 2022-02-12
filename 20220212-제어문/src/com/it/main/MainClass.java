package com.it.main;
/*
 * 	1. 조건문
 * 		형식)
 * 			조건문 : true/false => 결과값
 * 				   ----------
 * 					부정연산자(!), 비교연산자 (==, !=, <, >, <=, >=)
 * 					논리연산자 ( &&, || )
 * 			용도 : 오류방지 => 처리가 안되는 부분 (예외처리)
 * 			if(조건문)
 * 			{
 * 				조건이 true일때 처리하는 문장
 * 			}
 * 
 * 			선택 조건문 : true일때 처리, false일때 처리
 * 			=> 로그인 여부 / 아이디 중복 체크 / 검색 여부
 * 			=> 모든 프로그램 언어 => 제어문은 한장문장(명령문)
 * 								=> 여러개의 문장 동시 수행 {}
 * 				예)
 * 					---------
 * 					if(조건문)
 * 					처리문장1
 * 					---------
 * 						처리문장2=> if와 관련이 없는 문장
 * 
 * 					if(조건문)
 * 					{
 * 						처리문장1
 * 						처리문장2
 * 					---------------- 동시처리문장 ( 조건 : true )
 * 					}
 *			 if(조건문)
 * 			{
 * 				조건이 true일때 처리문장
 * 			}
 * 			else
 * 			{
 * 				조건이 false일때 처리문장
 * 			}
 * 
 * 			다중조건문 : 조건에 맞는 조건문만 1개 수행
 * 			if(조건문)
 * 			{
 * 				조건 true일때 처리하는 문장
 * 				true => 문장 수행 => 종료
 * 				false => 다음 조건문으로 이동
 * 			}
 * 			else if(조건문)
 * 			{
 * 				조건 true일때 처리하는 문장
 * 				true => 문장 수행 => 종료
 * 				false => 다음 조건문으로 이동
 * 			}
 * 			else if(조건문)
 * 			{
 * 				조건 true일때 처리하는 문장
 * 				true => 문장 수행 => 종료
 * 				false => 다음 조건문으로 이동
 * 			}
 * 			----------------------------
 * 			else
 * 			{
 * 				해당조건이 없는 경우 => else문장 수행
 * 			}
 * 			----------------------------생략가능
 *  
 *  		=> 	웹에서는 주로 문자열비교
 *  			==================
 *  			boolean 처리 문자관련 메소드
				equals() 같은 문자, contains(): 문자 포함
				starswith(), endswith(), substring(), indexOf, lastIndexOf
				valuOf(), length(), trim()
 *  						
 */
// 오류 => 프로그래머 실수, 사용자 입력값 => 조건문
import java.util.*; // 자바, 외부 라이브러리를 읽어 올때 사용
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 사용자로부터 입력값을 받는다 (정수 2개)
		Scanner scan=new Scanner (System.in); //클래스 저장 => new (메모리 확보)
		// System.in => 키보드 입력값을 저장 ( 표준 입력)
		System.out.print("첫번째 정수 입력:");
		// 값을 받는 경우 ==> 정수 : nextInt(), 문자열 : next()
		int a=scan.nextInt();
		System.out.print("두번째 정수 입력:");
		int b=scan.nextInt();
		// 2. 나누기 => 정상적으로 수행 => 조건문 이용 ==> 10/0(X), 0/10(ㅐ)
		if(b==0)
		{
			System.out.println("0으로 나눌 수 없습니다");
		}
		else
		{
			//System.out.println(a/b);
			//System.out.println(a/(double)b); // 0으로 나눌수 없다, 정수/정수=정수
			System.out.printf("%.2f",a/(double)b);
			//Math.round(), Math.ceil()
		}
	}
	//알고리즘 (자료구조) => 디자이 패턴(싱글턴, 팩토리)
}


