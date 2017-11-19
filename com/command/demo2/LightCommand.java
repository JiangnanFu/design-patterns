package com.command.demo2;

/**
 * �����
 * @author liuqian
 *
 */
public class LightCommand implements Command {

	// ί�еĽ�����
	private Light light;
	
	//����˶����Ƿ�ɹ��޸ĵ�����
	private boolean change;
	
	public Light getLight() {
		return light;
	}

	public void setLight(Light light) {
		this.light = light;
	}

	public boolean isChange() {
		return change;
	}

	public void setChange(boolean change) {
		this.change = change;
	}
	
	//���췽��
	public LightCommand(Light light){
		this.light = light;
		change = false;
	}

	@Override
	public void execute() {
		if(light.isOpen()){
			System.out.println("��δ��������");
		}else{
			light.turnOnLight();
			System.out.println("���Ѵ򿪡�");
			change = true;
		}
	}

	@Override
	public void undo() {
		if (change){
			light.turnOffLight();
			System.out.println("���ѹرա�");
		} else {
			System.out.println("��δ��������");
		}
	}

	@Override
	public void redo() {
		execute();
	}

}
