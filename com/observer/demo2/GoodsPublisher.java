package com.observer.demo2;

/**
 * ��Ʒ������
 * @author liuqian
 *
 */
public class GoodsPublisher extends Subject {

	/**
	 * ά�������µ���Ϣ
	 */
	private String news;
	
	public void setNews(String news){
		/**
		 * ��Ϣ�ı�ʱ֪ͨ
		 */
		if (news != null && !news.equals(this.news)){
			this.news = news;
			this.notify(news);
		}
	}
}
