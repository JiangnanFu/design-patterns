package com.memento.demo2;

/**
 * ������Ϣԭ�����࣬����ģʽ
 * 
 * @author liuqian
 * 
 */
public class MoneyOriginator implements IOriginator {

	/**
	 * ����Initialization on Demand Holder idiom ���쵥����
	 * 
	 * �ڲ���̬�࣬����������
	 * 
	 */
	static class SingletonHolder {
		static MoneyOriginator instance = new MoneyOriginator();
	}

	public static MoneyOriginator getInstance() {
		return SingletonHolder.instance;
	}

	private MoneyOriginator() {
	}
	
	/**
	 * �ڲ�״̬
	 */
	private float money = 0;
	
	public float getMoney() {
		return money;
	}
	
	public void setMoney(float money) {
		System.out.println("set money" + money);
		this.money = money;
	}

	@Override
	public IMemento createMemento() {
		return this.new MoneyMemento(this);
	}

	@Override
	public void setMemento(IMemento memento) {
		this.setMoney(((MoneyMemento)memento).getState());
	}
	
	/**
	 * ����¼���ڲ���
	 */
	private class MoneyMemento implements IMemento {
		/**
		 * �����״̬
		 */
		private float state;

		public float getState() {
			return state;
		}

		public void setState(float state) {
			this.state = state;
		}
		
		/**
		 * ���췽��
		 */
		public MoneyMemento(MoneyOriginator originator){
			this.state = originator.getMoney();
		}
		
	}

}
