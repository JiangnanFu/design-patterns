package com.templateMethod;
/*
 * ţ�����
 */
public class MilkBread extends Bread {

	/**
	 * ���췽��
	 */
	public MilkBread() {
		super();
		this.setName("ţ�����");
	}
	@Override
	public void prepare() {
		/**
		 * ����׼��
		 */
		System.out.println("׼��ţ��");
	}

	@Override
	public void handle() {
		/**
		 * �������
		 */
		System.out.println("���ż���ţ�̺󷢽�");
	}

	@Override
	public void bake() {
		/**
		 * �決
		 */
		System.out.println("���º決");
	}

}
