package com.interpreter;

/*
 * �����Ļ���
 */
public class Context {
	/**
	 * ����
	 */
	public String tracnlator(String expression) {
		/**
		 * �ָ���ʽ
		 */
		String[] split = expression.split(" ");
		
		/**
		 * �����������
		 */
		Translator msgCode = new MsgCode(split[0]);
		Translator msgLanguage = new MsgLanguage(msgCode, split[1]);
		
		/**
		 * ����
		 */
		return msgLanguage.translate(this);
	}
}
