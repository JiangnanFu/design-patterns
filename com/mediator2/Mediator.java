package com.mediator2;

import java.util.Observable;
import java.util.Observer;
/**
 * ��ͣ����
 *
 */
public class Mediator implements Observer {

	/**
	 * �ۺϷ�������
	 */
	private Inventory inventory;
	private Purchase purchase;
	private Sell sell;
	
	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public Purchase getPurchase() {
		return purchase;
	}

	public void setPurchase(Purchase purchase) {
		this.purchase = purchase;
	}

	public Sell getSell() {
		return sell;
	}

	public void setSell(Sell sell) {
		this.sell = sell;
	}
	/**
	 * �������з�������
	 */
	public void createMethods() {
		/**
		 * ����
		 */
		inventory = new Inventory();
		purchase = new Purchase();
		sell = new Sell();
		
		/**
		 * �����۲��߶���
		 */
		inventory.addObserver(this);
		purchase.addObserver(this);
		sell.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		// ת��Ϊ��������
		AbstractMethod abstractMethod = (AbstractMethod) o;
		/**
		 * ҵ���߼�
		 */
		if(abstractMethod instanceof Sell) {
			//����ʱ�����Խ����������̵�
			if(abstractMethod.isWork()){
				inventory.setReady(false);
			} else {
				inventory.setReady(true);
			}
		} else if (abstractMethod instanceof Purchase) {
			//����ʱ���������ۣ������̵�
			if(abstractMethod.isWork()){
				inventory.setReady(false);
			} else {
				inventory.setReady(true);
			}
		} else if (abstractMethod instanceof Inventory) {
			//�̵�ʱ���������ۣ��������
			if (abstractMethod.isWork()) {
				sell.setReady(false);
				purchase.setReady(false);
			} else {
				sell.setReady(true);
				purchase.setReady(true);
			}
		}

	}

}
