package com.iterator;

public class Client {

	public static void main(String[] args) {
		// ��������
		Aggregate aggregate = new AggregateImpl();

		/**
		 * ����������
		 */
		Iterator iterator = aggregate.createIterator();

		/**
		 * ���ʼ���
		 */
		for (; !iterator.isDone(); iterator.next()) {
			System.out.println(iterator.currentItem());
		}
	}

}
