package com.qiu.demo;

/**
 * 研究String类
 * 
 * 1.属性
 * 
 * 2.构造方法
 * 
 * 3普通方法
 *
 */
public class DemoString {
	
	/**
	 * 构造String对象
	 */
	
	public void test1(){
		
		String s1 = new String();
		System.out.println("s1:"+s1);
		/**
		 * 作为特殊的引用方法，String类型也可以直接用赋值符号来定义对象
		 */
		String s2 = "hello";
		System.out.println("s2:"+s2);
		
		String s3 = "world";
		System.out.println("s3:"+s3);
		
		/**
		 * String 作为特殊的引用方法，可以实现相加，不过在这里他不起运算符的作用
		 * 而是起到拼接的作用
		 */
		String s4 = s2+s3;
		System.out.println("s4:"+s4);
		
	}
	
	/**
	 * 测试属性
	 */
	
	public void test2(){
		
		String s1 = "hello";
		
//		s1.xxx;
		//经测试String类，没有属性；
	}
	
	/**
	 * 测试方法
	 */
	
	public void test3(){
		
		String s1 = "hello";
		String s2 = "world";
		String s3 = "你好";
		
		//长度
		System.out.println("lenght:"+s1.length());
		
		//拼接
		String s4 = s3.concat("老板");
		System.out.println("concat:"+s4);
		
		//子串，截取
		
		String s5 = s4.substring(2,4);
		System.out.println("substring:"+s5);
		
		char c = s4.charAt(0);
		System.out.println("char:"+c);
		
		//比较
		
		String s6 = "hello";
		String s7 = "world";
		String s8 = "HELLO";
		
		System.out.println("equals:"+s6.equals(s1));
		System.out.println("equals:"+s6.equals(s7));
		System.out.println("equals:"+s6.equals(s8));
		System.out.println("equals:"+s6.equalsIgnoreCase(s8));
		
		//start,end;
		
		String s9 = "张三";
		String s10 = "张良";
		String s11 = "李四";
		String s12 = "赵四";
		
		System.out.println("start:"+s9.startsWith("张"));
		System.out.println("start:"+s9.startsWith(s10));
		System.out.println("end:"+s9.endsWith("三"));
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
			
			//分割   拆分
			
			String[] str = "http://www.baidu.com/".split("\\:|\\.");
			
			for (int i = 0; i < str.length; i++) {
				System.out.println(str[i]);
			}
			
			System.out.println(str.length);
			
		}
		
	}
	

}
