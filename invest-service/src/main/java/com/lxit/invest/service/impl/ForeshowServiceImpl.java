package com.lxit.invest.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Service;

import com.lxit.invest.dao.ForeshowDao;
import com.lxit.invest.service.ForeshowService;
import com.lxit.p2p.bean.Foreshow;
@Service
@MapperScan("com.lxit.invest.dao")
public class ForeshowServiceImpl implements ForeshowService{

	@Resource
	private ForeshowDao foreshowDao;
	@Override
	public List<Foreshow> queryForeshow() {
		
		return foreshowDao.queryForeshow();
	}

}
