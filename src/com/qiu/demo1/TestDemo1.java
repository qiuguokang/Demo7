package com.qiu.demo1;

public class TestDemo1 {
	
	public static void main(String[] args) {
		
//		Demo1 d1 = Demo1.createObject("小明", 17);
//		Demo1 d2 = Demo1.createObject("小红", 16);
//		
//		d1.eat();
//		d2.eat();

	    Demo1 d3 = Demo1.getInstance("小白", 22);
	    Demo1 d4 = Demo1.getInstance("小绿", 23);
	    
	    d3.play();
	    d4.play();
	}

}
