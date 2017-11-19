package com.flyweight;

import java.awt.Dimension;
import java.awt.Font;

public class PosterClient {

	/**
	 * ������Ԫ����
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// ���������ģ�����ֽ�Ŵ�С
		PosterContext ctx = new PosterContext(new Dimension(1024, 768));
		// ��������
		PosterElementFactory fac = PosterElementFactory.getFactory();

		// ����һ���ı�����
		FwPoster textSpan_1 = fac.getPoster(
				PosterElementFactory.ElementType_Charactor, "����");

		textSpan_1.setStatus(fac.getFont(new Font("����", Font.PLAIN, 12)),
				new Dimension(0, 0), ctx);
		// ����ͼƬ����
		FwPoster imageSpan_1 = fac.getPoster(
				PosterElementFactory.ElementType_Image, "image_1");
		imageSpan_1.setStatus(null, new Dimension(100, 200), ctx);

		// ����һ���ı�����
		FwPoster textSpan_2 = fac.getPoster(
				PosterElementFactory.ElementType_Charactor, "zoo");

		textSpan_2.setStatus(fac.getFont(new Font("Century", Font.BOLD, 12)),
				new Dimension(0, 0), ctx);
		// ����ͼƬ����
		FwPoster imageSpan_2 = fac.getPoster(
				PosterElementFactory.ElementType_Image, "image_2");
		imageSpan_2.setStatus(null, new Dimension(50, 100), ctx);

		// ������϶���
		FwPoster compPoster = new FwPoster();
		compPoster.getElist().add(textSpan_1);
		compPoster.getElist().add(imageSpan_1);
		compPoster.getElist().add(textSpan_2);
		compPoster.getElist().add(imageSpan_2);

		// ��ӡ�� ���Բ��������ֲ�������Ϊʹ����ϵ�����״̬
		compPoster.draw(null, null, null);

	}

}
