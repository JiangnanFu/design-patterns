package com.builderFactory1;

import java.util.List;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * ���ݶ���
		 */
		GoodsDirector director;
		
		/**
		 * ��׼TV
		 */
		director = new GoodsDirectorImplCommon(new GoodsBuilderImplTV());
		System.out.println("��׼��TV");
		Client.viewList(director.construct());
		/**
		 * ��׼��PSP
		 */
		director = new GoodsDirectorImplCommon(new GoodsBuilderImplPSP());
		System.out.println("��׼��PSP");
		Client.viewList(director.construct());
		/**
		 * ������TV
		 */
		director = new GoodsDirectorImplCostly(new GoodsBuilderImplTV());
		System.out.println("������TV");
		Client.viewList(director.construct());
		/**
		 * ������PSP
		 */
		director = new GoodsDirectorImplCostly(new GoodsBuilderImplPSP());
		System.out.println("������PSP");
		Client.viewList(director.construct());
	}

	private static void viewList(List<Product> list) {
		// TODO Auto-generated method stub
		for (Object object : list){
			System.out.print(object + "  ");
		}
		System.out.println();
	}

}
