package com.composite;

public class Person extends CompanyElement {

	@Override
	public void work() {
		System.out.println(this.toString() + " �����ˣ� ");
	}
	
	//�ղ������췽��
	public Person(){
		super();
	}
	
	//���������췽��
	public Person(CompanyElement parent,
			String name, String job, float salary){
		super(parent, name, job, salary);
	}

}
