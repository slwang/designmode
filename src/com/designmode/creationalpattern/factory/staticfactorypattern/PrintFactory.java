package com.designmode.creationalpattern.factory.staticfactorypattern;

import com.designmode.creationalpattern.factory.PrintInterface;
import com.designmode.creationalpattern.factory.PrintOne;
import com.designmode.creationalpattern.factory.PrintTwo;

public class PrintFactory {
	public static PrintInterface produceOne() {  
            return new PrintOne();        
    }
	
	public static PrintInterface produceTwo() {  
        return new PrintTwo();  
	}

}