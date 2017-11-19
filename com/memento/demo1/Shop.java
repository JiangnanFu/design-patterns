package com.memento.demo1;
/**
 * ���б���״̬����Ʒ��
 * @author liuqian
 *
 */
public class Shop {
	/**
	 * Ӫҵ����
	 */
	private float money;

	public float getMoney() {
		return money;
	}

	/**
	 * ��Ҫ�����½��ʱ��������һ�����
	 * @param money
	 */
	public void setMoney(float money) {
		save();
		this.money = money;
	}
	
	/**
	 * ����ǰһ��������
	 */
	private float backupMoney;

	/**
	 * ���淽��
	 */
	private void save() {
		backupMoney = money;
		System.out.println(backupMoney + " ������");
	}
	
	/**
	 * �ָ�����
	 */
	public void restore(){
		money = backupMoney;
		System.out.println(backupMoney + " ���ָ�");
	}
	
	/**
	 * չʾ��ǰ���
	 */
	public void show() {
		System.out.println("��ǰ��" + money);
	}
	
	
}
