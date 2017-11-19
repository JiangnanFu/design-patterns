package com.builderFactory;

import java.util.List;

/**
 * ��������
 * 
 * @author liuiqian
 * 
 */
public abstract class Director {

	/**
	 * �ۺϵ�һ�����崴������
	 */
	private Builder builder;

	public Builder getBuilder() {
		return this.builder;
	}

	public void setBuilder(Builder builder) {
		this.builder = builder;
	}

	/**
	 * ���췽��
	 */
	public Director(Builder builder) {
		super();
		this.builder = builder;
	}

	/**
	 * ������Ʒ
	 */
	public abstract List construct();
}
