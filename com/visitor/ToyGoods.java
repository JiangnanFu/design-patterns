package com.visitor;
/*
 * �����Ʒ
 */
public class ToyGoods extends Goods {

	/**
	 * ���췽��
	 * @param name
	 * @param price
	 */
	public ToyGoods(String name, float price){
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
