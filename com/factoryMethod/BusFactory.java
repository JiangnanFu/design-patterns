package com.factoryMethod;

public class BusFactory extends Factory {

	/**
	 * ��д���෽��
	 */
	@Override
	public Auto createAuto() {
		// TODO Auto-generated method stub
		return new Bus();
	}

}
