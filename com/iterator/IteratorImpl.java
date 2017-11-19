package com.iterator;

public class IteratorImpl extends Iterator {

	/**
	 * ά����ǰ������
	 */
	private int index;

	/**
	 * ����
	 */
	private AggregateImpl aggregateImpl;

	/**
	 * ���췽��
	 */
	public IteratorImpl(AggregateImpl aggregateImpl) {
		this.aggregateImpl = aggregateImpl;
		first();
	}

	@Override
	public void first() {
		index = 0;
	}

	@Override
	public void next() {
		if (index < aggregateImpl.getSize()) {
			index++;
		}
	}

	@Override
	public boolean isDone() {
		if (index >= aggregateImpl.getSize()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Object currentItem() {
		// TODO Auto-generated method stub
		return aggregateImpl.getItem(index);
	}

}
