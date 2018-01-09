package com.lxit.invest.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lxit.p2p.bean.Notice;

/**
 * 公告
 * @author Administrator
 *
 */
@Repository
public interface NoticeDao {

	/**
	 * 查询公告
	 * @param map 分页条件
	 * @return
	 */
	public List<Notice> queryNoticeAll();
	
	
	/**
	 * 后台添加公告
	 * @param notice 公告对象
	 */
	public void insertNotice(Notice notice);
	
	/**
	 * 公告信息
	 * @param id
	 * @return
	 */
	public Notice noticeInfomation(int id);
}
