package com.interpreter;

/*
 * ��Ϣ����
 */
public class MsgCode implements Translator {
	/**
	 * ��ŵı��
	 */
	private String code;
	
	public MsgCode(String code) {
		super();
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String translate(Context ctx) {
		return code;
	}

}
