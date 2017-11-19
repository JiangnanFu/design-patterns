package com.proxy;

/**
 * �ֻ�ģ��
 * 
 * @author liuiqian
 * 
 */
public class DummyPhone implements Phone {

	/**
	 * ��Ҫ�����ҵ�����
	 */
	private Phone realPhone;

	public Phone getRealPhone() {
		return realPhone;
	}

	public void setRealPhone(Phone realPhone) {
		this.realPhone = realPhone;
	}

	/**
	 * ������ �Ĺ��췽��
	 */
	public DummyPhone(String brand, String series, String color) {
		realPhone = new MobilePhone(brand, series, color);
	}

	/**
	 * ���������Ĺ��췽��
	 */
	public DummyPhone() {
	}

	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return realPhone.getBrand();
	}

	@Override
	public String getSeries() {
		// TODO Auto-generated method stub
		return realPhone.getSeries();
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return realPhone.getColor();
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println(getColor() + "��ɫ��" + 
		getBrand() + getSeries() + "�ֻ�ģ���޷�����绰");

	}

}
