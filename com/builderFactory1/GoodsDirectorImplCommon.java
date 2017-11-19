package com.builderFactory1;

import java.util.List;

public class GoodsDirectorImplCommon extends GoodsDirector {

	public GoodsDirectorImplCommon(GoodsBuilder goodsBuilder) {
		super(goodsBuilder);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Product> construct() {
		// TODO Auto-generated method stub
		getGoodsBuilder().init();
		/**
		 * ��������
		 */
		getGoodsBuilder().createMainProduct();
		getGoodsBuilder().createAdd1Product();

		/**
		 * �õ���Ʒ
		 */
		return getGoodsBuilder().getProductList();
	}

}
