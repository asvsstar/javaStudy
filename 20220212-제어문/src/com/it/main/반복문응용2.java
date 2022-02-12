package com.it.main;
import java.io.*;
import java.net.*;

public class 반복문응용2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			URL url=new URL("https://www.genie.co.kr/");
			HttpURLConnection conn=(HttpURLConnection)url.openConnection();
			if(conn!=null)
			{
				//데이터를 읽어온다
				BufferedReader br = new BufferedReader(new InputStreamReader(
						conn.getInputStream(),"UTF-8"));
				while(true)
				{
					String s=br.readLine();
					if(s==null) break;
					System.out.println(s);
				}
			}
		}catch(Exception ex) {}
	}
}

