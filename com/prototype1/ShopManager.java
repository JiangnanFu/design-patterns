package com.prototype1;

import java.util.Map;
import java.util.TreeMap;

/**
 * ��Ʒ�Ĺ�����
 * 
 * @author liuiqian
 * 
 */
public class ShopManager {
	/**
	 * ���ڱ������еĵ��̣����ڲ�ѯ�Ϳ�¡
	 */
	private static Map<String, Shop> shopMap = new TreeMap<String, Shop>();

	/**
	 * ���ҵ���
	 */
	public static Shop findShop(String name) {
		return shopMap.get(name);
	}

	/**
	 * ������������
	 */
	public static void addShop(Shop shop) {
		shopMap.put(shop.getName(), shop);
	}
	
	/**
	 * ɾ������
	 */
	public static void removeShop(String name) {
		shopMap.remove(name);
	}
	
	/**
	 * ��ʾ���е�����Ϣ
	 */
	public static void showAllShop() {
		for (Map.Entry<String, Shop> entry : shopMap.entrySet()) {
			System.out.println(entry.getValue());
		}
		System.out.println();
	}
}
