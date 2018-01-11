package com.lxit.invest.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lxit.invest.service.ForeshowService;
import com.lxit.invest.service.UserService;
import com.lxit.p2p.bean.Foreshow;
import com.lxit.p2p.bean.User;

@EnableAutoConfiguration
@RestController
@ComponentScan(basePackages={"com.lxit.invest.service"})
public class ForeshowAction {

	@Resource
	private ForeshowService foreshowService;
	@Resource
	private UserService userService;
	
	@RequestMapping("/queryForeshow")
	public List<Foreshow> queryForeshow(){
		return foreshowService.queryForeshow();
	}
	
	@RequestMapping("/queryUser")
	public User queryUser(@RequestParam(defaultValue="1",value="userId")int userId){
		return userService.selectById(userId);
	}
}
