package com.factoryMethod;

public class TruckFactory extends Factory {

	/**
	 * ��д���෽��
	 */
	@Override
	public Auto createAuto() {
		// TODO Auto-generated method stub
		return new Truck();
	}

}
