package com.factoryMethod;

public class Bus extends Auto {

	/**
	 * ���췽��
	 */
	public Bus() {
		this.setName("��ʿ");
	}

	@Override
	public void run() {
		System.out.println("����" + this.getName());
	}

}
