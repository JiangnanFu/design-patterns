package com.factoryMethod;

/**
 * �γ�
 * @author liuqian
 *
 */
public class Car extends Auto{
	/**
	 * ���췽��
	 */
	public Car(){
		this.setName("�γ�");
	}

	/**
	 * ��д����
	 */
	@Override
	public void run() {
		System.out.println("����" + this.getName());
	}
}
