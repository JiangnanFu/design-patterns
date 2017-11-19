package com.abstractFactory;

/**
 * ���󹤳�������
 * @author liuiqian
 *
 */
public abstract class Factory {
	/**
	 * ��������Ļ��ܶ���
	 * @return �������
	 */
	public abstract Shelf createShelf();
	
	/**
	 * ��������Ŀյ�����
	 * @return ����յ�
	 */
	public abstract AirConditioner createAirConditioner();
}
