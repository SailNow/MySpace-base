package org.lg.MySpace.service.impl;

import org.lg.MySpace.dao.UserDao;
import org.lg.MySpace.model.User;
import org.lg.MySpace.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;
	
	public int sava(User user) {
		return userDao.save(user);
	}

}
