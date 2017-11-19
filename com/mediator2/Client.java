package com.mediator2;

public class Client {

	public static void main(String[] args) {
		/**
		 * ������ͣ��
		 */
		Mediator mediator = new Mediator();
		
		/**
		 * �������з������󲢹����۲��߶���
		 */
		mediator.createMethods();
		
		/**
		 * ��ö���
		 */
		Inventory inventory = mediator.getInventory();
		Purchase purchase = mediator.getPurchase();
		Sell sell = mediator.getSell();
		
		/**
		 * ����
		 */
		sell.action();
		purchase.action();
		inventory.action();
	}

}
