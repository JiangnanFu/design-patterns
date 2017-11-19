package com.prototype;

import java.util.ArrayList;
import java.util.List;

public class Client_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * ��¡�򵥶���
		 */
		SampleClass sc = new SampleClass(99);
		Prototype scc = sc.clone();
		
		/**
		 * �ж϶����Ƿ���ͬ��ָ��
		 */
		System.out.println("sc==scc ? " + (sc == scc));
		/**
		 * �ж�ֵ�Ƿ����
		 */
		System.out.println("sc: " + sc.toString());
		System.out.println("scc: " + scc.toString());
		
		/**
		 * ��¡���Ӷ���
		 */
		ComplexClass cc = new ComplexClass();
		cc.setStr("һ���ַ���");
		List list = new ArrayList();
		list.add("�ִ�");
		list.add(25);
		cc.setList(list);
		
		Prototype ccc = cc.clone();
		
		/**
		 * �ж϶����Ƿ���ͬ��ָ��
		 */
		System.out.println("cc==ccc ? " + (cc == ccc));
		/**
		 * �ж�ֵ�Ƿ����
		 */
		System.out.println("cc: " + cc.toString());
		System.out.println("ccc: " + ccc.toString());
	}

}
