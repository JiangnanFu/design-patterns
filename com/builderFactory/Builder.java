package com.builderFactory;

import java.util.ArrayList;
import java.util.List;

public abstract class Builder {

	/**
	 * ��Ʒ���б�
	 */
	private List productList;

	public List getProductList() {
		return this.productList;
	}
	
	public void setProductList(List productList) {
		this.productList = productList;
	}
	
	/**
	 * ��ʼ���������µĲ�Ʒ�б�
	 */
	public void init() {
		this.productList = new ArrayList();
	}
	
	/**
	 * ���·���Ϊ������Ʒ�ķ���
	 * ע��˴�������Ϊ���󷽷��ĺô��ǣ�
	 * ����Ǿ�������û��ĳ����������������Զ����ø���Ŀշ���
	 * �����󷽷���ǿ������ʵ�֣���ɱ���ϵ�����
	 */
	public void createFoodA() {
		
	}
	
	public void createFoodB() {
		
	}
	
	public void createDrink() {
		
	}
	
	public void createAddition() {
		
	}
	
}
