package com.interpreter;

public class Client {

	public static void main(String[] args) {
		/**
		 * ����������
		 */
		Context ctx = new Context();
		
		/**
		 * ִ�в���
		 */
		System.out.println("001 zh =>" + ctx.tracnlator("001 zh"));
		System.out.println("001 en =>" + ctx.tracnlator("001 en"));
		
		System.out.println("002 zh =>" + ctx.tracnlator("002 zh"));
		System.out.println("002 en =>" + ctx.tracnlator("002 en"));
	}

}
