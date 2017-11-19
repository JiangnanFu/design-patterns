package com.chainofresponsibility2;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * XML����������ģʽ
 * @author liuqian
 *
 */
public class Client {

	public static void main(String[] args) throws Exception {
		String xmlUrl = "/com/chainofresponsibility2/cor.xml";
		// ����XML�ļ�
		DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		
		Document document = documentBuilder.parse(Client.class.getResourceAsStream(xmlUrl));
		
		NodeList nodeList = document.getElementsByTagName("handler");
		
		/**
		 * ������������
		 */
		Sign top = null;
		/**
		 * ����ĩ��
		 */
		Sign last = null;
		/*
		 * ��ȡ���е������װ��
		 */
		for(int i = 0; i < nodeList.getLength(); i++){
			Node item = nodeList.item(i);
			NamedNodeMap attributes = item.getAttributes();
			Node attr = attributes.getNamedItem("class");
			/**
			 * װ��
			 */
			if (top == null){
				/**
				 * ����
				 */
				top = last = (Sign)Class.forName(attr.getNodeValue()).newInstance();
				
			}else{
				/**
				 * ������
				 */
				Sign chain = (Sign) Class.forName(attr.getNodeValue()).newInstance();
				last.setNext(chain);
				last = chain;
			}
		}
		
		/**
		 * ����ǩ��
		 */
		Record record = new Record();
		top.sign(record);
		
		System.out.println("managerǩ�֣�" + record.isManagerSign());
		System.out.println("CEOǩ�֣�" + record.isCeoSign());
		System.out.println("CFOǩ�֣�" + record.isCfoSign());
	}

}
