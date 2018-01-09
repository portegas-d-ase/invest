package com.lxit.invest.service;

import java.util.List;

import com.lxit.p2p.bean.Foreshow;

public interface ForeshowService {

	/**
	 * 查询所有预告
	 * @return
	 */
	public List<Foreshow> queryForeshow();
}
