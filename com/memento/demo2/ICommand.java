package com.memento.demo2;

/**
 * ����ӿ�
 * @author liuqian
 *
 */
public interface ICommand {
	/**
	 * ִ�з��������ö�̬����
	 */
	void execute(Object... objects);
	
	/**
	 * ��������
	 */
	void undo();
}
