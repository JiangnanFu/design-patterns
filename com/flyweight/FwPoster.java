package com.flyweight;

import java.awt.Dimension;
import java.awt.Font;
import java.util.LinkedList;
import java.util.List;

public class FwPoster extends PosterElementFlyweight {
	/**
	 * Ԫ���б�
	 */
	private List<PosterElementFlyweight> elist;

	/**
	 * Ԫ��ʹ�õ�����
	 */
	private Font font;

	/**
	 * ����������
	 */
	private PosterContext ctx;
	
	/**
	 * Ԫ�ش�С����ͼƬʹ��
	 */
	private Dimension dimension;

	public List<PosterElementFlyweight> getElist() {
		return elist;
	}

	public void setElist(List<PosterElementFlyweight> elist) {
		this.elist = elist;
	}

	public Font getFont() {
		return font;
	}

	public void setFont(Font font) {
		this.font = font;
	}

	public PosterContext getCtx() {
		return ctx;
	}

	public void setCtx(PosterContext ctx) {
		this.ctx = ctx;
	}
	
	public Dimension getDimension() {
		return dimension;
	}

	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}

	/**
	 * ���췽��
	 */
	public FwPoster(){
		this.elist = new LinkedList<>();
	}

	/**
	 * �滭����
	 */
	@Override
	public void draw(Font font, Dimension dimension, PosterContext ctx) {
		// ������������������ԣ������Լ��ģ������ô����
		this.font = (this.font == null ? font : this.font);
		this.dimension = (this.dimension == null ? dimension : this.dimension);
		this.ctx = (this.ctx == null ? ctx : this.ctx);
		//�������ϵĶ���
		for(PosterElementFlyweight e : elist){
			e.draw(this.font, this.dimension, this.ctx);
		}

	}
	/**
	 * ��������״̬
	 */
	public void setStatus(Font font, Dimension dimension, PosterContext ctx){
		this.font = font;
		this.dimension = dimension;
		this.ctx = ctx;
	}

}
