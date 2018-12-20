package com.my.spring.entity;


public class User {
	private int id;
	private String name;
	private String address;
	private Integer mobile;
	
	public User(int id,String name,String add,Integer mobile){
		this.id=id;
		this.name=name;
		this.address=add;
		this.mobile=mobile;
	}
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getMobile() {
		return mobile;
	}
	public void setMobile(Integer mobile) {
		this.mobile = mobile;
	}
	
	

}
