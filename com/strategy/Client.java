package com.strategy;

/**
 * ����ģʽ + ״̬ģʽ
 * @author liuqian
 *
 */
public class Client {

	public static void main(String[] args) {
		/**
		 * ��������
		 */
		Shop shop = Shop.getInstance();
		
		/**
		 * ���õ�ǰ״̬
		 */
		shop.setDiscountState(HalfDiscountState.getInstance());
		
		/**
		 * ����������Ʒ
		 */
		Goods g1 = new Goods(GoodsType.��װ,  55.8f, "ţ�п�");
		Goods g2 = new Goods(GoodsType.ʳƷ,  9.8f, "ţ��");
		Goods g3 = new Goods(GoodsType.�޷���,  120.6f, "ƽ�׹�");
		
		/**
		 * ����۸�
		 */
		shop.check(g1);
		shop.check(g2);
		shop.check(g3);
		
		/**
		 * �ı�״̬
		 */
		shop.setDiscountState(HalfDiscountState.getInstance());
		/**
		 * ����۸�
		 */
		shop.check(g1);
		shop.check(g2);
		shop.check(g3);
	}

}
