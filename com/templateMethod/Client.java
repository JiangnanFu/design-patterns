package com.templateMethod;

public class Client {

	public static void main(String[] args) {
		/**
		 * ����һ���������ţ�����
		 */
		AbstractBreadDecorator breada = new PackDecorator(new MilkBread()) {
		};
		
		/**
		 * ����
		 */
		breada.create();
		
		System.out.println();
		
		/**
		 * ����һ�����ֱ�ӳԵ�ˮ�����
		 */
		AbstractBreadDecorator breadb = new EatDecorator(new FruitBread()) {
		};
		
		/**
		 * ����
		 */
		breadb.create();
	}

}
