package com.it.main;
import java.util.*;
/*
 * 		class A
 * 		{
 * 		}
 * 		A a=new A();
 * 		=> 컴파일
 * 			===
 * 			this=a;
 * 		A b=new A90;
 * 			this=b
 */
//T => 타입 => 임시 데이터형 => T, E ,K ,V => Map<K,T> => T(Object)
// => 데이터형의 통일화 => 사용하기 편리하게 만든다 (일반데이터형은 사용이 불가능 => 클래스형을 사용한다.)
/*
 * 	일반 데이터형을 사용하고 싶다
 * 	ArrayList<int> => 오류 ㅂ ㅏㄹ생
 * 	일반 데이터형을 클래스화 ==> Wrapper클래스 (박싱, 언박싱)
 * 	 web에서 데이터 전송 => String
 * 	 int ==> Integer
 * 				parseInt()
 * 	 double ==> Double
 * 				parseDouble()
 * 	 boolean ==> Boolean
 * 				parseBoolean()
 * 	 byte ==> Byte
 * 	 long ==> Long
 * 
 * 	 박싱
 *  ---
 *  Integer i=10;
 *  
 *  언박싱
 *  int k=i;
 * 
 */
class Box<T>{
	T t;
	/*
	public Box(T t)
	{
		this.t=t; // this자신의 객체 => static => 지역변수 우선순위
	}
	*/
	public T display()
	{
		return t;
	}
	public void setT(T t1)
	{
		t=t1;
	}
}
public class MainClass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<String> list=new ArrayList<String>();
		//list.
		Box b=new Box();
		Box<String> b1 = new Box<String>();
		b1.
		
	}

}
