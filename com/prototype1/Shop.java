package com.prototype1;

import java.util.ArrayList;
import java.util.List;

public class Shop implements Cloneable {

	/**
	 * ����������ΪID
	 */
	private String name;

	/**
	 * ��Ʒ�б�
	 */
	private List<Goods> goodLists = new ArrayList<Goods>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Goods> getGoodLists() {
		return goodLists;
	}

	public void setGoodLists(List<Goods> goodLists) {
		this.goodLists = goodLists;
	}

	/**
	 * ��Ϊÿһ�����̶���Ψһ�����ƣ� �����б�Ҫ��һ��������Ϊ���¡֮������÷���
	 */
	public void init(String name) {
		this.setName(name);
	}

	public Object clone() {
		try {
			Shop shop = (Shop) super.clone();
			shop.setGoodLists(new ArrayList<Goods>());
			for (Goods g : goodLists) {
				shop.getGoodLists().add((Goods) g.clone());
			}
			return shop;
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("name:[" + this.getName() + "]goods:[");
		for (Goods goods : getGoodLists()){
			sb.append(goods.getName() + "/" + goods.getPrice() + ",");
		}
		//�ж����һ���ַ��Ƿ���","���Ǿ�ɾ��
		if (sb.charAt(sb.length() - 1) == ','){
			sb.deleteCharAt(sb.length() - 1);
		}
		sb.append("]");
		return sb.toString();
	}
}
