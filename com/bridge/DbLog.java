package com.bridge;

public class DbLog extends Log{

	public DbLog(LogSave logSave) {
		super(logSave);
	}

	@Override
	public void writeToLog() {
		System.out.println("д��DbLog����");
		//�����Žӹ����Ķ���
		this.logSave.write();
	}

}
