package com.observer.demo2;

import java.util.Hashtable;
import java.util.Vector;

/**
 * ���Ĺ�������������
 * @author liuqian
 *
 */
public class ChangeManager {
	/**
	 * ��������
	 */
	private static final ChangeManager cm = new ChangeManager();
	
	/**
	 * ����ӳ���ϵ
	 */
	private static Hashtable<Subject, Vector<IObserver>> map = new Hashtable<>();
	
	/**
	 * ˽�й��췽��
	 */
	private ChangeManager() {
		
	}
	
	/**
	 * ������÷���
	 */
	public static ChangeManager getInstance() {
		return cm;
	}
	
	/**
	 * ע�������
	 * @param subject
	 * @param observer
	 */
	public synchronized void register(Subject subject, IObserver observer){
		Subject key = subject;
		Vector<IObserver> observers = null;
		
		/**
		 * �鿴�˶����Ƿ���ע��
		 */
		if (map.containsKey(key)){
			observers = map.get(key);
		}
		
		/**
		 * �鿴�˶����Ӧ�ļ��������б��Ƿ����
		 */
		if (observers == null) {
			observers = new Vector<IObserver>();
		}
		
		/**
		 * �鿴�������Ƿ��ظ�
		 */
		if (!observers.contains(observer)){
			observers.add(observer);
		}
		/**
		 * ����ӳ���ϵ
		 */
		map.put(key, observers);
	}
	
	/**
	 * ���������ע��
	 * @param subject
	 * @param observer
	 */
	public synchronized void unregister(Subject subject, IObserver observer){
		map.get(subject).remove(observer);
	}
	
	public synchronized void notifyBySubject(Subject subject, Object args){
		for (IObserver observer : map.get(subject)){
			observer.update(subject, args);
		}
	}
}
