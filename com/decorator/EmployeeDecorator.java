package com.decorator;

/**
 * ��Աװ�γ�����
 * 
 * @author liuqian
 * 
 */
public abstract class EmployeeDecorator extends Employee {

	private Employee employee;

	// װ��ģʽ���췽��
	public EmployeeDecorator(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return employee.getName();
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		employee.work();
	}

}
