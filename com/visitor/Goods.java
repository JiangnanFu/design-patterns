package com.visitor;

/*
 * ��Ʒ
 */
public abstract class Goods {
	/**
	 * ��Ʒ��
	 */
	private String name;

	/**
	 * �۸�
	 */
	private float price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	/**
	 * ���ܷ�����
	 */
	public abstract void accept(IVisitor visitor);
	
}
