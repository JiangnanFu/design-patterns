package com.prototype1;

/**
 * ��Ʒ���߱���¡����
 * @author liuiqian
 *
 */
public class Goods implements Cloneable {
	private String name;
	
	private double price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * ���췽��
	 * @param name
	 * @param price
	 */
	public Goods(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	/**
	 * ʵ�ֵĿ�¡���÷���
	 */
	public Object clone() {
		// TODO Auto-generated method stub
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
	
	
}
