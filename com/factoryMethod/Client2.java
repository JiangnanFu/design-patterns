package com.factoryMethod;

public class Client2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 *���ù�������������ͬ����
		 */
		/**
		 * ����������ʹ�ó���������������ӿڱ�̣�
		 */
		Factory factory;
		Auto auto;
		
		/**
		 * ����Car
		 */
		factory = new CarFactory();
		auto = factory.createAuto();
		auto.run();
		
		/**
		 * ����Bus
		 */
		factory = new BusFactory();
		auto = factory.createAuto();
		auto.run();
		
		/**
		 * ����Truck
		 */
		factory = new TruckFactory();
		auto = factory.createAuto();
		auto.run();
	}

}
