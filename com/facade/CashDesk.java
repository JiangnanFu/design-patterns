package com.facade;

import java.util.Scanner;

/**
 * �տ�
 * 
 * @author liuqian
 * 
 */
public class CashDesk {
	/**
	 * ��������
	 */
	public void work(Scanner scanner) {
		/**
		 * ����Ա��ʾ����
		 */
		System.out.println("�븶��");
		/**
		 * �˿͸���
		 */
		String money = scanner.nextLine();
		System.out.println("��л������" + money + "Ԫ��");
	}
}
