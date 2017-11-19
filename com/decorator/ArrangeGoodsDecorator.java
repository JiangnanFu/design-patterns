package com.decorator;

public class ArrangeGoodsDecorator extends EmployeeDecorator {

	public ArrangeGoodsDecorator(Employee employee) {
		super(employee);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void work() {
		//ǰ���ǹ���ǰ������������Ҫ�������λ��
		arrange();
		super.work();
	}

	//����һ����������
	private void arrange() {
		System.out.println(this.getName() + " ��ʼ������ܣ�");
	}
	
	

}
