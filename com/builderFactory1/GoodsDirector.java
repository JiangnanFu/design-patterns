package com.builderFactory1;

import java.util.List;

/**
 * ��������
 * @author liuiqian
 *
 */
public abstract class GoodsDirector {

	/**
	 * �ۺϴ�������
	 */
	private GoodsBuilder goodsBuilder;

	public GoodsBuilder getGoodsBuilder() {
		return goodsBuilder;
	}

	public void setGoodsBuilder(GoodsBuilder goodsBuilder) {
		this.goodsBuilder = goodsBuilder;
	}

	public GoodsDirector(GoodsBuilder goodsBuilder) {
		super();
		this.goodsBuilder = goodsBuilder;
	}
	
	/**
	 * ������Ʒ
	 */
	public abstract List<Product> construct();
	
}
