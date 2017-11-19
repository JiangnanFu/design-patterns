package com.builderFactory1;

import java.util.ArrayList;
import java.util.List;

/**
 * ������Ʒ������
 * @author liuiqian
 *
 */
public abstract class GoodsBuilder {
	/**
	 * ��Ʒ���б�
	 */
	private List<Product> productList;

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
	
	/**
	 * ��ʼ��
	 */
	public void init() {
		productList = new ArrayList<Product>();
	}
	
	public void createMainProduct() {
		//�շ���
	}
	
	public void createAdd1Product() {
		//�շ���
	}
	
	public void createAdd2Product() {
		//�շ���
	}
}
