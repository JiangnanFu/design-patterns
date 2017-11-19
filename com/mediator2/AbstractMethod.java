package com.mediator2;

import java.util.Observable;
/**
 * ����ĳ��в�������
 * @author liuqian
 *
 */
public abstract class AbstractMethod extends Observable{
	/**
	 * ����������
	 */
	private String methodName;

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	
	/**
	 * �Ƿ��������
	 */
	private boolean ready;

	public boolean isReady() {
		return ready;
	}

	public void setReady(boolean ready) {
		this.ready = ready;
		System.out.println(methodName + " �Ƿ�����ִ�У�" + ready);
	}
	/**
	 * �Ƿ���
	 */
	private boolean work;

	public boolean isWork() {
		return work;
	}

	public void setWork(boolean work) {
		this.work = work;
		/**
		 * ֪ͨ�۲����Ѿ��ı�
		 */
		this.setChanged();
		this.notifyObservers();
	}
	
	/**
	 * ��������
	 */
	public void action() {
		if (ready) {
			System.out.println("=============" + methodName + "================");
			/**
			 * ��������
			 */
			this.setWork(true);
			System.out.println(methodName + "............done!");
			this.setWork(false);
		} else {
			System.out.println("��ǰ������" + methodName + "!");
		}
	}
	
	/**
	 * ���췽��
	 */
	public AbstractMethod() {
		/**
		 * ���þ���
		 */
		ready = true;
		
		/**
		 * ����δ����
		 */
		work = false;
	}
	
	
}
