package com.lxit.invest.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Service;

import com.lxit.invest.dao.ApplyloansDao;
import com.lxit.invest.service.ApplyloansService;
import com.lxit.p2p.bean.Applyloans;

@Service
@MapperScan("com.lxit.invest.dao")
public class ApplyloansServiceImpl implements  ApplyloansService{

	@Resource
	private ApplyloansDao applyloansDao;
	
	@Override
	public int countLoans() {
		// TODO Auto-generated method stub
		return applyloansDao.countLoans();
	}

	@Override
	public List<Applyloans> selectBysome(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return applyloansDao.selectBysome(map);
	}

	@Override
	public int selectBysomecount(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return applyloansDao.selectBysomecount(map);
	}

}
