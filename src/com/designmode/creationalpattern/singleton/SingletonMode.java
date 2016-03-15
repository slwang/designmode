package com.designmode.creationalpattern.singleton;

public class SingletonMode {
	private static SingletonMode singleton;
	
	private SingletonMode(){
		
	}
	
	public static SingletonMode getInstance(){
		if (singleton!=null){
			
		}
		else{
			singleton = new SingletonMode();
		}
		return singleton;
	}
}
