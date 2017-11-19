package com.visitor;
/*
 * ʳ����Ʒ
 */
public class FoodGoods extends Goods{

	/**
	 * ���췽��
	 */
	public FoodGoods(String name, float price){
		this.setName(name);
		this.setPrice(price);
	}

	/**
	 * ���ܷ����߷���
	 */
	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

}
