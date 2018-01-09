package com.lxit.invest.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lxit.p2p.bean.Product;

@Repository
public interface ProductDao {

	/**
	 * 根据id查找标
	 * @param productId
	 * @return
	 */
	public Product selectById(int productId);
	
	/**
	 * 新手标
	 * @return
	 */
	public Product newPerson();
	/**
	 * 月月升
	 * @return
	 */
	public Product MonthRose();
	/**
	 * 嘉利宝
	 * @return
	 */
	public Product CarrieTreasure();
	/**
	 * 季季丰
	 * @return
	 */
	public Product Inabundance();
	/**
	 * 加薪宝
	 * @return
	 */
	public Product PayTreasure();
	/**
	 * 产品列表
	 * @return
	 */
	public List<Product> projectList();
}
