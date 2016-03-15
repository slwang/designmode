package com.designmode.factory.multiplefactorypattern;

import com.designmode.factory.PrintInterface;
import com.designmode.factory.PrintOne;
import com.designmode.factory.PrintTwo;

public class PrintFactory {
	public PrintInterface produceOne() {  
            return new PrintOne();        
    }
	
	public PrintInterface produceTwo() {  
        return new PrintTwo();  
	}

}