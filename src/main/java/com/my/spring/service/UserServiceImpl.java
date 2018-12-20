package com.my.spring.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import com.my.spring.entity.User;

public class UserServiceImpl {
	private static AtomicInteger al = null;
    private static List<User> dList;
	public List<User> getList() {
		List<User> uList = new ArrayList<User>();
		uList.addAll(dList);
		return uList;
	}

	public void dummyUserList() {
		dList = new ArrayList<User>();
		dList.add(new User(al.incrementAndGet(),"Jhon","USA",4575));
		dList.add(new User(al.incrementAndGet(),"Anu","UK",78546584));
		dList.add(new User(al.incrementAndGet(),"Aliya","Yman",78645124));
		dList.add(new User(al.incrementAndGet(),"Xi Yang","China",7458894));
		dList.add(new User(al.incrementAndGet(),"Raju","India",7484512));
		dList.add(new User(al.incrementAndGet(),"Mon","Singapur",7455455));
		dList.add(new User(al.incrementAndGet(),"Willu","Russia",78945685));
	}
	/*public static void main(String[] args) {
		UserServiceImpl u=new UserServiceImpl();
		u.getList();
		for(User l:u.getList()) {
			System.out.println("Id-"+l.getId()+" Name-"+l.getName()+" Address-"+l.getAddress()+" Mobile "+l.getMobile());
		}
	}*/

}
