package com.decorator;

public class WashGoodsDecorator extends EmployeeDecorator {

	public WashGoodsDecorator(Employee employee) {
		super(employee);
	}

	@Override
	public void work() {
		//ǰ���ǹ���ǰ��ϴ��Ʒ������Ҫ�������λ��
		wash();
		super.work();
	}
	
	//����һ����������
	public void wash(){
		System.out.println(this.getName() + " ��ʼ��ϴ��Ʒ��");
	}
}
