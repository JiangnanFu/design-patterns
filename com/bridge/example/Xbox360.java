package com.bridge.example;
/**
 * Xbox360����
 * @author liuiqian
 *
 */
public class Xbox360 extends Host {

	public Xbox360(Handle handle, GameContainer gameContainer) {
		super(handle, gameContainer);
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("Xbox360�����ˣ�");
		//����ί�з���
		this.gameLoad();
		this.handleWork();
	}

}
