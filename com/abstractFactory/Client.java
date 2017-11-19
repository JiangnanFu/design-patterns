package com.abstractFactory;

/**
 * �ͻ��˴���
 * @author liuiqian
 *
 */
public class Client {

	public static void main(String[] args) {
		/**
		 * ����һ����Ҫ���±���Ļ���
		 */
		Goods goods = new Goods("�;�", GoodsType.normalTemperature);
		/**
		 * ��ú��ʵĹ���
		 */
		Factory factory = AbstractFactoryHelper.getFactory(goods);
		/**
		 * �������󲢲���
		 */
		AirConditioner airConditioner = factory.createAirConditioner();
		airConditioner.turnOn();
		
		Shelf shelf = factory.createShelf();
		shelf.put(goods);
		System.out.println();
		/**
		 * ����һ����Ҫ�䶳�Ļ���
		 */
		Goods goods1 =  new Goods("�����", GoodsType.coldTemperature);
		
		/**
		 * ��ú��ʵĹ���
		 */
		Factory factory1 = AbstractFactoryHelper.getFactory(goods1);
		/**
		 * �������󲢲���
		 */
		AirConditioner airConditioner1 = factory1.createAirConditioner();
		airConditioner1.turnOn();
		
		Shelf shelf1 = factory1.createShelf();
		shelf1.put(goods);

	}

}
