package com.state.demo2;
/*
 * ��Ʒ��
 */
public class Shop {
	/**
	 * �ۿ�״̬��
	 */
	private IDiscountState discountState;

	public IDiscountState getDiscountState() {
		return discountState;
	}

	public void setDiscountState(IDiscountState discountState) {
		this.discountState = discountState;
	}
	
	/**
	 * ����
	 * @param money
	 */
	public void check(float money) {
		System.out.println(discountState.getMsg());
		System.out.println("ԭ�ۣ�" + money + "\t �ּۣ�"
				+ (money * (1 - discountState.getDiscount())));
	}
	
	/**
	 * ��ʼ������
	 */
	public Shop() {
		this.setDiscountState(NormalDiscountState.getInstance());
	}
}
