package com.memento.demo2;

/*
 * ����¼ģʽ + ����ģʽ
 */
public class Client {

	public static void main(String[] args) {
		/**
		 * ����������(���������)
		 */
		CommandManager commandManager = CommandManager.getInstance();
		
		/**
		 * ִ������
		 */
		commandManager.execute(new ChangeManagerCommand(), "����");
		commandManager.execute(new ChangeMoneyCommand(), 555f);
		
		/**
		 * ��������
		 */
		commandManager.undo();
		commandManager.undo();
		commandManager.undo();
	}

}
