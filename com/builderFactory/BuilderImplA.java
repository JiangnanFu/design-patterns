package com.builderFactory;

/**
 * ��ͯ�ײ�
 */
public class BuilderImplA extends Builder {

	/**
	 * ������ʳ
	 */
	public void createFoodA() {
		getProductList().add("�����㺺��");
	}
	
	/**
	 * ������ʳ
	 */
	public void createFoodB() {
		getProductList().add("С����");
	}
	
	/**
	 * ��������
	 */
	public void createDrink() {
		getProductList().add("����");
	}
	
	/**
	 * ����������
	 */
	public void createAddition() {
		getProductList().add("ϲ�������");
	}
}
