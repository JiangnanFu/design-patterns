package com.decorator;

/**
 * ��Ա������
 * @author liuqian
 *
 */
public abstract class Employee {
	//��Ա����
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee(String name) {
		super();
		this.name = name;
	}

	public Employee() {
		super();
	}
	
	//����������
	public abstract void work();
}
