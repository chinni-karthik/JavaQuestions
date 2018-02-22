package com.ck.unable.to.solve;

import java.io.Serializable;

public class SingletonDoubleLocking implements Serializable,Cloneable{
	
	private static SingletonDoubleLocking singletonInstance=null;
	
	private SingletonDoubleLocking(){
		//private constructor to avoid object creation from outside this class.
		//in case someone is trying to create, then throw an exception asking him to fuck off!!!
		if (singletonInstance != null) {
	        throw new RuntimeException("Can't instantiate singleton twice");
	    }
	}
	
	public static SingletonDoubleLocking getInstance(){
		if(singletonInstance==null){//Checking null for first time 
			synchronized (SingletonDoubleLocking.class) {//remember you are locking class as static sync
				if(singletonInstance==null){//Checking null for second time , this time in sync block
					singletonInstance=new SingletonDoubleLocking();
				}
			}
		}
		return singletonInstance;
	}
	
	@Override
	public SingletonDoubleLocking clone(){
		return getInstance();
	}
	
	public Object readResolve(){
		return getInstance();
	}
	
	public static void main(String[] args) {
		System.out.println(SingletonDoubleLocking.getInstance().hashCode());//366712642
		System.out.println(SingletonDoubleLocking.getInstance().hashCode());//366712642
		System.out.println(SingletonDoubleLocking.getInstance().hashCode());//366712642
		System.out.println(SingletonDoubleLocking.getInstance().hashCode());//366712642
		
	}
}
