package com.proxy;
/**
 * �ֻ��ӿ�
 * @author liuiqian
 *
 */
public interface Phone {

	/**
	 * �õ��ֻ�Ʒ��
	 */
	public String getBrand();
	
	/**
	 * �õ��ֻ��ͺ�
	 */
	public String getSeries();
	
	/**
	 * �õ��ֻ���ɫ
	 */
	public String getColor();
	
	/**
	 * ��ͨ�绰
	 */
	public void call();
}
