package com.facade;

import java.util.Scanner;

/**
 * �ͻ�
 * 
 * @author liuqian
 * 
 */
public class Deliverer {
	/**
	 * ��������
	 */
	public void work(Scanner scanner) {
		/**
		 * ��ʾ�����ͻ�ʱ��
		 */
		System.out.println("������ͻ�ʱ��");
		/**
		 * �˿͸���
		 */
		String date = scanner.nextLine();
		System.out.println("�ͻ�ʱ�䣺" + date);
	}
}
