package com.proxy;
/**
 * ������Ա
 * @author liuiqian
 *
 */
public class Saler {
	/**
	 * ��ѡ�ֻ���������Ա�ṩģ�ͻ�
	 */
	public Phone choosePhone(String brand, String series, String color){
		return new DummyPhone(brand,series,color);
	}
	
	/**
	 * �����ֻ�����ʱ������Ա�ṩ���
	 */
	public Phone buyPhone(String brand, String series, String color){
		Depot.getInstance();
		Phone phone = Depot.getPhone(brand, series, color);
		if(phone == null){
			System.out.println(color + "ɫ" + brand + series + "�ֻ��޻�");
			return null;
		}
		System.out.println("����" + phone.getColor() + "ɫ" + phone.getBrand() 
				+ phone.getSeries() + "һ��");
		return phone;
	}
}
