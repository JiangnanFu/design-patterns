package com.state.demo1;
/*
 * �̵�״̬
 */
public class Client {

	public static void main(String[] args) {
		Shop shop = new Shop("�ܵ�", "close");
		shop.checkState();
		shop.ready();
		shop.checkState();
		shop.open();
		shop.checkState();
		shop.close();
		shop.checkState();
		
		/**
		 * ���´���Υ����Լ�������Գ�����
		 */
		shop.open();
		shop.checkState();
		
	}

}
