package com.mediator;

public class Client {

	public static void main(String[] args) {
		/**
		 * ������ͣ��
		 */
		MediatorImpl mediator = new MediatorImpl();

		/**
		 * ��������ͬ�¶���
		 */
		mediator.createColleagues();

		/**
		 * ���ͬ�¶���
		 */
		AColleagueImpl aColleagueImpl = mediator.getaColleagueImpl();
		BColleagueImpl bColleagueImpl = mediator.getbColleagueImpl();

		/**
		 * ���󻥶�
		 */
		aColleagueImpl.change();
		System.out.println();
		bColleagueImpl.change();
	}

}
