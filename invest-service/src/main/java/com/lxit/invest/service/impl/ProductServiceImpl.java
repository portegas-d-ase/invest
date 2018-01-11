package com.lxit.invest.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Service;

import com.lxit.invest.dao.ProductDao;
import com.lxit.invest.service.ProductService;
import com.lxit.p2p.bean.Product;

@Service
@MapperScan("com.lxit.invest.dao")
public class ProductServiceImpl implements ProductService{

	@Resource
	private ProductDao productDao;
	
	
	
	@Override
	public Product newPerson() {
		
		return productDao.newPerson();
	}

	@Override
	public Product MonthRose() {
		
		return productDao.MonthRose();
	}

	@Override
	public Product CarrieTreasure() {		
		return productDao.CarrieTreasure();
	}

	@Override
	public Product Inabundance() {
		
		return productDao.Inabundance();
	}

	@Override
	public Product PayTreasure() {
		
		return productDao.PayTreasure();
	}

	@Override
	public Product selectById(int productId) {
		
		Product product = productDao.selectById(productId);
		/*String[] fene ;
		String[] star ;
		if (product.getZonfene()!= null && product.getStartings()!=null) {
			fene = product.getZonfene().split(".");
			product.setZonfene(fene[0]);
			star = product.getStartings().split(".");
			product.setStartings(star[0]);
		}*/
		return product;
	}

	@Override
	public List<Product> projectList() {
		
		return productDao.projectList();
	}

}
