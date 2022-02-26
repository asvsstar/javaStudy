package com.it.main;
/*
 * 	웹 기반
 * 	-----
 * 		1. 데이터형 만들기 (캡슐화) 변수 : private, getter/setter => JSP(빈), mybatis(dto), spring(vo)
 * 											읽기	     쓰기
 * 		2. 상속 : 이전의 클래스를 재사용시에 사용  => extends
 * 		3. 라이브러리
 * 			java.lang
 * 				=> String, Wrapper, StringBuffer
 * 			java.util
 * 				=> Date, StringTokenizer, Collection
 * 			java.io
 * 				=> File (FileInputStream, FileOutputStream)
 * 		4. 예외처리
 * 		5. Mysql 연동
 * 		=======================
 * 		HTML / CSS(Bootstrap)
 */
// 자바의 모든 클래스 => 사용자 정의 클래스 / 라이브러리 => 조립
// ==> Object를 상송하고 있다 => 모든 데이터형을 통합
/*
 * 	Object
 * 	------
 * 	  => Object o=10;
 * 		 Object o=10.5;
 * 		 Object o="aaa";
 * 		 Object o=true;
 * 	  => 1. clone = 복제 ===============> Spring (prototype) : 기본 Singleton
 * 			----------- 새로운 메모리 만들기
 * 		 2. toString
 * 			----------- 객체를 문자열로 변환 (객체 =>주소)
 * 		 3. finalize
 * 			----------- 소멸자 메소드 
 * 			class className
 * 			{
 * 				----------------
 * 				변수
 * 					= 인스턴스 ==========> new를 이용해서 메모리에 저장 (메모리마다 따로 생성되는 변수)*****
 * 					= 정적변수(공통변수) => static (메모리 공간이 한개)
 * 				----------------
 * 				 변수에 대한 초기화 / 시작과 동시에 처리 => 데이터베이스 (드라이버등록)
 * 				 생성자
 * 				----------------
 * 				 기능 처리 : 메소드
 * 				----------------
 * 				 소멸자 : finalize  ==> GC(자동 메로리 해제) => 프로그램 종료시에 해제 => 메모리 누수현상
 * 									  필요시에 따라서 gc호출이 가능
 * 				----------------
 * 			}
 */
//	finalize
class Sawon{
	public Sawon()
	{
		System.out.println("Sawon 메모리 생성 완료(생성자 호출)");
	}
	public void display()
	{
		System.out.println("Sawon:display() Call...");
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Sawon을 메모리에서 해제(삭제)");
	}
	
	
}
public class MainClass {

	public static void main(String[] args) {
		//1 클래스 저장 => 객체가 생성
		Sawon s=new Sawon();// s=>객체 ==> new (클래스의 ㅁ메모리크기 확인 => 메모리에 저장), Sawon() => 초기화
		// toString() => 객체를 문자열로 변환
		System.out.println(s.toString());
		//2. Sawon이 가지고 있는 기능을 활용:
		s.display();
		//3. Sawon을 메모리에서 해제(삭제)
		s=null; //NullPointerException Sawon s; => s.display()
		System.gc(); // S메모리 해제 new / delete

	}

}
