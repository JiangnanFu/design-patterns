package com.chainofresponsibility2;

/**
 * ǩ���ߣ�CEO
 * @author liuqian
 *
 */
public class CEOSign extends Sign {
	/**
	 * ��дǩ�ַ���
	 */
	@Override
	public void sign(Record record) {
		// ��ָ����λ��ǩ��
		record.setCeoSign(true);
		/**
		 * ���ø����ǩ�ַ���������һ����Աǩ��
		 */
		super.sign(record);
	}
}
