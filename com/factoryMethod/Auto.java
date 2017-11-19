package com.factoryMethod;

/**
 * ����������
 * @author liuqian
 *
 */
public abstract class Auto {
	/**
	 * ��������
	 */
	private String name;
	
	/**
	 * ����������
	 */
	abstract public void run();
	
	/**
	 * getter��setter
	 */
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
}
