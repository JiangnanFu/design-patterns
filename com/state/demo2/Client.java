package com.state.demo2;

/*
 * �ͻ���
 */
public class Client {

	public static void main(String[] args) {
		/**
		 * ������������
		 */
		Shop shop = new Shop();
		shop.check(100);
		
		shop.setDiscountState(HalfDiscountState.getInstance());
		shop.check(100);
	}

}
