package com.it.food;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

// 액션 (동작,행위) 모아서 관리 ==> 메소드 
/*
 *    <div class="a">  ==> HTML 구분자 class(.) , id(#)   (div.a a)
 *     <a href="#">test</a>                        (a) => 
 *    </div>
 *     <a href="&">kkk</a> 
 *     
 *    a태그가 가지고 있는 데이터를 달라 
 */
public class FoodManager {
  // 1. 카테고리 읽기
  public void categoryRead()
  {
	  try
	  {
		  FoodDAO dao=new FoodDAO();
		  //1. 웹사이트 연결 => HTML을 저장  
		  Document doc=Jsoup.connect("https://www.mangoplate.com/").get();
		  //System.out.println(doc);
		  //2. HTML에서 필요한 데이터만 읽어 온다 
		  Elements title=doc.select("div.info_inner_wrap span.title");
		  Elements subject=doc.select("div.info_inner_wrap p.desc");
		  Elements link=doc.select("ul.list-toplist-slider a");
		  Elements poster=doc.select("ul.list-toplist-slider img");
		  // <a href="/top_lists/garosugil_dessert_top10">
		  for(int i=0;i<title.size();i++)
		  {
			  //size()=> 저장된 갯수 
			  System.out.println(i+1);
			  System.out.println(title.get(i).text());//<span>데이터</span>
			  System.out.println(subject.get(i).text());
			  System.out.println(link.get(i).attr("href"));
			  System.out.println(poster.get(i).attr("data-lazy"));
			  System.out.println("=======================================");
			  CategoryVO vo=new CategoryVO();
			  vo.setCno(i+1);
			  vo.setTitle(title.get(i).text());
			  vo.setSubject(subject.get(i).text());
			  vo.setPoster(poster.get(i).attr("data-lazy"));
			  vo.setLink(link.get(i).attr("href"));
			  // FoodDAO를 통해서 => MYSQL로 전송 
			  dao.categoryWrite(vo);
		  }
		  //3. CategoryVO에 데이터를 묶어준다 
		  //4. 데이터베이스 전송 
	  }catch(Exception ex){}
  }
  // 2. 맛집 읽기
  // 3. 지역별 맛집 
}








