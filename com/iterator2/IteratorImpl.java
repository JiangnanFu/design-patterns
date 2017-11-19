package com.iterator2;
/**
 * ��ͨ������
 * @author liuqian
 *
 */
public class IteratorImpl implements IIterator {

	/*
	 * ��ǰ����
	 */
	private int index;
	
	/**
	 * ����
	 */
	private CarImpl carImpl;
	
	/**
	 * ���췽��
	 * @param carImpl
	 */
	public IteratorImpl(CarImpl carImpl){
		this.carImpl = carImpl;
		first();
	}
	
	@Override
	public void first() {
		index = 0;
	}

	@Override
	public void next() {
		if (index < carImpl.getSize()){
			index ++;
		}
	}

	@Override
	public boolean isDone() {
		if(index >= carImpl.getSize()){
			return true;
		}
		return false;
	}

	@Override
	public Goods currentItem() {
		return carImpl.getItem(index);
	}

}
