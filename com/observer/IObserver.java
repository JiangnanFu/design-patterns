package com.observer;
/*
 * �������ӿ�
 */
public interface IObserver {

	/**
	 * ���·���
	 * @param subject �������
	 * @param args ���²���
	 */
	void update(Subject subject, Object args);
}
