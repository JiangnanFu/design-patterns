package com.flyweight;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;

/**
 * ������Ԫģʽ������
 * @author liuqian
 *
 */
public abstract class CharFlyweight {
	/**
	 * ����״̬
	 */
	private char englishChar;
	
	/**
	 * ����״̬
	 * @param position
	 * @param color
	 * @param font
	 */
	public abstract void draw(Point position, Color color, Font font);

	public CharFlyweight(char englishChar){
		super();
		this.englishChar = englishChar;
	}

	public char getEnglishChar() {
		return englishChar;
	}

	public void setEnglishChar(char englishChar) {
		this.englishChar = englishChar;
	}
	
	
}
