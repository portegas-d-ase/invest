package com.lxit.invest.service;

import java.util.List;
import java.util.Map;

import com.lxit.p2p.bean.Notice;

public interface NoticeService {
	
	/**
	 * 查询公告
	 * 
	 * @param map
	 *            分页条件
	 * @return
	 */
	public List<Notice> queryNoticeAll();

	/**
	 * 后台添加公告
	 * 
	 * @param notice
	 *            公告对象
	 */
	public boolean insertNotice(Notice notice);
	
	/**
	 * 公告信息
	 * @param id
	 * @return
	 */
	public Notice noticeInfomation(int id);
}
