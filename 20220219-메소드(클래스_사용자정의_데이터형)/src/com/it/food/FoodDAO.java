package com.it.food;
import java.util.*;
import java.sql.*;
public class FoodDAO {
	//연결객체
	private Connection conn;
	//SQL문장 전송
	private PreparedStatement ps;
	private final String URL="jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC";// Mysql주소 => 상수
	//한번만 수행 => 드라이버 등록
	public FoodDAO() //생성자 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception ex) {}
		
	}
	//MySQL연결
	public void getConnection() {
		try
		{
			conn=DriverManager.getConnection(URL,"root","happy");
			//My-SQL : conn root/happy
			
		}catch(Exception ex) {}
	}
	//MYSQL 닫기
	public void disConnection()
	{
		// /quit
		try
		{
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
		}catch(Exception ex) {}
	}
	//카테고리 첨부
	public void categoryWrite(CategoryVO vo)
	{
		try
		{
			//1. MYSQL연결
			getConnection();
			//2. SQL문장
			String sql="INSERT INTO category VALUES("
					+"?,?,?,?,?";
			//3. 전송
			ps=conn.prepareStatement(sql);
			//4. ?에 값을 채운다
			ps.setInt(1, vo.getCno());
			ps.setString(2,  vo.getTitle());
			ps.setString(3,  vo.getSubject());
			ps.setString(4, vo.getPoster());
			ps.setString(5,  vo.getLink());
			
			//5. tlfgod
			ps.executeUpdate(); //commit()포함
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			//try,catch와 관계없이 무조건 수행
			disConnection();
		}
	}
	//Food첨부
	//Location 첨부

}
