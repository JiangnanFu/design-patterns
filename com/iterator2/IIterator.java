package com.iterator2;
/**
 * �������ӿ�
 * @author liuqian
 *
 */
public interface IIterator {
	/**
	 * �ƶ�������ͷ��
	 */
	void first();
	
	/**
	 * �ƶ�����һ��Ԫ��
	 */
	void next();
	
	/**
	 * �Ƿ��Ѵﵽ����β��
	 */
	boolean isDone();
	
	/**
	 * ���ص�ǰԪ��
	 */
	Goods currentItem();
}
