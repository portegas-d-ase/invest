package com.lxit.invest.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Service;

import com.lxit.invest.dao.NoticeDao;
import com.lxit.invest.service.NoticeService;
import com.lxit.p2p.bean.Notice;

@Service
@MapperScan("com.lxit.invest.dao")
public class NoticeServiceImpl implements NoticeService{

	@Resource
	private NoticeDao noticeDao;
	
	@Override
	public List<Notice> queryNoticeAll() {
		
		return noticeDao.queryNoticeAll();
	}

	@Override
	public boolean insertNotice(Notice notice) {
		System.out.println("------noticeService---------");
		if (notice != null) {
			noticeDao.insertNotice(notice);
			return true;
		}
		return false;
	}

	@Override
	public Notice noticeInfomation(int id) {
		
		return noticeDao.noticeInfomation(id);
	}

}
