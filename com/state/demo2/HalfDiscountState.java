package com.state.demo2;

/*
 * ���
 */
public class HalfDiscountState implements IDiscountState {

	/**
	 * �ۿ�
	 */
	private float discount = 0.5f;

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	@Override
	public float getDiscount() {
		return discount;
	}

	/**
	 * ״̬����
	 */
	private String msg = "���";

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String getMsg() {
		return msg;
	}
	
	/**
	 * ���� Initialization on Demand Holder idiom ���쵥����
	 * �ڲ���̬�࣬����������
	 *
	 */
	static class SingletonHolder {
		static HalfDiscountState instance = 
				new HalfDiscountState();
	}
	
	public static HalfDiscountState getInstance() {
		return SingletonHolder.instance;
	}
	
	private HalfDiscountState(){
		
	}

}
