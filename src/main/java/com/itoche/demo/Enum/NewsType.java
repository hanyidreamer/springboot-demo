package com.itoche.demo.Enum;

/**
 * Created by ZHANGHANYI5 on 2017/7/4.
 */
public enum NewsType
{
	/**
	 1=>头条
	 *2=>娱乐
	 *3=>军事
	 *4=>汽车
	 *5=>财经
	 *6=>笑话
	 *7=>体育
	 *8=>科技
	 */
	HEADLINE("HEADLINE", 1),
	ENTERTAINMENT("ENTERTAINMENT", 2),
	MINITARY("MINITARY", 3),
	CARS("CARS", 4),
	FINANCE("FINANCE", 5),
	JOKE("JOKE", 6),
	SPORT("SPORT", 7),
	TECHNOLEDGE("TECHNOLEDGE", 1);

	private String type;
	private int value;

	public int getValue()
	{
		return value;
	}

	public void setValue(int value)
	{
		this.value = value;
	}

	NewsType(String type, int value)
	{
		this.type = type;
		this.value = value;
	}
}
