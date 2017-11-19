package com.interpreter;

import java.util.Locale;
import java.util.ResourceBundle;

/*
 * ��Ϣ����
 */
public class MsgLanguage implements Translator {

	/**
	 * ������Դ�ļ�·��
	 */
	private String bName = "com.interpreter.msg";
	
	/**
	 * �����Ҫ�����ķ�������
	 */
	private Translator trans;
	
	/**
	 * �����Ҫ���������
	 */
	private String lang;
	
	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public Translator getTrans() {
		return trans;
	}

	public void setTrans(Translator trans) {
		this.trans = trans;
	}
	
	/**
	 * ���췽��
	 * @param trans
	 * @param lang
	 */
	public MsgLanguage(Translator trans, String lang) {
		super();
		this.trans = trans;
		this.lang = lang;
	}

	/**
	 * ���뷽��
	 */
	@Override
	public String translate(Context ctx) {
		/**
		 * ���ض�����Դ�ļ�
		 */
		ResourceBundle res = ResourceBundle.getBundle(bName, new Locale(lang));
		/**
		 * ���ط�����
		 */
		return res.getString(trans.translate(ctx));
	}

}
