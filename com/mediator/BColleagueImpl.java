package com.mediator;
/*
 * ͬ��B
 */
public class BColleagueImpl implements IColleague {

	/**
	 * �ۺϵ�ͣ�߶���
	 */
	private IMediator mediator;
	
	public IMediator getMediator() {
		return mediator;
	}

	public void setMediator(IMediator mediator) {
		this.mediator = mediator;
	}

	/**
	 * �ı䷽��
	 */
	public void change() {
		/**
		 * ί�е�ͣ�����иı䷽��
		 */
		System.out.println("BColleagueImpl �ı�");
		mediator.changed(this);
	}


	@Override
	public void action() {
		System.out.println("BColleagueImpl �õ�����");
	}

}
