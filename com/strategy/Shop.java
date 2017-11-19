package com.strategy;

/*
 * �̵굥����
 * �����ۿ�ʱ�ȼ���״̬�ۿۣ��ټ�����Ʒ�����ۿ�
 */
public class Shop {
	/**
	 * �ۺ�״̬����
	 */
	private IDiscountState discountState;

	/**
	 * �ۺϲ��Զ���
	 */
	private IStrategy strategy;

	public void setDiscountState(IDiscountState discountState) {
		this.discountState = discountState;
	}

	public IDiscountState getDiscountState() {
		return discountState;
	}

	/**
	 * �����ۿۺ�Ľ��
	 */
	public double check(Goods goods) {
		/**
		 * ����״̬�ۿ�
		 */
		float money = goods.getPrice() * discountState.getDiscount();
		try {
			/**
			 * ��������ۿ�
			 */
			strategy = (IStrategy) Class.forName(
					XmlTool.getInstance().findStrategyClass(
							goods.getGoodsType().name())).newInstance();

			money *= strategy.getRate();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(goods.getName() + "[" + goods.getGoodsType() + "]"
				+ " ԭ�ۣ�" + goods.getPrice() + " ȫ���ۿۣ�"
				+ discountState.getDiscount() + " ��Ʒ�Żݣ�" + strategy.getRate()
				+ " ���ռ۸�" + money);
		
		return money;
	}
	
	/**
	 * ����Initialization on Demand Holder idiom ���쵥���� �ڲ���̬�࣬����������
	 */
	static class SingletonHolder {
		static Shop instance = new Shop();
	}

	public static Shop getInstance() {
		return SingletonHolder.instance;
	}

	private Shop() {
	}
}
