package com.templateMethod;
/*
 * �������װ����
 */
public abstract class AbstractBreadDecorator extends Bread {

	/**
	 * �ۺ�һ��Bread����
	 */
	private Bread bread;
	
	/**
	 * ���췽��
	 */
	public AbstractBreadDecorator(Bread bread) {
		super();
		this.bread = bread;
	}
	
	/**
	 * ί�����ģ�巽��
	 */
	@Override
	public void prepare() {
		bread.prepare();
	}

	@Override
	public void handle() {
		bread.handle();
	}

	@Override
	public void bake() {
		bread.bake();
	}

}
