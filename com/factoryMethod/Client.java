package com.factoryMethod;

public class Client {

	public static void main(String[] args) {
		// ���þ�̬������������
		Auto auto1 = StaticFactory.createAuto(1);
		auto1.run();
		
		Auto auto2 = StaticFactory.createAuto(2);
		auto2.run();
		
		Auto auto3 = StaticFactory.createAuto(4);
		auto3.run();

	}

}
