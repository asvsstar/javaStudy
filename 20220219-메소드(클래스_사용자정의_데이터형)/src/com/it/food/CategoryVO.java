package com.it.food;
// 캡슐화 방식 => 데이터를 은닉화 => 메소드를 통해서 기능 수행
// 변수 => 읽기(getter)/쓰기(setter)
// JSP (Bean), MyBatis (DTO) , Spring (VO)
// DTO ==> Data Transfor Object, VO ==> Value Object
// 사용자 정의 데이터형
/*
 * 	cno int primary key,
 * 		---- int
    tile varchar(200) not null,
    	------------ String
    subject varchar(200) not null,
    poster varchar(300) not null,
    lin varchar(100) 
 */
public class CategoryVO {
	private int cno; //은닉화
	private String title;
	private String subject;
	private String poster;
	private String link;

	public int getCno() {
		return cno;
	}

	public void setCno(int cno) {
		this.cno = cno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}
	
	
	
}
