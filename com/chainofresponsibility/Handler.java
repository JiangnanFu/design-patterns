package com.chainofresponsibility;
/*
 * ������ģʽ������
 */
public abstract class Handler {
	/**
	 * �����������һ���ڵ����
	 */
	private Handler nextHandler;

	public Handler getNextHandler() {
		return nextHandler;
	}

	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}
	
	/**
	 * Ĭ�ϵĴ�������ķ���
	 */
	public Object handle(double num1, double num2, String calaulateType){
		if(nextHandler == null){
			return null;
		} else {
			return nextHandler.handle(num1, num2, calaulateType);
		}
	}
}
