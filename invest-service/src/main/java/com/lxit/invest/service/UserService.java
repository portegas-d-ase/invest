package com.lxit.invest.service;

import com.lxit.p2p.bean.User;

public interface UserService {

	User selectById(int userId);
	
	int countUser();
}
