package com.iterator;

/**
 * ���弯����
 * @author liuqian
 *
 */
public class AggregateImpl extends Aggregate {

	/**
	 * һ������
	 */
	private int[] aIntList;
	
	/**
	 * ���췽��
	 */
	public AggregateImpl() {
		aIntList = new int[] {3, 4, 6, 2, 9};
	}
	/**
	 * �õ����ϴ�С
	 * @return
	 */
	public int getSize(){
		return aIntList.length;
	}
	
	/**
	 * ȡ�ü���Ԫ��
	 * @param index
	 * @return
	 */
	public int getItem(int index){
		return aIntList[index];
	}
	
	/**
	 * ����������
	 */
	@Override
	public Iterator createIterator() {
		return new IteratorImpl(this);
	}

}
