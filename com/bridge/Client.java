package com.bridge;

public class Client {

	public static void main(String[] args) {
		// �ڹ�������ʱʹ���Ž�ģʽ
		Log log = new UserLog(new XmlImpl());
		log.writeToLog();
		
		//�ڹ�������ʱʹ���Ž�ģʽ
		Log log2 = new DbLog(new EmailImpl());
		log2.writeToLog();

	}

}
