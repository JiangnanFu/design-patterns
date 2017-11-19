package com.decorator;

public class CleanDecorator extends EmployeeDecorator {

	public CleanDecorator(Employee employee) {
		super(employee);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		super.work();
		clean();
	}
	
	//����һ����������
	public void clean(){
		System.out.println(this.getName() + "��ʼ��ɨ��");
	}
	

}
