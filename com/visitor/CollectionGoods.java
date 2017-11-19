package com.visitor;

import java.util.ArrayList;
import java.util.Collection;

/**
 * �����Ʒ
 * @author liuqian
 *
 */
public class CollectionGoods extends Goods {

	private Collection<Goods> goodsCollection = 
			new ArrayList<Goods>();
	
	public Collection<Goods> getGoodsCollection() {
		return goodsCollection;
	}

	public void setGoodsCollection(Collection<Goods> goodsCollection) {
		this.goodsCollection = goodsCollection;
	}


	/**
	 * ��϶�����ܷ����߷���
	 */
	@Override
	public void accept(IVisitor visitor) {
		for (Goods g : goodsCollection) {
			g.accept(visitor);
		}
		visitor.visit(this);
	}

}
