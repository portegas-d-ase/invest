package com.lxit.invest.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Service;

import com.lxit.invest.dao.InvestmentDao;
import com.lxit.invest.service.InvestmentService;
import com.lxit.p2p.bean.Investment;

@Service
@MapperScan("com.lxit.invest.dao")
public class InvestmentServiceImpl implements InvestmentService{

	@Resource
	private InvestmentDao investmentDao;
	

	@Override
	public String inputMoney(int id){
		String jindu = investmentDao.inputMoney(id);
		if (jindu != null) {
			return jindu;
		}
		return 0.0+"";
	}


	@Override
	public int countInvest() {
		// TODO Auto-generated method stub
		return investmentDao.countInvest();
	}


	@Override
	public List<Investment> orderListTotal() {
		// TODO Auto-generated method stub
		return investmentDao.orderListTotal();
	}


	@Override
	public List<Investment> orderByMonth() {
		// TODO Auto-generated method stub
		return investmentDao.orderByMonth();
	}


	@Override
	public String percentageBymoney(int userId) {
		// TODO Auto-generated method stub
		return investmentDao.percentageBymoney(userId);
	}

}
