package com.command.demo2;
/**
 * �����ߣ�ú��
 * @author liuqian
 *
 */
public class Gas {
	//ú����״̬��trueΪ���ţ�falseΪ�ر�
	private boolean fire = false;

	public boolean isFire() {
		return fire;
	}

	public void setFire(boolean fire) {
		if(this.fire == fire){
			return;
		} else {
			this.fire = fire;
			System.out.println("ú��״̬�޸�Ϊ��" + (fire ? "��" : "�ر�"));
		}
	}
	
	/**
	 * ��ú��
	 */
	public void openFire(){
		this.setFire(true);
	}

	/**
	 * �ر�ú��
	 */
	public void closeFire(){
		this.setFire(false);
	}
}
