package com.decorator;
/**
 * ˮ��������Ա
 * @author liuqian
 *
 */
public class FruitSalesEmployee extends Employee {

	//���췽��
	public FruitSalesEmployee(String name){
		super(name);
	}
	//��д����ĳ��󷽷�
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println(getName() + "��ʼ����ˮ��");
		
	}

	
}
