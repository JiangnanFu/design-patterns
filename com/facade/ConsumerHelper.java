package com.facade;

import java.util.Scanner;

/**
 * ��������
 * @author liuqian
 *
 */
public class ConsumerHelper {

	/**
	 * ������Ա
	 */
	private Saler saler = new Saler();
	
	/**
	 * ����Ա
	 */
	private CashDesk cashDesk = new CashDesk();
	
	/**
	 * ע��Ա
	 */
	private Register register = new Register();
	
	/**
	 * �ͻ�Ա
	 */
	private Deliverer deliverer = new Deliverer();
	
	/**
	 * ��������
	 */
	public void help() {
		System.out.println("��������˵����ʼ���");
		/**
		 * �ͻ��������ɨ����
		 */
		Scanner scanner = new Scanner(System.in);
		
		/**
		 * �����˿�ȥ����
		 */
		saler.work(scanner);
		/**
		 * �����˿�ȥ����
		 */
		cashDesk.work(scanner);
		/**
		 * �����˿�ȥ�Ǽ�
		 */
		register.work(scanner);
		/**
		 * �����˿Ͱ����ͻ�
		 */
		deliverer.work(scanner);
		System.out.println("��������˵�����������");
	}
}
