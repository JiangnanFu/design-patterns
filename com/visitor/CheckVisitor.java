package com.visitor;

/*
 * ���˷�����
 */
public class CheckVisitor implements IVisitor {

	/**
	 * �ܽ��
	 */
	private double countMoney = 0;
	
	public double getCountMoney() {
		return countMoney;
	}

	public void setCountMoney(double countMoney) {
		this.countMoney = countMoney;
	}

	@Override
	public void visit(FoodGoods g) {
		double d = g.getPrice() * 0.75;
		countMoney += d;
		System.out.println("�� ʳƷ7.5�ۣ�\t" + d);
	}

	@Override
	public void visit(ToyGoods g) {
		double d = g.getPrice() * 0.8;
		countMoney += d;
		System.out.println("�� ���8�ۣ�\t" + d);
	}

	@Override
	public void visit(CollectionGoods g) {
		System.out.println("��϶���ֲ����");
	}

}
