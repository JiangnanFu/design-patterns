package com.bridge.example;
/**
 * Host������
 * @author liuiqian
 *
 */
public abstract class Host {
	/**
	 * ע��˴��ۺϵ����������������Ž�ģʽ�ľ������ڣ�
	 * ʵ���˳����ʵ�ֵķ���
	 */
	protected Handle handle;
	
	protected GameContainer gameContainer;
	
	/**
	 * ���췽��
	 * @param handle һ������ʵ�ֶ���
	 * @param gameContainer һ������ʵ�ֶ���
	 */
	public Host(Handle handle, GameContainer gameContainer){
		super();
		this.handle = handle;
		this.gameContainer = gameContainer;
	}
	
	//��Ϸ���Ĺ�������
	public abstract void work();
	
	/**
	 * ע��˴��������������������
	 * �ѹ���ί�и��˾ۺϵ�����
	 */
	public void handleWork() {
		handle.handleWork();
	}
	
	public void gameLoad(){
		gameContainer.gameLoad();
	}
}
