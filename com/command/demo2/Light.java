package com.command.demo2;

/*
 * �����ߣ���
 */
public class Light {
	//�Ƶ�״̬��trueΪ���ţ�falseΪ�ر�
	private boolean open = false;
	
	public boolean isOpen(){
		return open;
	}
	
	public void setOpen(boolean open){
		if(this.open == open){
			return;
		} else {
			this.open = open;
			System.out.println("��״̬�޸�Ϊ��" + (open ? "��" : "�ر�"));
		}
	}
	
	//���Ʒ���
	public void turnOnLight(){
		this.setOpen(true);
	}
	
	//�صƷ���
	public void turnOffLight(){
		this.setOpen(false);
	}
}
