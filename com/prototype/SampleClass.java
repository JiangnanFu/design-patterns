package com.prototype;

/**
 * ʵ����ԭ��ģʽ�ļ���
 * @author liuiqian
 *
 */
public class SampleClass implements Prototype{

	private int i;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	
	
	public SampleClass(int i) {
		super();
		this.i = i;
	}

	@Override
	public Prototype clone() {
		// TODO Auto-generated method stub
		return new SampleClass(this.getI());
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Integer.toString(this.getI());
	}
	
	
}
