package com.bridge.example;

/**
 * ���Ը����������Ϸ��������
 * 
 * @author liuiqian
 * 
 */
public class Client {
	public static void main(String[] args) {
		System.out.println("����һ�����");
		Host host = new Ps3(new ButtonHandle(), new DVD());
		host.work();
		
		System.out.println("������һ�����");
		Host host2 = new Xbox360(new WheelHandle(), new HardDisk());
		host2.work();
	}
}
