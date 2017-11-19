package com.observer.demo2;

import java.util.Vector;

/*
 * ������������
 */
public abstract class Subject {
	/**
	 * ����һ�����Ĺ�����
	 */
	private static final ChangeManager changeManager = ChangeManager.getInstance();
	
	public static ChangeManager getChangeManager() {
		return changeManager;
	}
	
	/**
	 * ����������
	 */
	public void addObserver(IObserver observer){
		getChangeManager().register(this, observer);
	}
	
	/**
	 * �Ƴ�������
	 */
	public synchronized void removeObservers(IObserver observer) {
		getChangeManager().unregister(this, observer);
	}
	
	/**
	 * ֪ͨ����
	 */
	public void notify(Object args) {
		getChangeManager().notifyBySubject(this, args);
	}
	
}
