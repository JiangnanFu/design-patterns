package com.command.demo1;
/**
 * ��ͷ��绰�Ĺ˿�
 * @author liuqian
 *
 */
public class Customer {
	
	public static void main(String[] args) {
		//����绰���ͷ�
		PhoneMan phoneMan = new PhoneMan();
		/**
		 * ѡ���������
		 */
		phoneMan.service(ServiceType.��ѯ);
		phoneMan.service(ServiceType.Ͷ��);
	}
}
