package com.itoche.demo.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by ZHANGHANYI5 on 2017/6/30.
 */
public class NewsRespModel implements Serializable
{
	private static final long serialVersionUID = 8811136624707477722L;
	private Integer status;            // 返回状态码
	private String error;            //	错误信息（无错误则为空）
	private Integer count;            //	数据条数
	private List<NewsRespContentModel> data;            //	数据体

	public Integer getStatus()
	{
		return status;
	}

	public void setStatus(Integer status)
	{
		this.status = status;
	}

	public String getError()
	{
		return error;
	}

	public void setError(String error)
	{
		this.error = error;
	}

	public Integer getCount()
	{
		return count;
	}

	public void setCount(Integer count)
	{
		this.count = count;
	}

	public List<NewsRespContentModel> getData()
	{
		return data;
	}

	public void setData(List<NewsRespContentModel> data)
	{
		this.data = data;
	}
}
