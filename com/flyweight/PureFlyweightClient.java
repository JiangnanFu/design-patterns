package com.flyweight;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;

/**
 * ������Ԫģʽ�Ĳ�����
 * @author liuqian
 *
 */
public class PureFlyweightClient {

	/**
	 * ��ʾOOP�����ַ�
	 * @param args
	 */
	public static void main(String[] args) {
		// ��ʾFlyweight���󻺴��״̬
		CharFlyweightFactory.showStatus();
		CharFlyweight char1 = CharFlyweightFactory.getCharFlyweight('O');
		CharFlyweight char2 = CharFlyweightFactory.getCharFlyweight('O');
		CharFlyweight char3 = CharFlyweightFactory.getCharFlyweight('P');
		// ��ʾFlyweight���󻺴��״̬
		CharFlyweightFactory.showStatus();
		//��� �ַ�
		char1.draw(new Point(0, 0), Color.red, new Font("����", Font.BOLD, 1));
		char2.draw(new Point(1, 1), Color.red, new Font(Font.SERIF, Font.ITALIC, 5));
		char3.draw(new Point(2, 5), Color.red, new Font(Font.MONOSPACED, Font.PLAIN, 8));
	}

}
