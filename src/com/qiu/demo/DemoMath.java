package com.qiu.demo;

/**
 * 研究Math类
 * 
 * 1 属性
 * 
 * 2构造方法
 * 
 * 3普通方法
 *
 */
public class DemoMath {
	
	
	
	public void test1(){
		
		/**
		 * 尝试构造Math的对象
		 * 
		 * 研究发现   不能
		 */
		
	//	Math m1 = new Math();
		
		//属性   两个属性，
		double e = Math.E;
		double pi = Math.PI;
		
		//方法
		
		//绝对值
		int x = Math.abs(-5);
		
	//	System.out.println(x);
		
		//最大值(max),最小值(min)
		
	    int y = Math.max(10, 5);
	    int z = Math.min(10, 5);
	    
//	    System.out.println(y);
//	    System.out.println(z);
	    
	    // 近一法(ceil)，去尾法(floor),
	   //  四舍五入（round）(rint这个从现在看的效果好像也是四舍五入)
	    double i1 = Math.floor(9.6353234);
	    double i2 = Math.ceil(7.112345);
	    double i3 = Math.round(3.3344684347);
	    double i4 = Math.rint(5.67842584);
	    System.out.println(i1);
	    System.out.println(i2);
	    System.out.println(i3);
	    System.out.println(i4);
	    
	    
	    
	    // a的d次方，Math.pow(a,b);a是底数，b是指数
		
	    double x1 = Math.pow( 2, 5);
		System.out.println(x1);
		
		
		
		//  开a的d次方，
		
		}
		
	
	   
}
