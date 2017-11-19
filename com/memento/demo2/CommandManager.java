package com.memento.demo2;

import java.util.LinkedList;
import java.util.List;

/**
 * ��������࣬��ͬ�ڸ����ˣ�����ģʽ
 * 
 * @author liuqian
 * 
 */
public class CommandManager {
	/**
	 * ���� Initialization on Demand Holder idiom ���쵥���� 
	 * 
	 * �ڲ���̬�࣬����������
	 */
	static class SingletonHolder {
		static CommandManager instance = new CommandManager();
	}
	
	public static CommandManager getInstance() {
		return SingletonHolder.instance;
	}
	
	private CommandManager() {}
	
	/**
	 * ������������
	 */
	private List<ICommand> commandList =  new LinkedList<>();
	
	/**
	 * ִ������
	 */
	public void execute(ICommand command, Object...objects){
		System.out.println("ִ������" + command);
		/**
		 * ִ��
		 */
		command.execute(objects);
		/**
		 * ����
		 */
		commandList.add(command);
	}
	
	/**
	 * ȡ������
	 */
	public void undo() {
		if(commandList.size() > 0){
			/**
			 * �Ƴ����һ������
			 */
			ICommand command =  commandList.remove(
					commandList.size() - 1);
			/**
			 * ȡ������
			 */
			System.out.println("ȡ������" + command);
			command.undo();
		} else {
			System.out.println("����������ѿ�");
		}
	}
}
