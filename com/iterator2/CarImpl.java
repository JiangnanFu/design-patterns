package com.iterator2;

import java.util.LinkedList;
import java.util.List;

/**
 * ���ﳵ��
 * @author liuqian
 *
 */
public class CarImpl implements ICar {

	private List<Goods> goodsList;
	
	/**
	 * �õ����ϴ�С
	 * @return
	 */
	public int getSize(){
		return goodsList.size();
	}
	/**
	 * ȡ�ü���Ԫ��
	 * @param index
	 * @return
	 */
	public Goods getItem(int index){
		return goodsList.get(index);
	}
	/**
	 * ���췽��
	 */
	public CarImpl(){
		goodsList = new LinkedList<>();
	}
	
	/**
	 * ����Ԫ�ط���
	 * @param goods
	 */
	public void add(Goods goods){
		goodsList.add(goods);
	}
	
	/**
	 * ����������
	 */
	@Override
	public IIterator createIterator() {
		return new IteratorImpl(this);
	}

	@Override
	public IIterator createSortIterator() {
		// TODO Auto-generated method stub
		return new IteratorSortImpl(this);
	}

}
