package com.qiu.demo;
/**
 * 研究 类String,StringBulider,StringBuffer的区别;
 * 属性
 * 构造方法
 * 方法
 */
public class DemoStringBuilder {
	
	public void test1(){
		
		/*
		 * 1)有一个字符串"hello",将它变成"hello world";
		 * 2)再变成"hi hello world";
		 * 
		 * String类，内容不可变，若要强制变内容，一定生成了新的对象；
		 * StringBuilder（线程不安全的）,StringBuffer类（线程安全的），内容可变，不生成新对象；
		 * 
		 */
		
		//这个是String类要做的条件1,2所需要的步骤；
		String s1 = "hello";
		String s2 = " world";
		String s3 = s1 + s2;
		System.out.println(s3);
		String s4 = "hi ";
		String s5 = s4 + s3;
		System.out.println(s5);
		
		//线程不安全的
		StringBuilder sb = new StringBuilder();
		
		//看一下StringBuilder的初始长度；
		System.out.println("len:"+sb.length());
		
		//之前的对象sb=null，现在调用append(),这个方法的功能是追加字符串
		//它可以改变内容
		sb.append("hello");
		System.out.println("len:"+sb.length());
		
		//sb.toString是最为正规的输出
		System.out.println("sb:" + sb.toString());
		
		//线程安全的
		
		StringBuffer sb1 = new StringBuffer();
		sb1.append("hello");
		
		//这样也可以的原因是因为String类型的强制把后面的也转换成String类型的了
		System.out.println("sb:"+sb1);
	}

}
