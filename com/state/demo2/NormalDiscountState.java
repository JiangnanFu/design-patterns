package com.state.demo2;

/*
 * ���μ��ۿ�
 */
public class NormalDiscountState implements IDiscountState {

	/**
	 * �ۿ�
	 */
	private float discount = 0;
	
	public void setDiscount(float discount) {
		this.discount = discount;
	}

	@Override
	public float getDiscount() {
		return discount;
	}
	
	private String msg = "û���ۿ�";

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
		static NormalDiscountState instance = 
				new NormalDiscountState();
	}
	
	public static NormalDiscountState getInstance() {
		return SingletonHolder.instance;
	}
	
	private NormalDiscountState(){
		
	}

}
