package com.factoryMethod;

/**
 * ��̬����
 * @author liuiqian
 *
 */
public class StaticFactory {

	/**
	 * ��������
	 */
	public static Auto createAuto(int autoId){
		switch(autoId){
		case 1:
			return new Car();
		case 2:
			return new Bus();
		case 3:
			return new Truck();
		default:
			/**
			 * ���û�д��ֳ��ͣ��׳��쳣
			 */
			throw new RuntimeException("û�����ֳ���");
				
		}
	}
}
