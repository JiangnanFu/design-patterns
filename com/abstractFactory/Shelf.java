package com.abstractFactory;

/**
 * ���ܳ�����
 * 
 * @author liuiqian
 * 
 */
public abstract class Shelf {
	/**
	 * ��������
	 */
	private String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * ��Ż��﷽��
	 */
	public void put(Goods goods) {
		System.out.println(goods.getName() + "����" + getName());
	}
}
