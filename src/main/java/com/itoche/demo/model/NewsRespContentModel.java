package com.itoche.demo.model;

import java.io.Serializable;

/**
 * Created by ZHANGHANYI5 on 2017/6/30.
 */
public class NewsRespContentModel implements Serializable
{
	private static final long serialVersionUID = -5794102387008064763L;
	private Integer news_id;        //	新闻news_id
	private String title;            //	标题
	private String top_image;        //	头部图片
	private String text_image0;        //	内容中的图片（可能为空）
	private String text_image1;        //	内容中的图片（可能为空）
	private String source;            //	新闻来源
	private String content;            //	新闻体
	private String digest;            //	概要
	private Integer reply_count;    //	回复数
	private Integer edit_time;        //	发布时间

	public Integer getNews_id()
	{
		return news_id;
	}

	public void setNews_id(Integer news_id)
	{
		this.news_id = news_id;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getTop_image()
	{
		return top_image;
	}

	public void setTop_image(String top_image)
	{
		this.top_image = top_image;
	}

	public String getText_image0()
	{
		return text_image0;
	}

	public void setText_image0(String text_image0)
	{
		this.text_image0 = text_image0;
	}

	public String getText_image1()
	{
		return text_image1;
	}

	public void setText_image1(String text_image1)
	{
		this.text_image1 = text_image1;
	}

	public String getSource()
	{
		return source;
	}

	public void setSource(String source)
	{
		this.source = source;
	}

	public String getContent()
	{
		return content;
	}

	public void setContent(String content)
	{
		this.content = content;
	}

	public String getDigest()
	{
		return digest;
	}

	public void setDigest(String digest)
	{
		this.digest = digest;
	}

	public Integer getReply_count()
	{
		return reply_count;
	}

	public void setReply_count(Integer reply_count)
	{
		this.reply_count = reply_count;
	}

	public Integer getEdit_time()
	{
		return edit_time;
	}

	public void setEdit_time(Integer edit_time)
	{
		this.edit_time = edit_time;
	}
}
