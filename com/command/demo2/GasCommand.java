package com.command.demo2;
/*
 * ��������
 */
public class GasCommand implements Command {

	/**
	 * ί�еĽ�����
	 */
	private Gas gas;
	
	private boolean change;
	
	public Gas getGas() {
		return gas;
	}

	public void setGas(Gas gas) {
		this.gas = gas;
	}

	public boolean isChange() {
		return change;
	}

	public void setChange(boolean change) {
		this.change = change;
	}
	
	/**
	 * ���췽��
	 * @param gas
	 */
	public GasCommand(Gas gas){
		this.gas = gas;
		change = false;
	}

	@Override
	public void execute() {
		if(gas.isFire()){
			System.out.println("ú��δ��������");
		} else {
			gas.openFire();
			System.out.println("ú���Ѵ򿪡�");
			change = true;
		}
	}

	@Override
	public void undo() {
		if (change) {
			gas.closeFire();
			System.out.println("ú���ѹرա�");
		} else {
			System.out.println("ú��δ��������");
		}
	}

	@Override
	public void redo() {
		execute();
	}

}
