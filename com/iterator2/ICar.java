package com.iterator2;

/**
 * ���ﳵ�ӿ�
 * 
 * @author liuqian
 * 
 */
public interface ICar {
	/**
	 * ��ͨ������
	 */
	IIterator createIterator();
	
	/**
	 * ���������
	 */
	IIterator createSortIterator();
}
