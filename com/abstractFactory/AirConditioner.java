package com.abstractFactory;

/**
 * �յ�������
 * 
 * @author liuiqian
 * 
 */
public abstract class AirConditioner {

	/**
	 * �յ�����
	 */
	private String name;

	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * �յ�����
	 */
	public void turnOn() {
		System.out.println(getName() + "");
	}
}
