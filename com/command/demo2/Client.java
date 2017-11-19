package com.command.demo2;

public class Client {
	public static void main(String[] args) {
		//��Ҫ��������Ʒ
		Light light = new Light();
		Gas gas = new Gas();
		
		Invoker invoker = new Invoker();
		
		//ִ������
		invoker.executeCommmand(new GasCommand(gas));
		invoker.executeCommmand(new GasCommand(gas));
		
		invoker.undoCommand();
		invoker.undoCommand();
		
		invoker.redoCommand();
		
		invoker.executeCommmand(new LightCommand(light));
		invoker.redoCommand();
	}
}
