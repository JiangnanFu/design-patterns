package com.singleton;

/**
 * �����˻�����Ψһ��
 * @author liuiqian
 *
 */
public class BankAccount {

	private String name = "ģʽ�������˻�";
	
	private double money = 0;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMoney() {
		return money;
	}

	/**
	 * �����ý��ķ�������Ϊͬ������ֹ���ֶ��߳��쳣
	 * @param money
	 */
	public synchronized void setMoney(double money) {
		this.money = money;
	}
	
	
}
