package com.mediator;
/*
 * ͬ��A
 */
public class AColleagueImpl implements IColleague {

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
		System.out.println("AColleagueImpl �ı�");
		mediator.changed(this);
	}


	@Override
	public void action() {
		System.out.println("AColleagueImpl �õ�����");
	}

}
