package com.visitor;

/*
 * ��װ������
 */
public interface IVisitor {

	void visit(FoodGoods g);
	
	void visit(ToyGoods g);
	
	void visit(CollectionGoods g);
}
