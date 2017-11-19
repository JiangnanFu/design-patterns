package com.abstractFactory;

import java.io.IOException;
import java.util.Properties;

/**
 * ����properties�ļ��Ĺ�����
 * @author liuiqian
 *
 */
public class PropTool {
	private static Properties prop;
	private static final String filePath = "/conf/config.properties";
	
	public synchronized static String getProoperty(String key) {
		if (prop == null) {
			/**
			 * �������ö���
			 */
			prop = new Properties();
			try {
				prop.load(PropTool.class.getResourceAsStream(filePath));
			} catch (IOException e){
				System.out.println(filePath + " ����ʧ�ܣ�");
			}
		}
		return prop.getProperty(key);
	}
}
