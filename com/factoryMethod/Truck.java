package com.factoryMethod;

public class Truck extends Auto {

	/**
	 * ���췽��
	 */
	public Truck() {
		this.setName("����");
	}

	@Override
	public void run() {
		System.out.println("����" + this.getName());
	}

}
