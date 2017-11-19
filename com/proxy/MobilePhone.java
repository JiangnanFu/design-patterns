package com.proxy;

/**
 * �ֻ�ʵ����
 * 
 * @author liuiqian
 * 
 */
public class MobilePhone implements Phone {

	/**
	 * Ʒ������
	 */
	private String brand;

	/**
	 * �ֻ��ͺ�
	 */
	private String series;

	/**
	 * �ֻ���ɫ
	 */
	private String color;

	/**
	 * ��д�ӿڷ���
	 */
	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return brand;
	}

	@Override
	public String getSeries() {
		// TODO Auto-generated method stub
		return series;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return color;
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub\
		System.out.println(getColor() + "��ɫ��" + getBrand() + getSeries()
				+ "�ֻ���ʼ����绰��");
	}

	/**
	 * �������Ĺ��췽��
	 */
	public MobilePhone(String brand, String series, String color) {
		this.brand = brand;
		this.series = series;
		this.color = color;
	}

	/**
	 * �����������췽��
	 */
	public MobilePhone() {
	}

	/**
	 * ����Map�бȽ��Ƿ�һ�� ��Ҫ��дequals����
	 */
	public boolean equals(Object object) {
		MobilePhone mp = null;
		try {
			mp = (MobilePhone) object;
		} catch (Exception e) {
			// ���ת�������쳣���ؼ�
			return false;
		}
		if (getBrand().equals(mp.getBrand())
				&& getSeries().equals(mp.getSeries())
				&& getColor().equals(mp.getColor())) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * ����Map�бȽ��Ƿ�һ��
	 * ��Ҫ��дhashCode����
	 * ����JAVA��Ҫ��equals��hashCode������һ�£�������㷨ֻ����ʾ����
	 */
	public int hashCode() {
		return getBrand().hashCode() & getColor().hashCode() & getSeries().hashCode();
	}

}
