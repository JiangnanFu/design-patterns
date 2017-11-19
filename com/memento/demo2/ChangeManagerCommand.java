package com.memento.demo2;

/**
 * �޸ľ���������
 * 
 * @author liuqian
 * 
 */
public class ChangeManagerCommand implements ICommand {

	/**
	 * ���汸��¼
	 */
	private IMemento memento;

	@Override
	public void execute(Object... objects) {
		// ��������¼
		memento = ManagerOriginator.getInstance().createMemento();

		/**
		 * ִ�иı䣬������Ҫ����һ��String���͵Ĳ���
		 */
		if (objects.length == 1) {
			ManagerOriginator.getInstance().setManagerName((String) objects[0]);
		} else {
			throw new RuntimeException("�������Ϸ�");
		}
	}

	/**
	 * ��������
	 */
	@Override
	public void undo() {
		ManagerOriginator.getInstance().setMemento(memento);
	}

}
