package com.chainofresponsibility2;
/**
 * 
 * @author liuqian
 *
 */
public abstract class Sign {

	/**
	 * ��һ��ǩ����
	 */
	private Sign next;

	public Sign getNext() {
		return next;
	}

	public void setNext(Sign next) {
		this.next = next;
	}
	
	/**
	 * ǩ�ַ���
	 */
	public void sign(Record record){
		if (next == null){
			return;
		} else {
			next.sign(record);
		}
	}
}
