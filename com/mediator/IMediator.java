package com.mediator;

/**
 * ��ͣ�߽ӿ�
 * @author liuqian
 *
 */
public interface IMediator {
	/**
	 * ֪ͨ�ı䷽��
	 */
	void changed(IColleague colleague);
	
	/**
	 * ��������ͬ�¶���
	 */
	void createColleagues();
}
