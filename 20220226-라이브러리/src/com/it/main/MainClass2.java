package com.it.main;
//	clone : 복제
class Member implements Cloneable{
	int no;
	String name;
	/*
	 * 	초기화
	 * 	=명시적 초기화 int no=10
	 * 	----------
	 * 	=초기화 블록
	 * 	=생성자
	 * 	---------- 구현해서 초기화 (자동 로그인, 파일 읽기, 데이터베이스....)
	 * 	
	 */
	public Member()
	{
		no = 10;
		name = "홍길동";		
	}
	public void display()
	{
		System.out.println("no"+no+",name="+name);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1=new Member();
		m1.display();
		Member m2=m1;
		m2.display();
		m2.name="이순신";
		m2.display();
		
		try {
	
		Member m3=(Member)m1.clone();
		m3.no =11;
		m3.name="영차";
		m3.display();
		}catch(Exception ex) {}
	
		m2.display();
	}

}
