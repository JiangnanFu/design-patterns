package com.adapter;
/**
 * ��Դ��ͷ3ת2������
 * @author liuiqian
 *
 */
public class Plug3to2Adapter implements INoEarthWirePlug {

	//Դ�ӿ�
	private IWithEarthWirePlug adaptee;
	
	//ʵ��
	@Override
	public void plug(String liveWire, String nullWire) {
		// TODO Auto-generated method stub
		adaptee.plug("����", "����", null);
	}
	
	//���췽��
	public Plug3to2Adapter(IWithEarthWirePlug adaptee) {
		this.adaptee = adaptee;
	}

}
