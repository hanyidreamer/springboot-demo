/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014-2016 abel533@gmail.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.itoche.demo.controller;

import com.alibaba.fastjson.JSON;
import com.itoche.demo.model.City;
import com.itoche.demo.model.NewsRespModel;
import com.itoche.demo.service.CityService;
import com.itoche.demo.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: APP新闻
 * @author: zhanghanyi5
 * @createTime: 2017/7/4 17:03
 */
@RestController
@RequestMapping("/news")
public class NewsController
{
	@Autowired
	private NewsService newsService;

	/**
	 * @description: 新闻列表
	 * @param page 页码
	 * @param pageSize 每页显示条目
	 * @param tableNum 新闻类型
	 *        1=>头条
	 *		  2=>娱乐
	 *	      3=>军事
	 *		  4=>汽车
	 *		  5=>财经
	 *		  6=>笑话
	 *		  7=>体育
	 *		  8=>科技
	 * @param justList 是否显示新闻内容
	 *        0=>是
	 *        1=>否
	 * @return String
	 * @author: zhanghanyi5
	 * @createTime: 2017/7/4 16:59
	 */
	@ResponseBody
	@RequestMapping("/{page}/{pageSize}/{tableNum}/{justList}")
	public NewsRespModel getNewsByPageWithParam(@PathVariable("page") Integer page, @PathVariable("pageSize") Integer pageSize, @PathVariable("tableNum") Integer tableNum,
			@PathVariable("justList") Integer justList)
	{
		// 入参解析
		Map<String, Integer> paramMap = new HashMap<String, Integer>();
		if (tableNum != null)
		{
			paramMap.put("tableNum", tableNum);
		}
		if (justList != null)
		{
			paramMap.put("justList", justList);
		}

		// 业务处理
		String resp = newsService.getPage(page, pageSize, paramMap);

		NewsRespModel newsRespModel = JSON.parseObject(resp, NewsRespModel.class);
		// 出参 JSON
		return newsRespModel;
	}

	/**
	 * @description: 新闻详情
	 * @param newsId 新闻id
	 * @param tableNum
	 *        1=>头条
	 *		  2=>娱乐
	 *	      3=>军事
	 *		  4=>汽车
	 *		  5=>财经
	 *		  6=>笑话
	 *		  7=>体育
	 *		  8=>科技
	 * @return String
	 * @author: zhanghanyi5
	 * @createTime: 2017/7/4 17:02
	 */
	@RequestMapping("/detail/{newsId}/{tableNum}")
	public String getNewsDetail(@PathVariable("newsId") Integer newsId, @PathVariable("tableNum") Integer tableNum)
	{
		return newsService.getNewsDetail(newsId, tableNum);
	}
}
