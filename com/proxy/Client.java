package com.proxy;
/**
 * �˿�
 * @author liuiqian
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=====�����ֻ�ģ��======");
		Saler saler = new Saler();
		Phone phone = saler.choosePhone("NOKIA", "N95", "��");
		phone.call();
		System.out.println("=====�����ֻ�=====");
		phone = saler.buyPhone("APPLE", "iphone", "��");
		phone.call();
		System.out.println("=====�����޻��ֻ�=====");
		phone = saler.buyPhone("APPLE", "iphone", "��");
	}

}
