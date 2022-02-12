package com.it.main;
// 연산자 + 제어문 응용 ==> 메소드화
/*
 * 	=> Calendar =>
 * 	1. 사용자로부터 년도,월을 받는다
 * 	2. 요일 계산 (1일차)
 * 		= 1년도 1월 1일부터 ~ 입력한 년도까지의 총날수
 * 		= 전달까지의 날수
 * 		= +1
 * 		= %7 ==> 요일 (1년 1월 1일 => 월)
 * 	3. 1~해당일 출력
 */
import java.util.*;
public class 달력만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자로부터 값을 받는다
		Scanner scan=new Scanner(System.in);// 키보드 입력값을 받는다
		// 년도 / 월
		System.out.print("년도와 월 입력 : 2022 2 :");
		int year=scan.nextInt();
		int month=scan.nextInt();
		System.out.println(year+"년도"+month+"월");
		//요일출력
		String[] strWeek= {"일","월","화","수","목","금","토"};
		for(String s:strWeek)
		{
			System.out.print(s+"\t");
		}
		System.out.println("\n");
		int[] lastday={31,28,31,30,31,30,
					   31,31,30,31,30,31};
		//1. 1년도 1월 1일 ~ 전년도까지의 총 날수 => 2022-> 2021.12.31
		int total=(year-1)*365
				+(year-1)/4
				-(year-1)/100
				+(year-1)/400;
		// 4년마다 윤년 (366) => 100년마다 제외 => 400년마다 윤년 (로마시대)
		//2. 전달까지의 합
		if((year%4==0 && year%100!=0)||(year%400==0))
		{
			lastday[1]=29;
		}
		else
		{
			lastday[1]=28;
		}
		for(int i=0;i<month-1;i++)
		{
			total+=lastday[i];
		}
		//1일자
		total++;
		// 요일 계산
		int week=total%7;
		//달력 출력
		for(int i=1;i<=lastday[month-1];i++)
		{
			if(i==1) //첫번째 줄
			{
				for(int j=0;j<week;j++)
				{
					System.out.print("\t");
				}
			}
			//달력출력
			System.out.printf("%2d\t",i);
			week++;
			if(week>6) {
				week=0;
				System.out.println();
			}
		}
	}

}
