package com.lxit.invest.service;

import java.util.List;

import com.lxit.p2p.bean.Investment;

public interface InvestmentService {

	/**
	 * 一个标的已投总金额
	 * @return 总投资金额
	 */
	public String inputMoney(int id);
	
	/**
	 * 总投资人数
	 * @return
	 */
	int countInvest();
	
	/**
	 * 总投资排行榜
	 * @return
	 */
	public List<Investment> orderListTotal();
	/**
	 * 月排行榜
	 * @return
	 */
	public List<Investment> orderByMonth();
	/**
	 * 
	 * 占总投资的百分比
	 * @param userId 用户id
	 * @return
	 */
	public String percentageBymoney(int userId);
	
	public List<Investment> queryByProductId(int productId);
}
