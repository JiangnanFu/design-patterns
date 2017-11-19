package com.strategy;

public class HalfDiscountState implements IDiscountState {

	// �۸�ϵ��
		private float discount = 0.5f;

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
		private String msg = "���";

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
			static HalfDiscountState instance = new HalfDiscountState();
		}

		public static HalfDiscountState getInstance() {
			return SingletonHolder.instance;
		}

		private HalfDiscountState() {
		}

}
