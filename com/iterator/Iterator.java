package com.iterator;
/**
 * ������������
 * @author liuqian
 *
 */
public abstract class Iterator {

	/**
	 * �ƶ�������ͷ��
	 */
	public abstract void first();
	
	/**
	 * �ƶ�����һ��Ԫ��
	 */
	public abstract void next();
	
	/**
	 * �Ƿ��Ѿ��ﵽ����β��
	 */
	public abstract boolean isDone();
	
	/**
	 * ���ص�ǰԪ��
	 */
	public abstract Object currentItem();
}
