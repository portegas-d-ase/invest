package com.lxit.invest.service.impl;

import javax.annotation.Resource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Service;

import com.lxit.invest.dao.UserDao;
import com.lxit.invest.service.UserService;
import com.lxit.p2p.bean.User;

@Service
@MapperScan("com.lxit.invest.dao")
public class UserServiceImpl implements UserService{

	@Resource
	private UserDao userDao;
	
	@Override
	public User selectById(int userId) {
		// TODO Auto-generated method stub
		return userDao.selectById(userId);
	}

	@Override
	public int countUser() {
		// TODO Auto-generated method stub
		return userDao.countUser();
	}

}
