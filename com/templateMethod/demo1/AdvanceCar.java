package com.templateMethod.demo1;

/*
 * �������ᳵ
 */
public class AdvanceCar extends AbstractCarCreator {

	/**
	 * ֻ��Ҫʵ�־������ �����췽�����޷���д�������췽��
	 */
	@Override
	public void makeFrame() {
		System.out.println("��װ�����ᳵ����");
	}

	@Override
	public void makeGearKnob() {
		System.out.println("��װ���Զ���");
	}

	@Override
	public void makeTyre() {
		System.out.println("��װ�˼ӿ���̥");
	}

}
