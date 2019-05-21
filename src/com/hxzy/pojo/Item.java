package com.hxzy.pojo;

import java.io.Serializable;
import java.util.Date;

public class Item  implements Serializable{
	
	private int id;
	private String name;
	private double price;
	private Date createtime;
	private String detail;
	private String name2;

	private String name3;

	private String name4;
	private String name6;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	
	public Item() {
		
	}
	public Item(int id, String name, double price, Date createtime, String detail) {
		
		this.id = id;
		this.name = name;
		this.price = price;
		this.createtime = createtime;
		this.detail = detail;
	}
	
	

}
