package com.my.spring.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

//import org.hibernate.Session;
//import org.hibernate.SessionFactory;

import com.my.spring.entity.User;
import com.my.spring.repository.UserRepository;

@Transactional
@Repository(value = "userDAO")
public class UserDAOImpl implements UserDAO {

	private UserRepository userRepository;

	private Session session;
	@Autowired
	private SessionFactory sessionFactory;
	private Transaction tx;

	public void setSessionFactory(SessionFactory sessionFactory) {
		/*
		 * if(session!=null) { session=sessionFactory.openSession(); session
		 * =sessionFactory.getCurrentSession(); }
		 */
		this.sessionFactory = sessionFactory;
	}

	private static List<User> list = null;

	// private SessionFactory sessionFactory;
	// private Session session;
	@SuppressWarnings("unchecked")
	public List<User> getList() {
		// TODO Auto-generated method stub
		list = new ArrayList<User>();
		try {
			System.out.println("getList in UserDAOImpl---");
			String sql = "FROM User";
					//"SELECT * FROM USERA";
			session = sessionFactory.getCurrentSession();
			session = sessionFactory.openSession();
			Query query=session.createQuery(sql);
			List<User>li=query.list();
			/*for(User user:li) {
				list.add(user);
			}
			Iterator<User>it=list.iterator();
			while(it.hasNext()) {
				System.out.println("user id=="+it.next().getId());
			}*/
			
			list.addAll(li);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;

	}

	public void saveUser(User user) {
		// TODO Auto-generated method stub
		try {
			System.out.println("1--saveUser in UserDAOImpl---");
			session = sessionFactory.getCurrentSession();
			session = sessionFactory.openSession();
			sessionFactory.getCurrentSession().save(user);
			// sessionFactory.getCurrentSession().save(user);
			System.out.println("2--saveUser in UserDAOImpl---");
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public User getUserById(Long id) {
		// TODO Auto-generated method stub
		System.out.println("getUserById in UserDAOImpl---");
		User user=(User) sessionFactory.getCurrentSession().get(User.class, id);
		return user;
				//userRepository.findOne(id);
	}
	public User getUserByName(String name) {
		// TODO Auto-generated method stub
		System.out.println("getUserById in UserDAOImpl---");
		User user=(User) sessionFactory.getCurrentSession().get(User.class, name);
		return user;
				//userRepository.findOne(id);
	}

	
	public void editOrUpdate(User user) {
		sessionFactory.getCurrentSession().persist(user);
	}


	public User getUserByMobileNumber(Long mobile) {
		// TODO Auto-generated method stub
		User user=(User) sessionFactory.getCurrentSession().get(User.class, mobile);
		return user;
	}
	/*public static void main(String[] args) {
		UserDAOImpl u=new UserDAOImpl();
		u.getUserById(25L);
	}*/

	public User getUserByEmail(String email) {
		// TODO Auto-generated method stub
		User user=(User) sessionFactory.getCurrentSession().get(User.class,email);
		return user;
	}

}
