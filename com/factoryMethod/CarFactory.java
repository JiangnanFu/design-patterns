package com.factoryMethod;

public class CarFactory extends Factory {

	/**
	 * ��д���෽��
	 */
	@Override
	public Auto createAuto() {
		// TODO Auto-generated method stub
		return new Car();
	}

}
