package com.builderFactory1;

/**
 * ���ӻ�������
 * @author liuiqian
 *
 */
public class GoodsBuilderImplTV extends GoodsBuilder {

	@Override
	public void createMainProduct() {
		// TODO Auto-generated method stub
		getProductList().add(new Product("TV", 2999.99f));
	}

	@Override
	public void createAdd1Product() {
		// TODO Auto-generated method stub
		getProductList().add(new Product("��ʾDVD", 5.99f));
	}

	@Override
	public void createAdd2Product() {
		// TODO Auto-generated method stub
		getProductList().add(new Product("��������", 199.05f));
	}
	
	
}
