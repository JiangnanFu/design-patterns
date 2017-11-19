package com.flyweight;

import java.awt.Dimension;
import java.awt.Font;

public class FwImage extends PosterElementFlyweight {

	/**
	 * ����״̬
	 */
	private String imgName;
	
	public String getImgName() {
		return imgName;
	}

	public void setImgName(String imgName) {
		this.imgName = imgName;
	}
	
	/**
	 * ���췽��
	 */
	public FwImage(String imgName){
		this.imgName = imgName;
	}

	/**
	 * ��������״̬
	 */
	@Override
	public void draw(Font font, Dimension dimension, PosterContext ctx) {
		// ��ʾͼƬ
		System.out.println("ͼƬ��" + getImgName());
		System.out.println("\tλ�ã� X:" + ctx.getNowPosition().x
				+ " Y:" + ctx.getNowPosition().y);
		System.out.println("\t��С��w:" + dimension.width + " h:"
				+ dimension.height);
		//����������״̬
		ctx.put(dimension);
	}

}
