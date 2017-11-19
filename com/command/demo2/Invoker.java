package com.command.demo2;

import java.util.LinkedList;
import java.util.List;

/*
 * ���������
 */
public class Invoker {
	/**
	 * ��������ļ���
	 */
	private List<Command> list = new LinkedList<>();

	public List<Command> getList() {
		return list;
	}

	public void setList(List<Command> list) {
		this.list = list;
	}
	
	/**
	 * ���浱ǰ������е�λ��
	 */
	private int position = -1;
	
	/**
	 * ִ������
	 * @param command
	 */
	public void executeCommmand(Command command) {
		/**
		 * �����������
		 */
		list.add(++position, command);
		//ִ������
		command.execute();
		
		/**
		 * ������β���Ķ�������ɾ��
		 */
		if(position < this.getList().size() - 1){
			for (int i = this.getList().size() -1; i > position; i --){
				this.getList().remove(i);
			}
		}
	}
	
	/**
	 * ��������
	 */
	public void redoCommand() {
		if (this.getList().size() -1 > position){
			/**
			 * ִ������
			 */
			this.getList().get(++position).redo();
		} else {
			System.out.println("������Ч");
		}
	}
	
	/**
	 * ��������
	 */
	public void undoCommand() {
		if (position >= 0){
			//����
			this.getList().get(position--).undo();
		}
	}
}
