package com.bridge;
/**
 * ��־������
 * @author liuiqian
 *
 */
public abstract class Log {
	//�ۺ���ʵ��
	protected LogSave logSave;
	
	/**
	 * ���췽��ִ��ʱ���оۺ�
	 */
	public Log(LogSave logSave) {
		this.logSave = logSave;
	}
	
	//�˴������ɾ���ʵ����ʵ��
	public abstract void writeToLog();
}
