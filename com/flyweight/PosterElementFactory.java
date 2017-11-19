package com.flyweight;

import java.awt.Font;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * ��Ԫģʽ�Ĺ���ģʽ
 * 
 * @author liuqian
 * 
 */
public class PosterElementFactory {
	/**
	 * ����ģʽ
	 */
	private static PosterElementFactory fac;

	/**
	 * ����ģʽʵ����ȡ����
	 */
	public synchronized static PosterElementFactory getFactory() {
		if (fac == null) {
			fac = new PosterElementFactory();
		}
		return fac;
	}

	/**
	 * ����ģʽ���췽��
	 */
	private PosterElementFactory() {
	}

	/**
	 * ��ԪԪ�ص�����
	 */
	public static final String ElementType_Charactor = "Charactor";
	public static final String ElementType_Image = "Image";
	/**
	 * Flyweight���󻺴��
	 */
	private Map<String, Map<Object, PosterElementFlyweight>> fwMap = new HashMap<>();

	/**
	 * font���󻺴��
	 */
	private Set<Font> fontSet = new HashSet<>();

	/**
	 * ��ȡ�������
	 */
	public synchronized Font getFont(Font font) {
		/**
		 * �鿴�����Ƿ��Ѵ���
		 */
		if (fontSet.contains(font)) {
			// ���ڴ˶�����ֱ��ʹ��ԭ�ж���
			for (Font f : fontSet) {
				if (f.equals(font)) {
					return f;
				}
			}
		} else {
			// �����ڴ˶��������˶���
			fontSet.add(font);
		}
		return font;
	}

	/**
	 * ��ȡһ����Ԫ����
	 * 
	 * @param ElementType
	 * @param key
	 * @return
	 */
	public synchronized PosterElementFlyweight getFw(String ElementType,
			Object key) {
		// �鿴�˶����Ƿ��Ѵ���
		if (fwMap.get(ElementType).containsKey(key)) {
			// ���ڴ˶�����ֱ��ʹ��ԭ�ж���
			return fwMap.get(ElementType).get(key);
		} else {
			// �����ڴ˶����������¶���
			PosterElementFlyweight fwObj = null;
			if (PosterElementFactory.ElementType_Charactor.equals(ElementType)) {
				fwObj = new FwChar((Character) key);
			} else if (PosterElementFactory.ElementType_Image
					.equals(ElementType)) {
				fwObj = new FwImage((String) key);
			} else {
				throw new RuntimeException("��֧�ִ������");
			}
			// ���뼯����
			fwMap.get(ElementType).put(key, fwObj);
			return fwObj;
		}

	}

	/**
	 * ��������Ԫ����
	 * 
	 * @param ElementType
	 * @param str
	 * @return
	 */
	public synchronized FwPoster getPoster(String ElementType, String str) {
		if (fwMap.get(ElementType) == null) {
			fwMap.put(ElementType,
					new HashMap<Object, PosterElementFlyweight>());
		}

		FwPoster fwPoster = new FwPoster();
		if (PosterElementFactory.ElementType_Charactor.equals(ElementType)) {
			for (int i = 0; i < str.length(); i++) {
				fwPoster.getElist().add(
						getFw(PosterElementFactory.ElementType_Charactor,
								str.charAt(i)));
			}
		} else if (PosterElementFactory.ElementType_Image.equals(ElementType)) {
			fwPoster.getElist().add(
					getFw(PosterElementFactory.ElementType_Image, str));
		} else {
			throw new RuntimeException("��֧�ִ������");
		}
		return fwPoster;
	}

	/**
	 * ��ʾFlyweight���󻺴��״̬
	 */
	public void showStatus() {
		if (fwMap.get(ElementType_Charactor) != null) {
			System.out.println("�ַ�����������"
					+ fwMap.get(ElementType_Charactor).size());
		}
		if (fwMap.get(ElementType_Image) != null) {
			System.out
					.println("ͼƬ�����������" + fwMap.get(ElementType_Image).size());
		}
		System.out.println(fontSet.size());
	}

}
