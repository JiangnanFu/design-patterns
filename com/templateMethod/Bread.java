package com.templateMethod;

/*
 * ���������
 */
public abstract class Bread {
	/**
	 * �������
	 */
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * ģ�巽�����������
	 * û�ж����final�����Ա㱻װ��ģʽʹ��
	 */
	public void create() {
		prepare();
		handle();
		bake();
	}
	
	/**
	 * ���󷽷���׼��
	 */
	abstract public void prepare();
	
	/**
	 * ���󷽷����������
	 */
	abstract public void handle();
	
	/**
	 * ���󷽷����決
	 */
	abstract public void bake();
}
