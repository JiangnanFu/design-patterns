package com.bridge;

public class TradLog extends Log {

	public TradLog(LogSave logSave) {
		super(logSave);
	}

	@Override
	public void writeToLog() {
		// TODO Auto-generated method stub
		System.out.println("д��TradLog����");
		//�����Žӹ����Ķ���
		this.logSave.write();
	}

}
