package com.command.demo1;

/**
 * ����Ա
 * 
 * @author liuqian
 * 
 */
public class PhoneMan {

	public void service(ServiceType type) {
		switch (type) {
		case Ͷ��:
			new ServiceManA().answer();
			break;
		case ��ѯ:
			new ServiceManB().response();
			break;
		default:
			System.out.println("��֧�ִ������");
			break;
		}
	}
}
