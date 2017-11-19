package com.state.demo1;

/**
 * �̵�
 * 
 * @author liuqian
 * 
 */
public class Shop {
	/**
	 * �̵�״̬ "ready"׼�����ţ�"open"���ţ� "close"����
	 */
	private String state;
	
	/**
	 * �̵�����
	 */
	private String name;
	
	/**
	 * ���췽��
	 * @param name
	 * @param state
	 */
	public Shop(String name, String state){
		super();
		this.state = state;
		this.name = name;
	}
	
	/**
	 * �̵ꡰ׼�����š�����
	 */
	public void ready() {
		/**
		 * ֻ�е�״̬��closeʱ׼�����Ų��Ǻ��ʵ�
		 */
		if(state.equals("close")){
			state = "ready";
		} else {
			throw new RuntimeException("״̬����ȷ");
		}
	}
	
	/**
	 * �̵ꡰ���š�����
	 */
	public void open() {
		/**
		 * ֻ�е�״̬��readyʱ���Ų��Ǻ��ʵ�
		 */
		if(state.equals("ready")){
			state = "open";
		} else {
			throw new RuntimeException("״̬����ȷ");
		}
	}
	
	/**
	 * �̵ꡰ���š�����
	 */
	public void close(){
		/**
		 * ֻ�е�״̬��ready��openʱ���Ų��Ǻ��ʵ�
		 */
		if(state.equals("ready") || state.equals("open")){
			state = "close";
		} else {
			throw new RuntimeException("״̬����ȷ");
		}
	}
	
	/**
	 * ��ѯ״̬
	 */
	public void checkState() {
		if (state.equals("open")){
			System.out.println(name + "��������");
		}
		if (state.equals("ready")) {
			System.out.println(name + "׼����������");
		}
		if (state.equals("close")) {
			System.out.println(name + "������");
		}
	}
}
