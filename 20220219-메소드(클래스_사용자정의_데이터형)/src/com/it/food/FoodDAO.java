package com.it.food;
import java.util.*;
import java.sql.*;
public class FoodDAO {
  // 연결 객체 
  private Connection conn;
  // SQL문장 전송 
  private PreparedStatement ps;
  private final String URL="jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC";//MySql주소 => 상수
  // 한번만 수행 => 드라이버 등록 
  public FoodDAO() // 생성자 
  {
	   try {
		     Class.forName("com.mysql.cj.jdbc.Driver");
	   }catch(Exception ex){}
  }
  // MySQL 연결 
  public void getConnection()
  {
	  try
	  {
		  conn=DriverManager.getConnection(URL,"root","happy");
		  // MY-SQL : conn root/happy
	  }catch(Exception ex) {}
  }
  // MySQL 닫기
  public void disConnection()
  {
	  // /quit
	  try
	  {
		 if(ps!=null) ps.close();
		 if(conn!=null) conn.close();
	  }catch(Exception ex) {}
  }
  // 카테고리 첨부 
  public void categoryWrite(CategoryVO vo)
  {
	  try
	  {
		  //1. MYSQL연결 
		  getConnection();
		  //2. SQL문장 
		  String sql="INSERT INTO category VALUES(?,?,?,?,?)";
		  //3. 전송 
		  ps=conn.prepareStatement(sql);
		  //4. ?에 값을 채운다 
		  ps.setInt(1, vo.getCno());
		  ps.setString(2, vo.getTitle());
		  ps.setString(3, vo.getSubject());
		  ps.setString(4, vo.getPoster());
		  ps.setString(5, vo.getLink());
		  
		  //5. 실행 
		  ps.executeUpdate(); // commit()포함 
		  
	  }catch(Exception ex)
	  {
		  // 오류 처리
		  ex.printStackTrace();
	  }
	  finally
	  {
		  //try,catch와 관계없이 무조건 수행 
		  disConnection();
	  }
  }
  // 1-2 데이터 출력 
  public String categoryListData(int n)
  {
	  String result="";
	  int start=0;
	  int end=0;
	  if(n==1)
	  {
		  start=1;
		  end=12;
	  }
	  else if(n==2)
	  {
		  start=13;
		  end=18;
	  }
	  else if(n==3)
	  {
		  start=19;
		  end=30;
	  }
	  try
	  {
		  //1. 연결 
		  getConnection();
		  String sql="SELECT title FROM category "
				    +"WHERE cno BETWEEN ? AND ?";
		  ps=conn.prepareStatement(sql);
		  ps.setInt(1, start);
		  ps.setInt(2, end);
		  ResultSet rs=ps.executeQuery();
		  while(rs.next())
		  {
			  result+=rs.getString(1)+"|";
		  }
		  result=result.substring(0,result.lastIndexOf("|"));
		  rs.close();
	  }catch(Exception ex)
	  {
		  ex.printStackTrace();
	  }
	  finally
	  {
		  disConnection();
	  }
	  return result;
  }
  // Food첨부
  // Location 첨부 
}








