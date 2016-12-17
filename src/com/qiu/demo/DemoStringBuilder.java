package com.qiu.demo;
/**
 * �о� ��String,StringBulider,StringBuffer������;
 * ����
 * ���췽��
 * ����
 */
public class DemoStringBuilder {
	
	public void test1(){
		
		/*
		 * 1)��һ���ַ���"hello",�������"hello world";
		 * 2)�ٱ��"hi hello world";
		 * 
		 * String�࣬���ݲ��ɱ䣬��Ҫǿ�Ʊ����ݣ�һ���������µĶ���
		 * StringBuilder���̲߳���ȫ�ģ�,StringBuffer�ࣨ�̰߳�ȫ�ģ������ݿɱ䣬�������¶���
		 * 
		 */
		
		//�����String��Ҫ��������1,2����Ҫ�Ĳ��裻
		String s1 = "hello";
		String s2 = " world";
		String s3 = s1 + s2;
		System.out.println(s3);
		String s4 = "hi ";
		String s5 = s4 + s3;
		System.out.println(s5);
		
		//�̲߳���ȫ��
		StringBuilder sb = new StringBuilder();
		
		//��һ��StringBuilder�ĳ�ʼ���ȣ�
		System.out.println("len:"+sb.length());
		
		//֮ǰ�Ķ���sb=null�����ڵ���append(),��������Ĺ�����׷���ַ���
		//�����Ըı�����
		sb.append("hello");
		System.out.println("len:"+sb.length());
		
		//sb.toString����Ϊ��������
		System.out.println("sb:" + sb.toString());
		
		//�̰߳�ȫ��
		
		StringBuffer sb1 = new StringBuffer();
		sb1.append("hello");
		
		//����Ҳ���Ե�ԭ������ΪString���͵�ǿ�ưѺ����Ҳת����String���͵���
		System.out.println("sb:"+sb1);
	}

}
