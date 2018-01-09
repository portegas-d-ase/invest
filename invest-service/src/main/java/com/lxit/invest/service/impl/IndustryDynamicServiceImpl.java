package com.lxit.invest.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Service;

import com.lxit.invest.dao.IndustryDynamicDao;
import com.lxit.invest.service.IndustryDynamicService;
import com.lxit.p2p.bean.IndustryDynamic;

@Service
@MapperScan("com.lxit.invest.dao")
public class IndustryDynamicServiceImpl implements IndustryDynamicService{

	@Resource
	private IndustryDynamicDao industryDynamicDao;
	
	@Override
	public List<IndustryDynamic> selectAll() {
		// TODO Auto-generated method stub
		return industryDynamicDao.selectAll();
	}

}
