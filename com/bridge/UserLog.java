package com.bridge;

public class UserLog extends Log {

	public UserLog(LogSave logSave) {
		super(logSave);
	}

	@Override
	public void writeToLog() {
		System.out.println("д��UserLog����");
		//�����Žӹ����Ķ���
		this.logSave.write();
	}

}
