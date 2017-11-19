package com.observer;

/*
 * ���ŷ�����
 */
public class NewsPublisher extends Subject {
	
	//ά�������µ���Ϣ
	private String news;
	
	public void setNews(String news){
		/**
		 * ��Ϣ�ı�ʱ֪ͨ
		 */
		if (news != null && !news.equals(this.news)) {
			this.news = news;
			/**
			 * ֪ͨ������
			 */
			this.notifyObservers(news);
		}
	}
}
