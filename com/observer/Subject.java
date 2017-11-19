package com.observer;

import java.util.Vector;

/*
 * ������������
 */
public abstract class Subject {
	/**
	 * ���ڴ�ż������ļ��ϣ��˼����̰߳�ȫ
	 */
	private Vector<IObserver> observers;
	
	/**
	 * ���췽��
	 */
	public Subject(){
		observers = new Vector<IObserver>();
	}
	
	/**
	 * �������������˷�����Ҫͬ��
	 */
	public synchronized void addObserver(IObserver observer){
		observers.add(observer);
	}
	
	/**
	 * ɾ�����м��������˷�����Ҫͬ��
	 */
	public synchronized void removeObservers() {
		observers.clear();
	}
	
	/**
	 * ֪ͨ����
	 */
	public synchronized void notifyObservers(Object args) {
		for (IObserver observer : observers){
			observer.update(this, args);
		}
	}
	
}
