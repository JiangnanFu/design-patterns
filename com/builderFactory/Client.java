package com.builderFactory;

import java.util.List;

/**
 * �ͻ���
 * @author liuiqian
 *
 */
public class Client {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * ����һ�����ݱ���
		 */
		Director director;
		
		/**
		 * ������ͯ�ײ͵Ĺ���
		 * �������ݣ������ض��Ľ������
		 */
		director = new DirectorImpl(new BuilderImplA());
		/**
		 * ����
		 */
		List aList = director.construct();
		/**
		 * ��ʾ���
		 */
		Client.viewList(aList);
		
		/**
		 * ���������ײ͵Ĺ���
		 * �������ݣ������ض��Ľ������
		 */
		director = new DirectorImpl(new BuilderImplB());
		/**
		 * ����
		 */
		List bList = director.construct();
		/**
		 * ��ʾ���
		 */
		Client.viewList(bList);
		
	}

	/**
	 * ��ӡ�б���Ϣ�Ĺ��߷���
	 * @param aList
	 */
	private static void viewList(List list) {
		// TODO Auto-generated method stub
		for (Object object : list){
			System.out.print(object + "  ");
		}
		System.out.println();
	}

}
