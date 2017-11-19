package com.chainofresponsibility;

public class Client {
	public static void main(String[] args) {
		/**
		 * �����������
		 */
		Handler topHandler = new AddHandler();
		Handler mulHandler = new MulHandler();
		Handler divHandler = new DivHandler();
		
		/**
		 * ��װ�������ṹ����
		 * +----------+   +-----------+    +------------+
		 * |topHandler +--->+ mulHandler +-->+ divHandler| 
		 * +----------+   +-----------+    +------------+
		 */
		mulHandler.setNextHandler(divHandler);
		topHandler.setNextHandler(mulHandler);
		
		/**
		 * ��������
		 */
		System.out.println("34*23=" + topHandler.handle(34, 23, "*"));
		System.out.println("34/23=" + topHandler.handle(34, 23, "/"));
	}
}
