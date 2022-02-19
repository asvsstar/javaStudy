package com.it.main;

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id="admin";
		String pwd="1234";
		
		boolean bCheck=MainClass.isLogin(id, pwd);
 		if(bCheck==true)
 		{
 			System.out.println("로그인 되었습니다!!");
 		}
 		else
 		{
 			System.out.println("로그인 실패했습니다!");
 		}

		

	}

}
