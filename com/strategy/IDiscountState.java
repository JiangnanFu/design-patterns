package com.strategy;
/**
 * �ۿ�״̬�ӿ�
 * @author liuqian
 *
 */
public interface IDiscountState {
	/**
	 * �۸�ϵ������ȫ��Ϊ1�����Ϊ0.5
	 * @return
	 */
	float getDiscount();
	
	/**
	 * ��������
	 * @return
	 */
	String getMsg();
}
