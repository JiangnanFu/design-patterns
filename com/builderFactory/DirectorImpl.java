package com.builderFactory;

import java.util.List;

public class DirectorImpl extends Director {

	/**
	 * ���췽��
	 * @param builder
	 */
	public DirectorImpl(Builder builder) {
		super(builder);
		// TODO Auto-generated constructor stub
	}

	/**
	 * ��д����ķ���
	 */
	@Override
	public List construct() {
		// TODO Auto-generated method stub
		getBuilder().init();
		
		/**
		 * ��������
		 */
		getBuilder().createFoodA();
		getBuilder().createFoodB();
		getBuilder().createDrink();
		getBuilder().createAddition();
		
		/**
		 * �õ���Ʒ
		 */
		return getBuilder().getProductList();
	}

}
