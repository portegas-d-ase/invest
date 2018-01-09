package com.lxit.invest.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lxit.p2p.bean.Investment;

@Repository
public interface InvestmentDao {

	/**
	 * 某一个标的总已筹金额
	 * @param productId 产品id
	 * @return  总额
	 */
	public String inputMoney(int id);
	/**
	 * 总投资人数
	 * @return
	 */
	public int countInvest();
	
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
}
