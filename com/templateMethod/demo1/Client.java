package com.templateMethod.demo1;

/**
 * �ͻ��˴���
 * @author liuqian
 *
 */
public class Client {

	public static void main(String[] args) {
		/**
		 * ������ͨ�����������
		 */
		AbstractCarCreator car1 = new NormalCar();
		/**
		 * ����
		 */
		car1.makeCar();
		
		System.out.println();
		
		/**
		 * �������������������
		 */
		AbstractCarCreator car2 = new AdvanceCar();
		/**
		 * ����
		 */
		car2.makeCar();

	}

}
