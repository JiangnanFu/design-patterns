package com.memento.demo2;

/*
 * ԭ�����ӿ�
 */
public interface IOriginator {
	/**
	 * ��������¼����
	 */
	public IMemento createMemento();
	
	/**
	 * �ָ�״̬
	 */
	public void setMemento(IMemento memento);
}
