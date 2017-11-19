package com.templateMethod;

public abstract class EatDecorator extends AbstractBreadDecorator {

	public EatDecorator(Bread bread) {
		super(bread);
	}
	
	/**
	 * ��дģ�巽��
	 */
	@Override
	public void create(){
		super.create();
		System.out.println("���������������");
	}

}
