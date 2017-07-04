package com.itoche.demo.service;

import java.util.Map;

/**
 * @description: 新闻Service
 * @author: zhanghanyi5
 * @createTime: 2017/7/4 17:07
 */
public interface NewsService
{
	/**
	 * @description: 新闻列表
	 * @param page 页码
	 * @param pageSize 每页条数
	 * @param paramMap 过滤条件
	 * @return
	 * @author: zhanghanyi5
	 * @createTime: 2017/7/4 17:04
	 */
	public String getPage(Integer page, Integer pageSize,Map<String, Integer> paramMap);

	/**
	 * @description: 新闻详情
	 * @param newsId 新闻id
	 * @param tableNum 新闻类型
	 *        1=>头条
	 *		  2=>娱乐
	 *	      3=>军事
	 *		  4=>汽车
	 *		  5=>财经
	 *		  6=>笑话
	 *		  7=>体育
	 *		  8=>科技
	 * @return
	 * @author: zhanghanyi5
	 * @createTime: 2017/7/4 17:05
	 */
	public String getNewsDetail(Integer newsId, Integer tableNum);
}
