package com.decorator;

public class CosmeticsSalesEmployee extends Employee {

	//���췽��
	public CosmeticsSalesEmployee(String name){
		super(name);
	}
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println(getName() + "��ʼ���ۻ�ױƷ��");
	}

}
