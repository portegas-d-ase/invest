package com.lxit.invest.service;

import java.util.List;
import java.util.Map;

import com.lxit.p2p.bean.Applyloans;

public interface ApplyloansService {

	/**
	 * 总贷款人数
	 * @return
	 */
	int countLoans();
	
	/**
	 * invest模糊查询
	 * @param map
	 * @return
	 */
	public List<Applyloans> selectBysome(Map<String, Object> map);
	
	/**
	 * 总条数
	 * @param map
	 * @return
	 */
	public int selectBysomecount(Map<String, Object> map);
}
