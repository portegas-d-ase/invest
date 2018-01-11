package com.lxit.invest.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lxit.invest.service.InvestmentService;
import com.lxit.invest.service.ProductService;
import com.lxit.p2p.bean.Product;

@EnableAutoConfiguration
@RestController
@ComponentScan(basePackages={"com.lxit.invest.service"})
public class ProductAction {

	@Resource
	private ProductService productService;
	@Resource
	private InvestmentService investmentService;
	
	@RequestMapping("/getProductList")
	public List<Product> getProducts(){
		List<Product> p = productService.projectList();
		for (Product product : p) {
			String jindu = investmentService.inputMoney(product.getProductId());
			product.setJindutiao(jindu);
		}
		return p;
	}
	
	@RequestMapping("/getProductById")
	public Product getProduct(@RequestParam(defaultValue="1",value="productId") int productId){
		return productService.selectById(productId);
	}
	
	@RequestMapping("/getProductNewPerson")
	public Product getNewPerson(){
		Product p = productService.newPerson();
		String j = investmentService.inputMoney(p.getProductId());
		p.setJindutiao(j);
		return p;
	}
	
	@RequestMapping("/getProductMonthRose")
	public Product getMonthRose(){
		return productService.MonthRose();
	}
	
	@RequestMapping("/getProductCarrieTreasure")
	public Product getCarrieTreasure(){
		return productService.CarrieTreasure();
	}
	
	@RequestMapping("/getProductInabundance")
	public Product getInabundance(){
		return productService.Inabundance();
	}
	
	@RequestMapping("/getProductPayTreasure")
	public Product getPayTreasure(){
		return productService.PayTreasure();
	}
}
