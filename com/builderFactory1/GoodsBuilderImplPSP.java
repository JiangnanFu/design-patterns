package com.builderFactory1;

/**
 * PSP������
 * @author liuiqian
 *
 */
public class GoodsBuilderImplPSP extends GoodsBuilder {

	@Override
	public void createMainProduct() {
		// TODO Auto-generated method stub
		getProductList().add(new Product("PSP", 1499.99f));
	}

	@Override
	public void createAdd1Product() {
		// TODO Auto-generated method stub
		getProductList().add(new Product("��Ĥ", 1.00f));
		getProductList().add(new Product("�����", 99f));
	}

	@Override
	public void createAdd2Product() {
		// TODO Auto-generated method stub
		getProductList().add(new Product("����", 30.99f));
		getProductList().add(new Product("�轺��", 1499.99f));
	}

	
}
