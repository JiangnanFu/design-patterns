package com.iterator2;
/**
 * ��Ʒ��
 * @author liuqian
 *
 */
public class Goods {
	/**
	 * ��Ʒ����
	 */
	private String name;
	
	/**
	 * ��Ʒ�۸�
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
	 * ���췽��
	 * @param name
	 * @param price
	 */
	public Goods(String name, float price){
		super();
		this.name = name;
		this.price = price;
	}
}
