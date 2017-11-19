package com.proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * ���вɹ��ʹ洢���ܵĲֿ�
 * @author liuiqian
 *
 */
public class Depot {
	/**
	 * ����ģʽʹ�õ�����ʵ��
	 */
	private static Depot depot;
	
	/**
	 * �ֿ⵱ǰ����
	 */
	private static Map<Phone, Integer> reserve;
	
	/**
	 * ����ģʽ��òֿ�ʵ��
	 */
	public static synchronized Depot getInstance() {
		if(depot == null){
			depot = new Depot();
		}
		return depot;
	}
	
	/**
	 * ����ģʽ��Ҫ˽�еĹ��췽��
	 */
	private Depot() {
		//����������
		reserve = new HashMap<Phone, Integer>();
		//��һЩ��������
		reserve.put(new MobilePhone(
				"NOKIA","N95","��"), 3);
		reserve.put(new MobilePhone(
				"APPLE","iphone","��"), 5);
	}
	
	/**
	 * �ڲֿ���ȡ���ֻ����˷���ע��Ҫͬ��
	 */
	public synchronized static Phone getPhone(String brand, 
			String series, String color){
		Phone phone = new MobilePhone(brand, series, color);
		//�鿴�Ƿ�����ſ��ֻ�
		if(reserve.containsKey(phone) && reserve.get(phone) > 0){
			//����һ
			reserve.put(phone, reserve.get(phone) - 1);
			return phone;
		}
		return null;
	}
	
}
