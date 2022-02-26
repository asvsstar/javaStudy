package com.it.main;
//	자료구조(데이터를 모아서 관리) => 컬렉션 (가변형)
/*
			collection
				|
	------------------------
	|						|		Map
	List				   Set => 인터페이스 (구현이 안된 메소드) => 여러개의 클래스를 모아서 관리
	|						|
  -----------------------  HashSet
  |			|			|
  ArrayList Vectio LinkedList
  ------------------------------
  		1. 데이터 추가
  			add(), add(int index)=> 원하는 위치에 추가
  			----- 마지막 위치에 추가
  		2. 데이터변경 set()
  		3. 데이터삭제 remove()
  		4. 데이터읽기 get()
  		5. 데이터 저장 갯수 size()
  		6. 전체 삭제 clear()
				
*/	
import java.util.*; // import 생략 => java.lang은 생략이 가능 => #include(c/c++), using(c#) ...
public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 데이터 추가
		ArrayList list = new ArrayList();
		list.add("홍길동");//0
		list.add("심청이");//1
		list.add("박문수");//2
		/*
		 * 	홍길동
		 * 	심청이
		 * 	박문수
		 */
		for(int i=0;i<list.size();i++)
		{
			String name=(String)list.get(i);
			System.out.println(name);
		}
		list.add(1, "이순신");
		/*
		 * 	홍길동
		 * 	이순신
		 * 	심청이
		 * 	박문수
		 */
		System.out.println("===========");
		for(int i=0;i<list.size();i++)
		{
			String name=(String)list.get(i);
			System.out.println(name);
		}
		list.remove(2);
		/*
		 * 	홍길동
		 * 	이순신
		 * 	박문수
		 */

		System.out.println("===========");
		for(int i=0;i<list.size();i++)
		{
			String name=(String)list.get(i);
			System.out.println(name);
		}
		list.set(1, "강감찬");
		/*
		 * 	홍길동
		 * 	강감찬
		 * 	박문수
		 */

		System.out.println("===========");
		for(int i=0;i<list.size();i++)
		{
			String name=(String)list.get(i);
			System.out.println(name);
		}
	}

}
