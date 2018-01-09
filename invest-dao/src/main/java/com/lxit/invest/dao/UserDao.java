package com.lxit.invest.dao;

import org.springframework.stereotype.Repository;

import com.lxit.p2p.bean.User;

@Repository
public interface UserDao {

	User selectById(int userId);
	/**
	 * 平台注册人数
	 * @return
	 */
	int countUser();
}
