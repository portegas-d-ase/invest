package com.lxit.invest.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lxit.invest.service.ApplyloansService;
import com.lxit.invest.service.IndustryDynamicService;
import com.lxit.invest.service.InvestmentService;
import com.lxit.invest.service.UserService;
import com.lxit.p2p.bean.Applyloans;
import com.lxit.p2p.bean.IndustryDynamic;
import com.lxit.p2p.bean.Investment;
import com.lxit.p2p.bean.Pager;
import com.lxit.p2p.bean.Product;


@EnableAutoConfiguration
@RestController
@ComponentScan(basePackages={"com.lxit.invest.service"})
public class InvestmentAction {

	@Resource
	private IndustryDynamicService industryDynamicService;
	
	@Resource
	private InvestmentService investmentService;
	@Resource
	private ApplyloansService applyloansService;
	@Resource
	private UserService userService;

	@RequestMapping("/getApplyloans")
	public Pager<Applyloans> listPager(@RequestParam(defaultValue="1",value="pageIndex")int pageIndex,
			@RequestParam(defaultValue="3",value="pageSize")int pageSize,
			@RequestParam(defaultValue="1",value="begin")int begin,
			@RequestParam(defaultValue="36",value="finals")int finals,
			@RequestParam(defaultValue="",value = "state")String state,
			@RequestParam(defaultValue="10",value="starNum")int starNum,
			@RequestParam(defaultValue="18",value="endNum")int endNum,
			@RequestParam(defaultValue="",value="type")String type
			){
		Map<String, Object> map = new HashMap<>();
		Pager<Applyloans> pager = new Pager<>();
		pager.setPageIndex(pageIndex);
		pager.setPageSize(pageSize);
		int page = (pager.getPageIndex()-1)*pageSize;
		map.put("pageIndex", page);
		map.put("pageSize", pageSize);
		map.put("begin", begin);
		map.put("finals", finals);
		map.put("state", state);
		map.put("starNum", starNum);
		map.put("endNum", endNum);
		map.put("type", type);
		int count = applyloansService.selectBysomecount(map);
		pager.setSumCount(count);
		List<Applyloans> list = applyloansService.selectBysome(map);
		pager.setData(list);
		return pager;
		
	}
	
	
	
	
	@RequestMapping("/getSumMoney")
	public String sumMoney(){
		return investmentService.inputMoney(1);
	}
	
	
	@RequestMapping("/getCounts")
	public Map<String, Object> three(){
		Map<String, Object> map = new  HashMap<>();
		int userCount = userService.countUser();
		int investCount = investmentService.countInvest();
		int loansCount = applyloansService.countLoans();
		map.put("userCount", userCount);
		map.put("investCount", investCount);
		map.put("loansCount", loansCount);
		return map;
	}
	
	@RequestMapping("/queryIndustry")
	public List<IndustryDynamic> queryAll(){
		return industryDynamicService.selectAll();
		
	}
	
	@RequestMapping("/queryOrderListTotal")
	public List<Investment> orderListTotal(){
		List<Investment> invest = investmentService.orderListTotal();
		for (Investment investment : invest) {
			String i = investmentService.percentageBymoney(investment.getUser().getUserId());
			investment.setTotal(i);
		}
		return invest;
	}
	
	@RequestMapping("/queryOrderByMonth")
	public List<Investment> orderByMonth(){
		List<Investment> invest = investmentService.orderByMonth();
		for (Investment investment : invest) {
			String i = investmentService.percentageBymoney(investment.getUser().getUserId());
			investment.setTotal(i);
		}
		return invest;
	}
	
	@RequestMapping("/queryPercentageBymoney")
	public String percentageBymoney(@RequestParam("userId")int userId){
		return investmentService.percentageBymoney(userId);
		
	}
}
