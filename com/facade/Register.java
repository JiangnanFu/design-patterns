package com.facade;

import java.util.Scanner;

/**
 * �Ǽ�
 * @author liuqian
 *
 */
public class Register {
	/**
	 * ��������
	 */
	public void work(Scanner scanner) {
		/**
		 * ��ʾ�Ǽ�
		 */
		System.out.println("��������ϵ�绰");
		/**
		 * �˿͸���
		 */
		String telCode = scanner.nextLine();
		System.out.println("�Ѽ�¼���ĵ绰���룺" + telCode);
	}
}
