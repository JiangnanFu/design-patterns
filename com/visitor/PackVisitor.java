package com.visitor;
/*
 * ��װ������
 */
public class PackVisitor implements IVisitor {

	@Override
	public void visit(FoodGoods g) {
		System.out.println("�� ʳƷ��װ��" + g.getName());
	}

	@Override
	public void visit(ToyGoods g) {
		System.out.println("�� ��߰�װ��" + g.getName());
	}

	@Override
	public void visit(CollectionGoods g) {
		System.out.println("��϶���ֲ��װ");
	}

}
