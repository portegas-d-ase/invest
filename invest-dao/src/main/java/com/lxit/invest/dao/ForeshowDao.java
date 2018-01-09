package com.lxit.invest.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
/**
 * 预告
 * @author Administrator
 *
 */

import com.lxit.p2p.bean.Foreshow;

@Repository
public interface ForeshowDao {

	/**
	 * 查询所有预告
	 * @return
	 */
	public List<Foreshow> queryForeshow();
}
