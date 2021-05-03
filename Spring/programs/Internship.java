package com.example.demo;


	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;
	 
	public class Internship {
	 
	    public static void main(String[] args) {
	   
	 
	        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	        DXC d = (DXC) ac.getBean("dxc");

	        d.printDXC();
	       
	}
	}

