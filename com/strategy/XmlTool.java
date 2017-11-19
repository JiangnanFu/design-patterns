package com.strategy;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/*
 * XML�ļ�����������
 */
public class XmlTool {

	/**
	 * �����ļ�·��
	 */
	private String xmlpath = "/com/strategy/OffStrategy.xml";

	/**
	 * dom�ĵ�ģ��
	 */
	private Document document;

	/**
	 * ����Initialization on Demand Holder idiom ���쵥����
	 */
	static class SingletonHolder {
		static XmlTool instance = new XmlTool();
	}

	public static XmlTool getInstance() {
		return SingletonHolder.instance;
	}

	/**
	 * ˽�й��췽��
	 */
	private XmlTool() {
		try {
			/**
			 * ����XML�ļ�
			 */
			DocumentBuilder documentBuilder = DocumentBuilderFactory
					.newInstance().newDocumentBuilder();
			document = documentBuilder.parse(this.getClass()
					.getResourceAsStream(xmlpath));
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String findStrategyClass(String key) {
		if (document == null) {
			return null;
		}

		try {
			/**
			 * ʹ��Xpath���ҽڵ�
			 */
			XPathFactory xPathFactory = XPathFactory.newInstance();
			XPath xPath = xPathFactory.newXPath();

			/**
			 * ����һ��XPath���ʽ
			 */
			XPathExpression expression = xPath
					.compile("/strategies/strategy[@type='" + key + "']");
			// ����XPathExpression������Ҷ�Ӧ�Ľڵ㼯��
			NodeList nodes = (NodeList) expression.evaluate(document,
					XPathConstants.NODESET);
			if (nodes != null) {
				// �����ڵ㼯��
				// �ж������δ�ҳ��˸�ڵ㷵��null
				if (nodes.getLength() <= 0) {
					return null;
				}
				Node node = nodes.item(0);
				NamedNodeMap map = node.getAttributes();
				// ��������ֵ
				return map.getNamedItem("class").getNodeValue();
			}
		} catch (XPathExpressionException e) {
			e.printStackTrace();
		} catch (DOMException e) {
			e.printStackTrace();
		}
		return null;
	}

}
