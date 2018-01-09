package com.lxit.invest.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.lxit.p2p.bean.IndustryDynamic;

@Repository
public interface IndustryDynamicDao {

	public List<IndustryDynamic> selectAll();
}
