package com.designmode.factory.staticfactorypattern;

import com.designmode.factory.PrintInterface;
import com.designmode.factory.PrintOne;
import com.designmode.factory.PrintTwo;

public class PrintFactory {
	public static PrintInterface produceOne() {  
            return new PrintOne();        
    }
	
	public static PrintInterface produceTwo() {  
        return new PrintTwo();  
	}

}