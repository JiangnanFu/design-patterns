package com.strategy;

/*
 * �����ۿ�
 */
public class NormalDiscountState implements IDiscountState {

	// �۸�ϵ��
	private float discount = 1;

	@Override
	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	/**
	 * ״̬����
	 */
	private String msg = "û���ۿ�";

	@Override
	public String getMsg() {
		// TODO Auto-generated method stub
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	/**
	 * ����Initialization on Demand Holder idiom ���쵥���� �ڲ���̬�࣬����������
	 */
	static class SingletonHolder {
		static NormalDiscountState instance = new NormalDiscountState();
	}

	public static NormalDiscountState getInstance() {
		return SingletonHolder.instance;
	}

	private NormalDiscountState() {
	}

}
