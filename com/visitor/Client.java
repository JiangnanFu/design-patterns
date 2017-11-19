package com.visitor;

import java.util.ArrayList;
import java.util.Collection;

/*
 * ������ģʽ
 */
public class Client {

	public static void main(String[] args) {
		/**
		 * ���������߶���
		 */
		PackVisitor v1 = new PackVisitor();
		CheckVisitor v2 = new CheckVisitor();
		
		/**
		 * ��������
		 */
		Collection<Goods> gCollection = new ArrayList<>();
		
		/**
		 * ����������ͨ����
		 */
		Goods a = new FoodGoods("����", 5.3f);
		Goods b = new ToyGoods("ħ��", 35.9f);
		gCollection.add(a);
		gCollection.add(b);
		
		/**
		 * ������϶���cga���ṹ������ʾ
		 * cgb = (a,b)
		 * cga = (a,b,cgb)
		 */
		CollectionGoods cga = new CollectionGoods();
		
		CollectionGoods cgb = new CollectionGoods();
		cgb.getGoodsCollection().add(a);
		cgb.getGoodsCollection().add(b);
		
		cga.getGoodsCollection().add(a);
		cga.getGoodsCollection().add(b);
		cga.getGoodsCollection().add(cgb);
		
		/**
		 * ����
		 */
		System.out.println("���ʰ�װ����");
		a.accept(v1);
		b.accept(v1);
		cga.accept(v1);
		
		System.out.println("���ʼƷѹ���");
		a.accept(v2);
		b.accept(v2);
		cga.accept(v2);
		System.out.println("�����ۺ�ϼƣ� \t" + v2.getCountMoney());
	}

}
