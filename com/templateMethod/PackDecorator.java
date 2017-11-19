package com.templateMethod;
/*
 * ��������װ�η���
 */
public abstract class PackDecorator extends AbstractBreadDecorator {

	public PackDecorator(Bread bread) {
		super(bread);
	}
	
	/**
	 * ��дģ�巽��
	 */
	@Override
	public void create(){
		super.create();
		System.out.println("�������װ����");
	}
}
