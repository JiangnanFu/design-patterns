package com.chainofresponsibility2;
/**
 * ��Ҫ�����ĵ���
 * @author liuqian
 *
 */
public class Record {

	/**
	 * ��ʾ����ְλ�����Ƿ��Ѿ�ǩ��
	 */
	private boolean managerSign;
	private boolean ceoSign;
	private boolean cfoSign;
	
	public boolean isManagerSign() {
		return managerSign;
	}
	public void setManagerSign(boolean managerSign) {
		this.managerSign = managerSign;
	}
	public boolean isCeoSign() {
		return ceoSign;
	}
	public void setCeoSign(boolean ceoSign) {
		this.ceoSign = ceoSign;
	}
	public boolean isCfoSign() {
		return cfoSign;
	}
	public void setCfoSign(boolean cfoSign) {
		this.cfoSign = cfoSign;
	}
	
	
}
