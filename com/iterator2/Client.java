package com.iterator2;

public class Client {

	public static void main(String[] args) {
		// ��������
		CarImpl car = new CarImpl();
		/**
		 * ��������
		 */
		car.add(new Goods("���ӻ�", 3200.99f));
		car.add(new Goods("��Ȫˮ", 0.8f));
		car.add(new Goods("�ʼǱ�����", 5200f));
		car.add(new Goods("���", 22.99f));
		car.add(new Goods("������", 5.98f));
		
		/**
		 * ������ͨ������
		 */
		IIterator iterator = car.createIterator();
		System.out.println("=============��ͨ����========");
		for(; !iterator.isDone(); iterator.next()){
			Goods g = iterator.currentItem();
			System.out.println(g.getName() + "\t\t" + g.getPrice());
			
		}
		
		/**
		 * �������������
		 */
		IIterator iterator2 = car.createSortIterator();
		System.out.println("=============�������========");
		for(; !iterator2.isDone(); iterator2.next()){
			Goods g = iterator2.currentItem();
			System.out.println(g.getName() + "\t\t" + g.getPrice());
			
		}
		System.out.println();
	}

}
