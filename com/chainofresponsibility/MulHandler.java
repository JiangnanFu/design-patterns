package com.chainofresponsibility;

/**
 * ���崦���࣬�˷�
 * @author liuqian
 *
 */
public class MulHandler extends Handler {
	/**
	 * ��д���෽��
	 */
	@Override
	public Object handle(double num1, double num2, String calaulateType) {
		// ����ǳ˷��ʹ���������Ǿ͵��ø����Ĭ�ϴ�����
		if (calaulateType.equals("*")) {
			return num1 * num2;
		} else {
			return super.handle(num1, num2, calaulateType);
		}
	}
}
