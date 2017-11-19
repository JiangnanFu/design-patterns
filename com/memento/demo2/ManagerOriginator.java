package com.memento.demo2;

/*
 * ��������Ϣԭ�����࣬����ģʽ
 */
public class ManagerOriginator implements IOriginator {

	/**
	 * ����Initialization on Demand Holder idiom ���쵥����
	 * 
	 * �ڲ���̬�࣬����������
	 *
	 */
	static class SingletonHolder{
		static ManagerOriginator instance = new ManagerOriginator();
	}
	
	public static ManagerOriginator getInstance() {
		return SingletonHolder.instance;
	}
	
	private ManagerOriginator() {}
	
	/**
	 * �ڲ�״̬
	 */
	private String managerName = "Ŀǰδ����";
	
	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		System.out.println("set managerName " + managerName);
		this.managerName = managerName;
	}

	/**
	 * ��������¼
	 */
	@Override
	public IMemento createMemento() {
		return this.new ManagerMemento(this);
	}

	/**
	 * �ָ�����¼
	 */
	@Override
	public void setMemento(IMemento memento) {
		this.setManagerName(((ManagerMemento)memento).getState());
	}
	
	/**
	 * ����¼���ڲ���
	 */
	private class ManagerMemento implements IMemento {
		/**
		 * �����״̬
		 */
		private String state;

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}
		
		public ManagerMemento(ManagerOriginator originator){
			this.state = originator.getManagerName();
		}
	}

}
