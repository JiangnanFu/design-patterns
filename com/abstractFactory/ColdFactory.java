package com.abstractFactory;

/**
 * �䶳����
 * @author liuiqian
 *
 */
public class ColdFactory extends Factory {

	@Override
	public Shelf createShelf() {
		// TODO Auto-generated method stub
		return new ColdShelf();
	}

	@Override
	public AirConditioner createAirConditioner() {
		// TODO Auto-generated method stub
		return new ColdAirConditioner();
	}

}
