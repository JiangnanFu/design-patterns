package com.adapter;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ͻ��˽ӿڣ�ʹ����������Դ�����ת��
		INoEarthWirePlug plug = new Plug3to2Adapter(new TVPlug());
		//���ϲ�ͷ
		plug.plug("����", "����");
	}

}
