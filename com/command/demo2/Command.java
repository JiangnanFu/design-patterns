package com.command.demo2;
/**
 * ����ӿ�
 * @author liuqian
 *
 */
public interface Command {
	/**
	 * ִ�з���
	 */
	void execute();
	
	/**
	 * ��������
	 */
	void undo();
	
	//��������
	void redo();
	
	
}
