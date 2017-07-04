package com.itoche.demo.service.impl;

import com.itoche.demo.service.NewsService;
import com.itoche.demo.utils.HttpRequest;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Map;
import java.util.Set;

/**
 * @description: 新闻Service实现类
 * @author: zhanghanyi5
 * @createTime: 2017/7/4 17:07
 */
@Service
public class NewsServiceImpl implements NewsService
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
	@Override
	public String getPage(Integer page, Integer pageSize, Map<String, Integer> paramMap)
	{
		// 入参
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("page=").append(page);
		stringBuffer.append("&pagesize=").append(pageSize);
		if (paramMap != null && !CollectionUtils.isEmpty(paramMap))
		{
			Set<String> keys = paramMap.keySet();
			for (String param : keys)
			{
				stringBuffer.append("&").append(param).append("=").append(paramMap.get(param));
			}
		}
		System.out.println(stringBuffer.toString());

		//发送 GET 请求
		String responseResult = HttpRequest.sendGet("http://api.dagoogle.cn/news/get-news", stringBuffer.toString());
		System.out.println(responseResult);

		// 出参 JSON
		return responseResult;
	}

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
	public String getNewsDetail(Integer newsId, Integer tableNum)
	{
		// 入参
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("news_id=").append(newsId);
		stringBuffer.append("&tableNum=").append(tableNum);
		System.out.println(stringBuffer.toString());

		//发送 GET 请求
		String responseResult = HttpRequest.sendGet("http://api.dagoogle.cn/news/single-news", stringBuffer.toString());
		System.out.println(responseResult);

		// 出参 JSON
		return responseResult;
	}
}
