package com.iterator2;
/**
 * ���������
 * @author liuqian
 *
 */
public class IteratorSortImpl implements IIterator {

	/**
	 * ��ǰ����
	 */
	private int index;
	
	/**
	 * �ź���ļ���
	 */
	private Goods[] goodsArray;
	
	/**
	 * ���췽��
	 * @param carImpl
	 */
	public IteratorSortImpl(CarImpl carImpl){
		/**
		 * ���Ƽ���
		 */
		goodsArray = new Goods[carImpl.getSize()];
		for(int i = 0; i < carImpl.getSize(); i++){
			goodsArray[i] = carImpl.getItem(i);
		}
		
		/**
		 * ����
		 */
		sort();
		
		first();
	}
	
	/**
	 * ð������
	 */
	public void sort(){
		for (int i = 0; i < goodsArray.length - 1; i++){
			for (int j = 0; j < goodsArray.length - i - 1; j++){
				/**
				 * ���ս���С��������
				 */
				if(goodsArray[j].getPrice() > goodsArray[j + 1].getPrice()){
					Goods temp = goodsArray[j + 1];
					goodsArray[j + 1] = goodsArray[j];
					goodsArray[j] = temp;
				}
			}
		}
	}
	
	@Override
	public void first() {
		index = 0;
	}

	@Override
	public void next() {
		if(index < goodsArray.length){
			index ++;
		}
	}

	@Override
	public boolean isDone() {
		if(index >= goodsArray.length){
			return true;
		}
		return false;
	}

	@Override
	public Goods currentItem() {
		return goodsArray[index];
	}

}
