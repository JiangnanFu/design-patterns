package com.facade;

import java.util.Scanner;

/**
 * ����
 * 
 * @author liuqian
 * 
 */
public class Saler {
	/**
	 * ��������
	 */
	public void work(Scanner scanner) {
		/**
		 * �ۻ�Ա����ѡ��
		 */
		System.out.println("������Ҫ�����Ʒ��ţ�");
		System.out.println("1.����       2.����      3.ϴ�»�         4.�յ�");
		/**
		 * �˿͹���
		 */
		String buyCode = scanner.nextLine();
		System.out.println("лл������" + buyCode + "����Ʒ��");
	}
}
