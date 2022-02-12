package com.it.main;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;


//	for응용
//	네트워크 (web) => 예외처리
/*
 * 예외처리 : 에러방지 (에러 사전에 차단)
 * ------ 예외복구(try~catch)
 * ------ 예외회피(선언) throws
 */

public class 반복문응용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			// 정상 수행문장
			int k=1;
			for(int i=1;i<=4;i++)
			{
			
				// 데이터 저장 공간 : Document (문서 저장)
				Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20220212&hh=11&rtm=Y&pg="+i).get();
				//url연결해서 출력한 모든 데이터를 읽어온다.
				//System.out.println(doc);
				//System.out.println("=========="+i+"페이지 ==========");
				Elements title=doc.select("table.list-wrap a.title");
				Elements singer=doc.select("table.list-wrap a.artist");
				for(int j=0; j<50;j++) {
					System.out.println(k+"."+title.get(j).text()+" "
							+singer.get(j).text());
					k++;
					
				}
			}
		}catch(Exception ex){/* 에러 복구*/}
	}

}
