package com.it.main;
/*
 * 	String => 문자열 저장 => 메ㅗ드
 * 			   char[]
 * 			     단점은 변경할 수 없다(상속(X))
 * 							  --------- 종단 클래스
 * 			   public final class String
 * 					  ----- Math, System, Scanner ...(웹,모바일=> 모든 데이터가 문자열)
 * 	1. 문자열 저장 방법
 * 	   -----------
 * 		일반 데이터형 방식
 * 		 => ***String name="홍길동"  ==> "" 문자열 자체가 주소
 * 		메모리를 만들어서 저장
 * 		 => String name=new String("홍길동") => new 새로운 메모리가 만들어 진다.
 * 
 * 		String에서 지원하는 메소드
 * 		1. 문자열 비교
 * 			equals : 대소문자 구분해서 비교 (로그인)
 * 			boolean equals(String vvalue)
 * 			equalsIgnoreCase : 대소문자 구분없이(검색)
 * 			boolean equalsIgnoreCase(String value)
 * 		2. 문자열 정보
 * 			length(): 문자갯수
 * 			int length()
 * 		3. 문자분리
 * 			substring() : 문자를 자른다
 * 			String substring(int start)
 * 							----------- 포함
 * 			Hello Java => 문자열의 시작은 0부터
 * 			0123456789
 * 
 * 			substring(3) = lo Java
 * 			substring(6) = Java
 * 
 * 			substring(1,4) = ell 4번 제외
 * 			String substring(int start,int end)
 * 									   -------- 미포함
 * 					
 * 			split() : 구분자로 문자 분리
 * 			String[] split(String d)
 * 			"Java,Mysql,jsp,spring,spring-boot"
 * 			String[] s=split(",") => StringTokenizer
 * 							-------- 정규식을 이용한다
 * 							  ^	String[] s=split("\\^")
 * 							  $
 * 							  .
 * 							  ?
 * 							  |
 * 							  "[가-항]" "[A-Z]" "[a-z]" "[0-9]"
 * 			4. 찾기
 * 			   = indexOf
 * 				 int indexOf(찾는 문자)
 * 			   부산광역시 동구 대명로234번길 56 지번 부산시 동구 조동 563
 * 			   = lastIndexOf
 * 				 int lastIndexOf(찾는 문자)
 * 			   ------------------------------
 * 			   = startsWith : 시작문자열이 같은 경우 A%
 * 			   = endsWith : 끝문자열이 같은 경우       %A
 * 			   ------------------------------ 서제스트 (자동완성기)
 * 			   = contains : Like (포함문자열)   %A%
 * 			   ------------------------------ boolean
 * 			5. 기타
 * 			   = trim() : 좌우공백 제거 => 사용자 입력시 (space)
 * 			   = replace() : 문자변경 => &, || 
 * 			   = valueOf() : 모든 데이터형을 문자열 변경
 * 				 valueOf(10) => "10"
 * 
 * 
 */
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		String s1="Hello";
		String s2="Hello";
		String s3=new String("HEllo");
		
		if(s1==s2)
			System.out.println("같다");
		if(s1.equalsIgnoreCase(s3))
			System.out.println("같다");
		else
		System.out.println("다르다");
*/
	String s="Hello Java";
	// 		  0123456789
	//1. 문자 갯수
	System.out.println(s.length());
	//2. 문자 자르기
	String s1=s.substring(6);
	System.out.println(s1);
	String s2=s.substring(0,5);
	System.out.println(s2);
	
	s="red^blue^green^black^yellow";
	String[] color=s.split("\\^"); //정규식(^,&,.,?,|)=> \" , \ => \\
	for(String c:color)
		System.out.println(c);
	
	s="부산광역시 동구 대명로234번길 56 지번 부산시 동구 조량동 563";
	String addr=s.substring(0,s.lastIndexOf("지"));
	System.out.println(addr);
	System.out.println(addr.trim());
	
	String[] data= {
			"자바와 MySQL",
			"자바와 JSP",
			"혼자 배우는 자바",
			"자바의 정석",
			"스프링 프로그램",
			"스프링부트 프로그램",
			"스프링과 자바"
	};
	for(String ss:data) 
	{
		/*
		if(ss.startsWith("자바")) //자바로 시작하는 문자열
				{
					System.out.println(ss);
				}
		*/
		/*
		if(ss.endsWith("자바")) // 자바로 끝나는 문자열
		{
			System.out.println(ss);
		}
		*/
		if(ss.contains("자바")) // 자바가 포함된 문자열
		{
			System.out.println(ss);
		}
		
	}
	
	s="Hello Java";
	String ss=s.replace('l', 'k'); //Hekko Java
	System.out.println(ss);
	ss=s.replace("Java", "JSP");
	System.out.println(ss);
			
	}

}
