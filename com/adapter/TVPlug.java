package com.adapter;
/**
 * ���ӻ��Ĵ��ӵز�ͷԴ��
 * @author liuiqian
 *
 */
public class TVPlug implements IWithEarthWirePlug {

	@Override
	public void plug(String liveWire, String nullWire, String earthWire) {
		// TODO Auto-generated method stub
		play();
	}
	
	//��������
	private void play(){
		System.out.println("���ŵ��ӽ�Ŀ");
	}

}
