package com.lxit.invest.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.lxit.p2p.bean.Applyloans;

@Repository
public interface ApplyloansDao {

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
