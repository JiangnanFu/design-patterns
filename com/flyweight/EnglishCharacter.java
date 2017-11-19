package com.flyweight;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;

public class EnglishCharacter extends CharFlyweight {

	/**
	 * ��������״̬
	 * @param englishChar
	 */
	public EnglishCharacter(char englishChar) {
		super(englishChar);
	}

	/**
	 * ��������״̬
	 */
	@Override
	public void draw(Point position, Color color, Font font) {
		System.out.println("�ַ���" + getEnglishChar());
		System.out.println("\tλ�ã�X:" + position.getX() + " Y:"
				+ position.getY());
		System.out.println("\t��ɫ��" + color.toString());
		System.out.println("\t���壺" + font.toString());
	}

}
