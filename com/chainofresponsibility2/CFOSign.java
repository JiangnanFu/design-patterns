package com.chainofresponsibility2;

/**
 * ǩ���ߣ�CFO
 * @author liuqian
 *
 */
public class CFOSign extends Sign {
	/**
	 * ��дǩ�ַ���
	 */
	@Override
	public void sign(Record record) {
		// ��ָ����λ��ǩ��
		record.setCfoSign(true);
		/**
		 * ���ø����ǩ�ַ���������һ����Աǩ��
		 */
		super.sign(record);
	}
}
