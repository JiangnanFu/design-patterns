package com.bridge.example;
/**
 * Ps3����
 * @author liuiqian
 *
 */
public class Ps3 extends Host {

	public Ps3(Handle handle, GameContainer gameContainer) {
		super(handle, gameContainer);
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("Ps3��ʼ�����ˣ�");
		//����ί�з���
		this.gameLoad();
		this.handleWork();
	}

}
