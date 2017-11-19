package com.singleton;

/**
 * 
 * @author liuiqian
 *����ʽ����ģʽ
 */
public class Singleton {

	/**
	 * ˽�еľ�̬�����������
	 */
	private static final Singleton singleton = new Singleton();
	
	/**
	 * ˽�й��췽��
	 */
	private Singleton() {
		
	}
	
	//���еľ�̬���ʵ������
	public static Singleton getInstance(){
		return singleton;
	}
	
	
}
