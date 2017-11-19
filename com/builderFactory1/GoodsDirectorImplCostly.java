package com.builderFactory1;

import java.util.List;

/**
 * �������Ʒ������
 * @author liuiqian
 *
 */
public class GoodsDirectorImplCostly extends GoodsDirector {

	public GoodsDirectorImplCostly(GoodsBuilder goodsBuilder) {
		super(goodsBuilder);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Product> construct() {
		// TODO Auto-generated method stub
		getGoodsBuilder().init();
		getGoodsBuilder().createMainProduct();
		getGoodsBuilder().createAdd1Product();
		getGoodsBuilder().createAdd2Product();
		return getGoodsBuilder().getProductList();
	}

}
