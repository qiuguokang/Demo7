package com.qiu.demo1;

/**
 * ����ģʽ��ֻ������һ������
 * 
 * ��·��
 * 
 * 1 �������췽��
 * 
 * 2����һ������
 * 
 * 3���ɶ���
 */
  
public class Demo1 {
	
	//����
	
	private String name;
	private int age;
	
	//���������Ķ���
	
	private static Demo1 d = null;
	//���췽��
	//��private���Σ��������췽��
	private Demo1(String name,int age){
		
		this.name = name;
		this.age  = age;
	}
	
	//��ͨ����
	
	public void eat(){
		
		System.out.println(name+",����"+age+"��,"+"ϲ���������");
	}
	
	public void play(){
		
		System.out.println(name+",����"+age+"��,"+"ϲ������Ϸ");
	}
	
	//   synchronized ��
	//public synchronized static Demo1 createObject(String name, int age){
	
	//creatObject 
//	public  static Demo1 createObject(String name, int age){
//		
//		if(d == null){
//			d = new Demo1(name,age);
//		}
//		
//		return d;
//	}
	
	//���õĵ��������� getInstance;
	public static Demo1 getInstance(String name, int age){
		
		if(d == null){
			d = new Demo1(name, age);
		}
		return d;
	}
		
}
