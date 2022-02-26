package com.it.food;
// JSP => main() 사용자에게 보여주는 프로그램 
import java.util.*;
public class MainClass {
    public int menu()
    {
    	int select=0;
    	Scanner scan=new Scanner(System.in);
    	System.out.println("============ Menu ==========");
    	System.out.println("1.믿고 보는 맛집 리스트");
    	System.out.println("2.지역별 인기 맛집");
    	System.out.println("3.메뉴별 인기 맛집");
    	System.out.println("4.종료");
    	System.out.println("=============================");
    	System.out.print("메뉴 선택:");
    	select=scan.nextInt();
    	return select;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 클래스 저장 
		//FoodManager fm=new FoodManager();
		// 클래스의 메소드 호출 => 수행 결과 보기
		//fm.categoryRead();
		MainClass m=new MainClass();
		FoodDAO dao=new FoodDAO();
		while(true)
		{
			int val=m.menu();
			if(val==4)
			{
				System.out.println("프로그램 종료");
				break;
			}
			else if(val==1)
			{
				String res=dao.categoryListData(1);
				StringTokenizer st=new StringTokenizer(res,"|");
				while(st.hasMoreTokens())
				{
					System.out.println(st.nextToken());
				}
			}
			else if(val==2)
			{
				String res=dao.categoryListData(2);
				StringTokenizer st=new StringTokenizer(res,"|");
				while(st.hasMoreTokens())
				{
					System.out.println(st.nextToken());
				}
			}
			else if(val==3)
			{
				String res=dao.categoryListData(3);
				StringTokenizer st=new StringTokenizer(res,"|");
				while(st.hasMoreTokens())
				{
					System.out.println(st.nextToken());
				}
			}
		}
		
	}

}
