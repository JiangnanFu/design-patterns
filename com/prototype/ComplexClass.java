package com.prototype;

import java.util.List;

/**
 * ʵ����ԭ��ģʽ�ĸ�����
 * @author liuiqian
 *
 */
public class ComplexClass implements Prototype {

	/**
	 * һ���ַ���
	 */
	private String str;
	
	/**
	 * һ������
	 */
	private List list;
	
	
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	@Override
	public Prototype clone() {
		// TODO Auto-generated method stub
		ComplexClass cc = new ComplexClass();
		cc.setList(this.getList());
		cc.setStr(this.getStr());
		return cc;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getStr() + " " + this.getList();
	}

	
}
