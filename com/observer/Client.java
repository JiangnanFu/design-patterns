package com.observer;

public class Client {

	public static void main(String[] args) {
		/**
		 * ����������
		 */
		NewsPublisher newsPublisher = new NewsPublisher();
		
		/**
		 * ���Ӽ�����
		 */
		newsPublisher.addObserver(new Customer());
		newsPublisher.addObserver(new TV());
		
		/**
		 * �ı���������
		 */
		newsPublisher.setNews("�յ��󽵼�");
	}

}
