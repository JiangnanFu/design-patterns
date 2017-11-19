package com.visitor;
/**
 * �������صľ�̬����
 * @author liuqian
 *
 */
public class StaticDispatchTest {

	public static void main(String[] args) {
		Person p = new Person();
		
		/**
		 * ����ʱ�ͱ�ȷ��������
		 * ����ƥ����ȷ
		 */
		Apple x = new Apple();
		Orange y = new Orange();
		p.eat(x);
		p.eat(y);

		/**
		 * ����ʱ�ͱ�ȷ��������
		 * ����ƥ�����eat(Fruit fruit)
		 */
		Fruit a = new Apple();
		Fruit b = new Orange();
		
		p.eat(a);
		p.eat(b);
	}

}

/**
 * ����ˮ����
 * @author liuqian
 *
 */
abstract class Fruit {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void useage() {
		System.out.println("ֱ�ӳ�ˮ��");
	}
	
}

/*
 * ƻ��
 */
class Apple extends Fruit{
	public Apple() {
		super();
		this.setName("ƻ��");
	}
	
	public void useage() {
		System.out.println("ϴϴ��ƻ��");
	}
}

/*
 * ����
 */
class Orange extends Fruit{
	public Orange() {
		super();
		this.setName("����");
	}
	
	public void useage() {
		System.out.println("��Ƥ������");
	}
}


/**
 * �ˣ���������
 */
class Person {
	public void eat(Fruit fruit){
		System.out.println("��ˮ��");
	}
	
	public void eat(Apple fruit){
		System.out.println("��ƻ��");
	}
	
	public void eat(Orange fruit){
		System.out.println("������");
	}
}
