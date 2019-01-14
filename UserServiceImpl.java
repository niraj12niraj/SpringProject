package com.my.spring.service;


import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
//import java.util.concurrent.atomic.AtomicInteger;
import org.springframework.stereotype.Service;

import com.my.spring.dao.UserDAO;
import com.my.spring.entity.User;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	
	@Autowired(required=true)
	private UserDAO userDAO;
	
	
	//private static AtomicInteger al = null;
   // private static List<User> dList;
	public List<User> getList() {
		/*List<User> uList = new ArrayList<User>();
		Iterator<User>it=dummyUserList().iterator();
	   while(it.hasNext()) {
		   uList.add(it.next());
	   }*/
		return userDAO.getList();
		//return userDao.getList();
	}

	/*public List<User>dummyUserList() {
		dList = new ArrayList<User>();
		al=new AtomicInteger(0);
		try {
		dList.add(new User(al.incrementAndGet(),"Jhon","USA",4575));
		dList.add(new User(al.incrementAndGet(),"Anu","UK",78546584));
		dList.add(new User(al.incrementAndGet(),"Aliya","Yman",78645124));
		dList.add(new User(al.incrementAndGet(),"Xi Yang","China",7458894));
		dList.add(new User(al.incrementAndGet(),"Raju","India",7484512));
		dList.add(new User(al.incrementAndGet(),"Mon","Singapur",7455455));
		dList.add(new User(al.incrementAndGet(),"Willu","Russia",78945685));
		return dList;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return userDao.getList();
	}*/
	/*public static void main(String[] args) {
		UserServiceImpl u =new UserServiceImpl();
		Iterator<User>it=u.getList().iterator();
		while(it.hasNext()) {
			User i=it.next();
			System.out.println("Id--"+i.getId()+", Name--"+i.getName()+", Address--"+i.getAddress()+", Mobile--"+i.getMobile());
		}
	}
	*/

	public void saveUser(User user) throws IOException,Exception{
		
			System.out.println("1--in userServiceImpl-saveUser");
			System.out.println(user.getName());
			//userRepository.save(user);
	    userDAO.saveUser(user);
	 System.out.println("2--in userServiceImpl-saveUser");
		//return user;
		
	}

	public User getUserById(Long id) {
		return userDAO.getUserById(id);
	}

	public User getUserByName(String name) {
		return userDAO.getUserByName(name);
	}
	public void editOrUpdate(User user) {
		userDAO.editOrUpdate(user);
		
	}


	public User getUserByMobileNumber(Long mobile) {
		// TODO Auto-generated method stub
		return userDAO.getUserByMobileNumber(mobile);
	}

	public User getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return userDAO.getUserByEmail(email);
	}
}
