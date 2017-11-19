package com.singleton;

import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * ����ģʽע���
 * �ͻ���Ҫͨ�����������е�������
 * ���౾��ʹ�á�����ʽ������ģʽ
 * @author liuiqian
 *
 */
public class SingletonRegister {

	/**
	 * ����ά���ĵ���ģʽ��
	 */
	private static final SingletonRegister s = new SingletonRegister();
	
	/**
	 * ά��ע����Ϣ��Map
	 */
	private static final HashMap<String, Object> map = new HashMap<String, Object>();
	
	/**
	 * ������̵߳Ŀ������д��
	 */
	private static final ReentrantReadWriteLock rwlock = new ReentrantReadWriteLock();
	
	/**
	 * ֻ�������������Զ��ֻ�������棬����ʱ�������п�д��
	 */
	private static Lock r = rwlock.readLock();
	
	/**
	 * ��д�������������ռ������ʱ�����������κ���
	 */
	private static final Lock w = rwlock.writeLock();
	
	/**
	 * ˽�й��췽��
	 */
	private SingletonRegister(){
		
	}
	/**
	 * ����ȡ��ĳ����ĵ�������
	 * @param classNmae
	 * @return
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws ClassNotFoundException
	 */
	public static Object getInstance(String className)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		Object c = null;
		/**
		 * ��ö�ȡ��
		 */
		r.lock();
		try{
			System.out.println("������" + Thread.currentThread().getName());
			c = map.get(className);
			if(c != null){
				return c;
			}
		} finally {
			/**
			 * �ͷŶ�ȡ��
			 */
			r.unlock();
		}
		/**
		 * ���д��
		 */
		w.lock();
		try{
			System.out.println("д����" + Thread.currentThread().getName());
			/**
			 * ˫�ؼ��
			 */
			c = map.get(className);
			if(c != null){
				System.out.println("ֱ��ʹ����ע��Ķ���"
						+ Thread.currentThread().getName());
				return c;
			}
			/**
			 * ʹ�÷���ķ���ʵ��������
			 */
			c = Class.forName(className).newInstance();
			/**
			 * ����ע�����
			 */
			map.put(className, c);
			System.out.println("�´����Ķ���"
					+ Thread.currentThread().getName());
		} finally {
			/**
			 * �ͷ�д��
			 */
			w.unlock();
		}
		return c;
	}
}
