package com.qiu.demo;

/**
 * �о�String��
 * 
 * 1.����
 * 
 * 2.���췽��
 * 
 * 3��ͨ����
 *
 */
public class DemoString {
	
	/**
	 * ����String����
	 */
	
	public void test1(){
		
		String s1 = new String();
		System.out.println("s1:"+s1);
		/**
		 * ��Ϊ��������÷�����String����Ҳ����ֱ���ø�ֵ�������������
		 */
		String s2 = "hello";
		System.out.println("s2:"+s2);
		
		String s3 = "world";
		System.out.println("s3:"+s3);
		
		/**
		 * String ��Ϊ��������÷���������ʵ����ӣ����������������������������
		 * ������ƴ�ӵ�����
		 */
		String s4 = s2+s3;
		System.out.println("s4:"+s4);
		
	}
	
	/**
	 * ��������
	 */
	
	public void test2(){
		
		String s1 = "hello";
		
//		s1.xxx;
		//������String�࣬û�����ԣ�
	}
	
	/**
	 * ���Է���
	 */
	
	public void test3(){
		
		String s1 = "hello";
		String s2 = "world";
		String s3 = "���";
		
		//����
		System.out.println("lenght:"+s1.length());
		
		//ƴ��
		String s4 = s3.concat("�ϰ�");
		System.out.println("concat:"+s4);
		
		//�Ӵ�����ȡ
		
		String s5 = s4.substring(2,4);
		System.out.println("substring:"+s5);
		
		char c = s4.charAt(0);
		System.out.println("char:"+c);
		
		//�Ƚ�
		
		String s6 = "hello";
		String s7 = "world";
		String s8 = "HELLO";
		
		System.out.println("equals:"+s6.equals(s1));
		System.out.println("equals:"+s6.equals(s7));
		System.out.println("equals:"+s6.equals(s8));
		System.out.println("equals:"+s6.equalsIgnoreCase(s8));
		
		//start,end;
		
		String s9 = "����";
		String s10 = "����";
		String s11 = "����";
		String s12 = "����";
		
		System.out.println("start:"+s9.startsWith("��"));
		System.out.println("start:"+s9.startsWith(s10));
		System.out.println("end:"+s9.endsWith("��"));
		System.out.println("end:"+s11.endsWith(s12));
		
		//
		
		String s13 = "i love you";
		
		System.out.println("love:"+s13.contains("love"));
		
		String s14 = "i hate the world,i hate potentate";
		
		System.out.println(s14);
		if(s14.contains("potentate") && s14.contains("hate")){
			
			String s15 = s14.replace("hate", "love");
			
			System.out.println(s15);
			
			
//			String[] string ={"http://www.baidu.com/"};
//
//			System.out.println(string.length);
			
			//�ָ�   ���
			
			String[] str = "http://www.baidu.com/".split("\\:|\\.");
			
			for (int i = 0; i < str.length; i++) {
				System.out.println(str[i]);
			}
			
			System.out.println(str.length);
			
		}
		
	}
	

}
