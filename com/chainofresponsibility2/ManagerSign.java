package com.chainofresponsibility2;

/**
 * ǩ���ߣ�����
 * @author liuqian
 *
 */
public class ManagerSign extends Sign {

	/**
	 * ��дǩ�ַ���
	 */
	@Override
	public void sign(Record record) {
		// ��ָ����λ��ǩ��
		record.setManagerSign(true);
		/**
		 * ���ø����ǩ�ַ���������һ����Աǩ��
		 */
		super.sign(record);
	}
	
	
}
