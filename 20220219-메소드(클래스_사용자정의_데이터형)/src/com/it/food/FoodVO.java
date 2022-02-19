package com.it.food;

import lombok.Getter;
import lombok.Setter;

//맛집 한개에 대한 데이터를 모아서 관리
/*
 * 	no int primary key,
    cno int,
    poster varchar(1000) not null,
    name varchar(100) not null,
    address varchar(100) not null,
    tel varchar(20) not null,
    score double not null,
    type varchar(200) not null,
    price varchar(100),
    parking varchar(100),
    time varchar(100),
    menu varchar(1000),
    rcount int default 0,
    foreign key(cno)
    references category(cno)
 */
@Getter
@Setter
public class FoodVO {
	private int no,cno,rcout;
	private String poster,name,address,tel,type,price,parking,time,manu;
	private double scroe;
	

}
