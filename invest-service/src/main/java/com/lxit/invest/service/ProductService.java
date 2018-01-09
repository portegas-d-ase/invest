package com.lxit.invest.service;

import java.util.List;

import com.lxit.p2p.bean.Product;

public interface ProductService {
	
	
	/**
	 * 根据id查找标
	 * 
	 * @param productId
	 * @return
	 */
	public Product selectById(int productId);

	/**
	 * 新手标
	 * 
	 * @return
	 */
	public Product newPerson();
	
	/**
	 * 产品列表
	 * @return
	 */
	public List<Product> projectList();

	/**
	 * 月月升
	 * 
	 * @return
	 */
	public Product MonthRose();

	/**
	 * 嘉利宝
	 * 
	 * @return
	 */
	public Product CarrieTreasure();

	/**
	 * 季季丰
	 * 
	 * @return
	 */
	public Product Inabundance();

	/**
	 * 加薪宝
	 * 
	 * @return
	 */
	public Product PayTreasure();
}
