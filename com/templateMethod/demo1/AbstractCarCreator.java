package com.templateMethod.demo1;

/*
 * ����ģ���࣬��������
 */
public abstract class AbstractCarCreator {

	/**
	 * �������������Ϊģ�巽���������޷��޸�
	 */
	public final void makeCar() {
		/**
		 * �г��޷��޸ĵ�����˳��
		 */
		makeFrame();
		makeGearKnob();
		makeTyre();
	}
	
	/**
	 * ���󷽷�����������
	 */
	abstract public void makeFrame();
	
	/**
	 * ���󷽷���������λ���
	 */
	abstract public void makeGearKnob();
	
	/**
	 * ���󷽷���������̥
	 */
	abstract public void makeTyre();
}
