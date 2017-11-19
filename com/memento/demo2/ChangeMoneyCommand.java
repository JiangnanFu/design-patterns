package com.memento.demo2;

/**
 * �޸ı���¼
 * 
 * @author liuqian
 * 
 */
public class ChangeMoneyCommand implements ICommand {

	/**
	 * ���汸��¼
	 */
	private IMemento memento;

	/**
	 * ִ������
	 */
	@Override
	public void execute(Object... objects) {
		// ��������¼
		memento = MoneyOriginator.getInstance().createMemento();

		/**
		 * ִ�иı䣬������Ҫ����һ��String���͵Ĳ���
		 */
		if (objects.length == 1) {
			MoneyOriginator.getInstance().setMoney((Float) objects[0]);
		} else {
			throw new RuntimeException("�������Ϸ�");
		}
	}

	@Override
	public void undo() {
		MoneyOriginator.getInstance().setMemento(memento);
	}

}
