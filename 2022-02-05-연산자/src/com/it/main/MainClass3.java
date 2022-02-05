package com.it.main;
//이항연산자
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//국어,영어,수학 => 평균, 총점
		int kor=90,eng=87,math=77;
		System.out.println(kor+eng+math);
		System.out.println((kor+eng+math)/3);
		System.out.printf("%.2f",(kor+eng+math)/3.0);//C언어
		//1.8 => SUN, 1.9 => oracle(C언어)
		
//		System.out.println(10/0);
		System.out.println(5%2); //1
		System.out.println(-5%2);//-1
		System.out.println(-5%-2);//-1
		System.out.println(5%-2);//1
	}

}
