package com.composite;

import java.util.Collection;
import java.util.LinkedList;

public class Department extends CompanyElement {

	private Collection<CompanyElement> children = new LinkedList<CompanyElement>();

	// �ղ������췽��
	public Department() {
		super();
	}

	// ���������췽��
	public Department(CompanyElement parent, String name, String job,
			float salary) {
		super(parent, name, job, salary);
	}

	@Override
	public void add(CompanyElement component) throws UnsupportedMethodException {
		component.setParent(this);
	}

	@Override
	public void remove(CompanyElement component)
			throws UnsupportedMethodException {
		// TODO Auto-generated method stub
		component.setParent(null);
	}

	@Override
	public Collection<CompanyElement> getChildren()
			throws UnsupportedMethodException {
		return children;
	}

	@Override
	public void setChildren(Collection<CompanyElement> children)
			throws UnsupportedMethodException {
		this.children = children;
	}

	// ��д���󷽷�
	@Override
	public void work() {
		System.out.println(this.toString() + " ֪ͨ������");
		try {
			// ֪ͨ�����еĵ�λԪ��ִ�й�������
			for (CompanyElement e : getChildren()) {
				e.work();
			}
		} catch (UnsupportedMethodException e) {
			e.printStackTrace();
		}

	}
	
	@Override
	public float getSalary() {
		// ��ʼ�����ϵ�нˮ
		this.setSalary(0f);
		// ����Ԫ�ؽ�нˮ���
		for (CompanyElement e : children) {
			this.setSalary(super.getSalary() + e.getSalary());
		}
		// ���ؼ�����нˮ
		return super.getSalary();
	}

}
