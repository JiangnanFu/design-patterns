package com.templateMethod;
/*
 * ˮ�����
 */
public class FruitBread extends Bread {

	/**
	 * ���췽��
	 */
	public FruitBread() {
		super();
		this.setName("ˮ�����");
	}
	
	@Override
	public void prepare() {
		/**
		 * ����׼��
		 */
		System.out.println("׼��ˮ��");
	}

	@Override
	public void handle() {
		/**
		 * �������
		 */
		System.out.println("����ˮ��");
	}

	@Override
	public void bake() {
		/**
		 * �決
		 */
		System.out.println("���º決");
	}

}
