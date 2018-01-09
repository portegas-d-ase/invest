package com.lxit.invest.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lxit.invest.service.NoticeService;
import com.lxit.p2p.bean.Notice;

@EnableAutoConfiguration
@RestController
@ComponentScan(basePackages={"com.lxit.invest.service"})
public class NoticeAction {

	@Resource
	private NoticeService noticeService;
	
	@RequestMapping("/queryNotice")
	public List<Notice> getNotice(){
		return noticeService.queryNoticeAll();
	}
	
	@RequestMapping("/getNotices")
	public Notice getNoticess(@RequestParam int id){
		return noticeService.noticeInfomation(id);
	}
}
