package com.it.main;
/*
 * 	반복문 :
 * 			웹 : 게시물 (문자), 이미지(포스트) : 10~15
 * 			for : 반복횟수가 지정 ( 화면 출력 )
 * 			while : 반복횟수가 없는 경우 => 무한루프
 * 					데이터베이스, 네트워크 서버
 * 	반복제어문 :
 * 			break : 반복 종료
 * 			continue : 트정부분 제외 => while(조건식), for(증가식)
 * 
 * 	형식)
 * 		for
 * 					↗ false면 종료
 * 		 	  1 -> 2  ←  4←
 * 		for(초기값;조건식; 증감식)
 * 		{
 * 				↓ true ↗↗
 * 			반복 수행문장 3
 * 		}
 * 		초기값 : 시작점
 * 		조건식 : 종료
 * 		증가식 : 초기값 증가 ==> 조건식에 도달
 * 
 * 		예)
 * 			1~100까지 출력
 * 			for(int i=1; 1<=100; i++) ==> ㅗ기값 (1,0)
 * 			{
 * 				출력
 * 			}
 * 		=> 2차 for
 * 			for() ==> 줄수
 * 			{
 *	 			for() ==> 식제 내용
 *	 			{
 *					반복 수행
 * 				}
 * 			}
 */
public class 반복문_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~10까지 
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		
	}

}
