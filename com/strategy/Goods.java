package com.strategy;

/*
 * ��Ʒ��
 */
public class Goods {
	/**
	 * ��Ʒ������
	 */
	private GoodsType goodsType;

	/**
	 * ��Ʒ�۸�
	 */
	private float price;

	/**
	 * ��Ʒ����
	 */
	private String name;

	/**
	 * ���췽��
	 */
	public Goods(GoodsType goodsType, float price, String name) {
		super();
		this.goodsType = goodsType;
		this.price = price;
		this.name = name;
	}

	public GoodsType getGoodsType() {
		return goodsType;
	}

	public void setGoodsType(GoodsType goodsType) {
		this.goodsType = goodsType;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
