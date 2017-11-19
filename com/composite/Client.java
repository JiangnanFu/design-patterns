package com.composite;
/**
 * ������֯�ṹ�ͻ���
 * @author liuqian
 *
 */
public class Client {

	public static void main(String[] args) {
		//ʵ����������֯�Ķ���
		CompanyElement root = new Department(
				null, "�����Ŷ�", "", 0f);
		CompanyElement saleDept = new Department(
				root, "���۲�", "����", 0f);
		CompanyElement saleDept_1 = new Department(
				saleDept, "�����ŶӼ�", "����", 0f);
		CompanyElement financialDept = new Department(
				root, "����", "����", 0f);
		
		CompanyElement ceo = new Person(
				root, "����Ⱥ", "CEO", 10000f);
		CompanyElement cfo = new Person(
				root, "������", "CFO", 8000f);
		CompanyElement saler_1 = new Person(
				saleDept, "�����", "������Ա", 3000f);
		CompanyElement saler_2 = new Person(
				saleDept_1, "½����", "������Ա", 2000f);
		CompanyElement financial_1 = new Person(
				financialDept, "����ɺ", "������Ա", 2000f);
		
		System.out.println("���Ը���");
		root.work();
		System.out.println("������϶���");
		saleDept.work();
		System.out.println("���Ե�������");
		saler_2.work();
		
		System.out.println(root.getName() + "�Ĺ����ǣ�"
				+ root.getSalary());
		System.out.println(cfo.getName() + "�Ĺ����ǣ�"
				+ cfo.getSalary());
	}
}
