package com.designmode.creationalpattern.factory.multiplefactorypattern;

import com.designmode.creationalpattern.factory.PrintInterface;
import com.designmode.creationalpattern.factory.PrintOne;
import com.designmode.creationalpattern.factory.PrintTwo;

public class PrintFactory {
	public PrintInterface produceOne() {  
            return new PrintOne();        
    }
	
	public PrintInterface produceTwo() {  
        return new PrintTwo();  
	}

}