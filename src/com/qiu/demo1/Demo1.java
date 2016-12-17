package com.qiu.demo1;

/**
 * 单例模式：只能生成一个对象。
 * 
 * 套路：
 * 
 * 1 封死构造方法
 * 
 * 2定义一个对象
 * 
 * 3生成对象
 */
  
public class Demo1 {
	
	//属性
	
	private String name;
	private int age;
	
	//定义这个类的对象
	
	private static Demo1 d = null;
	//构造方法
	//用private修饰，封死构造方法
	private Demo1(String name,int age){
		
		this.name = name;
		this.age  = age;
	}
	
	//普通方法
	
	public void eat(){
		
		System.out.println(name+",今年"+age+"岁,"+"喜欢吃肉夹馍");
	}
	
	public void play(){
		
		System.out.println(name+",今年"+age+"岁,"+"喜欢打游戏");
	}
	
	//   synchronized 锁
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
	
	//常用的单例方法名 getInstance;
	public static Demo1 getInstance(String name, int age){
		
		if(d == null){
			d = new Demo1(name, age);
		}
		return d;
	}
		
}
