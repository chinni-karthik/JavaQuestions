package com.ck.unable.to.solve;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;

import javax.xml.parsers.DocumentBuilderFactory;

public class JavaApiDesignPatternMapping {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		//Creational Patterns
		DocumentBuilderFactory.newInstance();//AbstractFactory.
		new StringBuilder().append("");//Builder
		Calendar.getInstance();//Factory
		new JavaApiDesignPatternMapping().clone();//Prototype
		Runtime.getRuntime();//Singleton
		
		Arrays.asList(null);//Adapter
		//In IOStreams , Reader and Writer object creation follows Decorator
		Collections.synchronizedList(null);//Decorator
		Integer.valueOf(10);//FlyWeight
		//Date setting (Internally represented as long value) -- Memento
		//Compare()-- Strategy
		Collections.sort(null);//Strategy
		
	}
}
