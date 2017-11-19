package com.flyweight;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;

import sun.font.FontDesignMetrics;
/**
 * �����ַ���
 * @author liuqian
 *
 */
public class FwChar extends PosterElementFlyweight {

	/**
	 * ����״̬
	 */
	private char achar;
	
	public char getAchar() {
		return achar;
	}


	public void setAchar(char achar) {
		this.achar = achar;
	}

	/**
	 * ��������״̬
	 * @param c
	 */
	public FwChar(char c){
		this.setAchar(c);
	}
	
	/**
	 * ��������״̬
	 */
	@Override
	public void draw(Font font, Dimension dimension, PosterContext ctx) {
		// ����ַ�
		System.out.println("�ַ���" + getAchar());
		System.out.println("\tλ�ã� X:" + ctx.getNowPosition().x
				+ " Y:" + ctx.getNowPosition().y);
		System.out.println("\t���壺" + font.toString());
		//����������״̬
		FontMetrics fm = FontDesignMetrics.getMetrics(font);
		ctx.put(new Dimension(fm.charWidth(getAchar()), fm.getHeight()));

	}

}
