package com.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * ��Ԫģʽ�Ĺ�������
 * 
 * @author liuqian
 * 
 */
public class CharFlyweightFactory {
	/**
	 * Flyweight���󻺴��
	 */
	private static Map<Character, CharFlyweight> charMap = new HashMap<>();

	public synchronized static CharFlyweight getCharFlyweight(char c) {
		/**
		 * �鿴�����Ƿ����
		 */
		if(charMap.containsKey(c)){
			//���ڴ˶�����ֱ��ʹ��ԭ�еĶ���
			return charMap.get(c);
		} else {
			//�������������µĶ���
			CharFlyweight charFlyweight = new EnglishCharacter(c);
			//���뼯����
			charMap.put(c, charFlyweight);
			return charFlyweight;
		}
	}
	
	/**
	 * ��ʾFlyweight���󻺴��״̬
	 */
	public static void showStatus(){
		System.out.print("flyweight����������" + charMap.size() + "�ַ��б�");
		for(Map.Entry<Character, CharFlyweight> entry : charMap.entrySet()){
			System.out.print(entry.getKey() + "  ");
		}
		System.out.println();
	}
}
