package com.builderFactory;

/**
 * ��ͯ�ײ�
 */
public class BuilderImplB extends Builder {

	/**
	 * ������ʳ
	 */
	public void createFoodA() {
		getProductList().add("���ްԺ���");
	}
	
	/**
	 * ������ʳ
	 */
	public void createFoodB() {
		getProductList().add("������");
	}
	
	/**
	 * ��������
	 */
	public void createDrink() {
		getProductList().add("�󱭿���");
	}
	
	/**
	 * ����������,û�и�����
	 */
}
