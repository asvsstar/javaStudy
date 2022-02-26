package com.it.main;
import java.io.*; // 예외처리 => Exception ( 사용자 입력, 프로그래머의 실수)
/*
 * 		Throwable
 * 			|
 * 	-----------------
 * 	|				|
 * Error		Exception		Error(수정할 수 없는 에러: 메모리 부족, 이클립스문제 발생) Exception (가벼운 에러, 소스상의 에러)
 * 					|
 * 				--------------------
 * 			CheckException		unCheckException => checkexception(컴파일시에 검색), unCheckException(생략) 
 * 				|					|
 * 			IOException(java.io)	RuntimeException	
 * 			SQLException(java.sql)
 * 			MalformedURLException(java.net)
 * 			classNotFoundExcepion
 * 
 * 	예외처리
 * 	1) 예외 복구
 * 		try
 * 		{
 * 			정상적으로 수행하는 문장
 * 		}catch(예외 종류)
 * 		{
 * 			에러 발생시에 복구, 에러메세지 확인
 * 		}
 * 		finally
 * 		{
 * 			무조건 수행문장 => (데이터베이스 연결 => 닫기, 서버닫기, 파일 닫기)
 * 		}
 * 	2) 예외 회빅(예외선언) => 라이브러리에서 제공
 * 		method() throws 예외처리
 */
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int i= 0;
			//String data="";
			StringBuffer sb=new StringBuffer();
			FileReader fr=new FileReader("c:\\weekdev\\news.txt");
			while((i=fr.read())!=-1)
					{
				//data+=String.valueOf((char)i);
				sb.append(String.valueOf((char)i));
				
			}
			//System.out.println(data);
				System.out.println(sb.toString());	
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}

	}

}
