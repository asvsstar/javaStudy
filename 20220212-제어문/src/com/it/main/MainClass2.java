package com.it.main;
// 입력값을 받아서 (문자) => 대문자인지 확인
import	java.util.*;
public class MainClass2 {
	// 7+"+"+7+"="*7+7 ==>
	/*
	 * 	7+"+" = "7+"
	 * 			"7+"+7
	 * 			--------
	 * 			"7+7"+"="
	 * 			"7+7="+7
	 * 			---------
	 * 			"7+7=7"+7
	 * 			"7+7=77
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='홍'; //한글 입력시 실행 안됨
		// char가 연산되면 자동으로 정수로 변환 'A' =>65
		if(c>='A' && c<='Z') // 대문자 ( &&범위포함, 기간포함)
		{
			System.out.println(c+"는 대문자입니다.");
			// +(산술연산), +(문자열 결합)
		}
		else if(c>='a' && c<='z') // 소문자
		{
			System.out.println(c+"는 소문자입니다.");
		}
		else
		{
			System.out.println("알파벳이 아니다");
		}
		
	}

}
