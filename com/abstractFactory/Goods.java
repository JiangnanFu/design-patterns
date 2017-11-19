package com.abstractFactory;

public class Goods {
	private String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * ��Ʒ���
	 */
	private GoodsType goodsType;
	
	public GoodsType getGoodsType() { 
		return this.goodsType;
	}
	
	public void setGoodsType(GoodsType goodsType) {
		this.goodsType = goodsType;
	}
	
	/**
	 * ���췽��
	 */
	public Goods(String name, GoodsType goodsType) {
		super();
		this.name = name;
		this.goodsType = goodsType;
	}
}
