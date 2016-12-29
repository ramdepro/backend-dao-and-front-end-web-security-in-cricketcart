package com.niit.cricketbackend.dao;

import javax.transaction.Transactional;
import javax.websocket.Session;

import org.h2.engine.User;
import org.hibernate.SessionFactory;




@Repository
@Transactional
@EnableTransactionManagement
public class UserDAOImpl implements UserDAO {

	SessionFactory sessionFactory;
@Autowired
	public void addUser(User user) {
		
		user.setEnabled(true);
		user.setRole("RLOE_USER");
		
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(user);
		
	}
	
	
	public void updateUser(User user){
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(user);
		
		
	}
	
	
	public void deleteUser(User user){
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(user);
		
		
	}
}
