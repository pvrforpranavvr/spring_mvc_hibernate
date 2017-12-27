package com.sh.services;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sh.models.User;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	SessionFactory sessionFactory;
	Session session;
	Logger logger = Logger.getLogger(UserServiceImpl.class);

	@Override
	public User create(User e) {
		session = sessionFactory.getCurrentSession();
		logger.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" + sessionFactory);
		session.save(e);
		return null;
	}

	@Override
	public User read(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User update(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(long id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
