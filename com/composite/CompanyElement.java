package com.composite;

import java.util.Collection;

/**
 * ���ģʽ�ĸ߲����
 * 
 * @author liuqian
 * 
 */
public abstract class CompanyElement {
	// ������
	private CompanyElement parent;
	// ������������
	private String name;
	// ְλ���Ź�������
	private String job;
	// ���ʣ����˹��ʻ��Ź��ʺ�
	private float salary;

	public CompanyElement() {
	}

	public CompanyElement(CompanyElement parent, String name, String job,
			float salary) {
		super();
		this.parent = parent;
		this.name = name;
		this.job = job;
		this.salary = salary;
	}

	// ��ø�����
	public CompanyElement getParent() {
		return parent;
	}

	// ���ø����������ԭ����һ����һԪ��ֻ������һ�����Ԫ��
	public void setParent(CompanyElement parent) {
		// �����Ƴ��ɸ�����
		// ע��˴�Ϊ�˱�֤�Ե��ԣ��������µĸ�����ʱ�������Ƴ���ǰ�ĸ�����
		if (getParent() != null && getParent() != parent) {
			try {
				if (getParent().getChildren().contains(this)) {
					getParent().remove(this);
				}
			} catch (UnsupportedMethodException e) {
				e.printStackTrace();
			}
		}

		// �������ø�����
		try {
			// ע��˴�Ϊ�˱�֤�Ե��ԣ������ø�����ʱ��������������Ҳ����˶���
			this.parent = parent;
			if (parent != null && !parent.getChildren().contains(this)) {
				parent.getChildren().add(this);
			}
		} catch (UnsupportedMethodException e) {
			e.printStackTrace();
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	// ע��˷����ǳ��󷽷�
	public abstract void work();

	// �˷����׳��쳣
	public void add(CompanyElement component) throws UnsupportedMethodException {
		throw new UnsupportedMethodException();
	}

	// �˷����׳��쳣
	public void remove(CompanyElement component)
			throws UnsupportedMethodException {
		throw new UnsupportedMethodException();
	}

	// �˷����׳��쳣
	public Collection<CompanyElement> getChildren()
			throws UnsupportedMethodException {
		throw new UnsupportedMethodException();
	}

	// �˷����׳��쳣
	public void setChildren(Collection<CompanyElement> children)
			throws UnsupportedMethodException {
		throw new UnsupportedMethodException();
	}

	// ��д��������
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		// ʹ�õݹ�ķ�ʽ�����Ԫ�صĲ������
		if (this.getParent() != null) {
			// ����и�Ԫ��
			sb.append(this.getParent().toString() + " ������ ");
		} else {
			// ���û�и�������д����Ϣ
		}
		sb.append(this.getName() + "[" + this.getJob() + "]");
		return sb.toString();
	}

}
