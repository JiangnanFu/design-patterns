package com.decorator;

public class Client {

	public static void main(String[] args) {
		// ����һ������ˮ����Ա
		Employee fruitSaler = new FruitSalesEmployee("����ң");
		// ����һ����ױƷ������Ա
		Employee cosmeticsSaler = new CosmeticsSalesEmployee("�����");

		System.out.println("log: ��ְ������ʼ");
		fruitSaler.work();
		cosmeticsSaler.work();

		System.out.println("log: װ�ι�����ʼ");
		// ʹ��װ����
		// ���ݲ�ͬ����Ҫ����װ���������
		fruitSaler = new CleanDecorator(new WashGoodsDecorator(
				new WashGoodsDecorator(fruitSaler)));
		fruitSaler.work();

		cosmeticsSaler = new ArrangeGoodsDecorator(new CleanDecorator(
				cosmeticsSaler));
		cosmeticsSaler.work();
	}

}
