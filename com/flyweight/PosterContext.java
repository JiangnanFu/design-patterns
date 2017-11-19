package com.flyweight;

import java.awt.Dimension;
import java.awt.Point;

/**
 * ����������
 * @author liuqian
 *
 */
public class PosterContext {
	/**
	 * ֽ�Ŵ�С
	 */
	private Dimension pageSize;
	
	/**
	 * ��ǰλ��
	 */
	private Point nowPosition;
	/**
	 * ���췽��
	 * @param pageSize
	 */
	public PosterContext(Dimension pageSize){
		this.pageSize = pageSize;
		//����Ĭ��Ϊλ��
		this.setNowPosition(new Point(0, 0));
	}
	
	/**
	 * ����һ��Ԫ�أ���ǰλ���ƶ�
	 */
	public void put(Dimension dimension) {
		//�ƶ�x����
		this.getNowPosition().x = this.getNowPosition().x + dimension.width;
		if(this.getNowPosition().x < 0 || this.getNowPosition().x > pageSize.width){
			throw new RuntimeException("����ֽ�ű߽�");
		}
	}

	public Dimension getPageSize() {
		return pageSize;
	}

	public void setPageSize(Dimension pageSize) {
		this.pageSize = pageSize;
	}

	public Point getNowPosition() {
		return nowPosition;
	}

	public void setNowPosition(Point nowPosition) {
		this.nowPosition = nowPosition;
	}
	
	
}
