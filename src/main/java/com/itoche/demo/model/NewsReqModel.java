package com.itoche.demo.model;

import java.io.Serializable;

/**
 * Created by ZHANGHANYI5 on 2017/6/30.
 */
public class NewsReqModel implements Serializable
{
	private static final long serialVersionUID = 2371638957442130265L;
	/**
	 * 板块结构代码(说明如下)
	 *        1 =>  头条
	 *        2 =>  娱乐
	 *        3 =>  军事
	 *        4 =>  汽车
	 *        5 =>  财经
	 *        6 =>  笑话
	 *        7 =>  体育
	 *        8 =>  科技
	 * */
	private Integer tableNum;
	private Integer page;        // 当前页（从1开始）
	private Integer pagesize;    // 每页显示数目
	private Integer justList;    // 是否仅扣回新闻列表，1是（默认），0否

	public Integer getJustList()
	{
		return justList;
	}

	public void setJustList(Integer justList)
	{
		this.justList = justList;
	}

	public Integer getTableNum()
	{
		return tableNum;
	}

	public void setTableNum(Integer tableNum)
	{
		this.tableNum = tableNum;
	}

	public Integer getPage()
	{
		return page;
	}

	public void setPage(Integer page)
	{
		this.page = page;
	}

	public Integer getPagesize()
	{
		return pagesize;
	}

	public void setPagesize(Integer pagesize)
	{
		this.pagesize = pagesize;
	}
}
