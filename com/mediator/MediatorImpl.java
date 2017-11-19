package com.mediator;
/*
 * �����ͣ��
 */
public class MediatorImpl implements IMediator {

	/**
	 * �ۺ�ͬ�¶���
	 */
	AColleagueImpl aColleagueImpl;
	BColleagueImpl bColleagueImpl;
	
	public AColleagueImpl getaColleagueImpl() {
		return aColleagueImpl;
	}

	public void setaColleagueImpl(AColleagueImpl aColleagueImpl) {
		this.aColleagueImpl = aColleagueImpl;
	}

	public BColleagueImpl getbColleagueImpl() {
		return bColleagueImpl;
	}

	public void setbColleagueImpl(BColleagueImpl bColleagueImpl) {
		this.bColleagueImpl = bColleagueImpl;
	}

	/**
	 * ֪ͨ�ı䷽��
	 */
	@Override
	public void changed(IColleague colleague) {
		// ��Ǹı�ʱ�Ĵ���
		aColleagueImpl.action();
		bColleagueImpl.action();
	}

	/**
	 * ��������ͬ�¶���
	 */
	@Override
	public void createColleagues() {
		/*
		 * ʵ����
		 */
		aColleagueImpl = new AColleagueImpl();
		bColleagueImpl = new BColleagueImpl();
		
		/**
		 * ��������
		 */
		aColleagueImpl.setMediator(this);
		bColleagueImpl.setMediator(this);

	}

}
