package com.builderFactory1;

/**
 * ��Ʒ��
 * @author liuiqian
 *
 */
/**
 * @author liuiqian
 * 
 */
public class Product {
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
	 * 
	 * @param name
	 * @param price
	 */
	public Product(String name, float price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + this.getName() + "/$" + this.getPrice() + ")";
	}
}
