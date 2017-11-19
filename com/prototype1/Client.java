package com.prototype1;

public class Client {

	public static void main(String[] args) {
		//�����ܵ�
		Shop shop = new Shop();
		shop.setName("DPC�����ܵ�");
		shop.getGoodLists().add(new Goods("���ӽ�", 299.99));
		shop.getGoodLists().add(new Goods("���Ѿ�", 500.5));
		shop.getGoodLists().add(new Goods("����", 5.9));
		
		ShopManager.addShop(shop);
		
		//��ʾ���е�����Ϣ
		ShopManager.showAllShop();
		
		//���Ƶ���
		Shop myShop = (Shop) ShopManager.findShop("DPC�����ܵ�").clone();
		myShop.init("DPC�����ֵ�1");
		myShop.getGoodLists().add(new Goods("����ͷ", 4.9));
		ShopManager.addShop(myShop);
		
		Shop myShop2 = (Shop) ShopManager.findShop("DPC�����ֵ�1").clone();
		myShop2.init("DPC�����ֵ�2");
		myShop2.getGoodLists().clear();
		myShop2.getGoodLists().add(new Goods("��Ϻ", 900.67));
		ShopManager.addShop(myShop2);
		
		ShopManager.showAllShop();
		
		
	}

}
