package com.observer.demo2;

public class Client {

	public static void main(String[] args) {
		/**
		 * ����������
		 */
		NewsPublisher newsPublisher = new NewsPublisher();
		GoodsPublisher goodsPublisher = new GoodsPublisher();
		
		/**
		 * ��ʼ��������
		 */
		IObserver observerA = new Customer();
		IObserver observerB = new TV();
		
		/**
		 * ע���������ע������ע��Ĳ�ͬ���
		 */
		newsPublisher.addObserver(observerA);
		
		goodsPublisher.addObserver(observerA);
		goodsPublisher.addObserver(observerB);
		
		/**
		 * �ı���������
		 */
		newsPublisher.setNews("���ţ� �µ꿪�ţ�");
		goodsPublisher.setNews("��Ʒ�� �»��ϼܣ�");
	}

}
