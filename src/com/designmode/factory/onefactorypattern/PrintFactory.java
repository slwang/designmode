package com.designmode.factory.onefactorypattern;

import com.designmode.factory.PrintInterface;
import com.designmode.factory.PrintOne;
import com.designmode.factory.PrintTwo;

public class PrintFactory {
	public PrintInterface produce(String type) {  
        if ("One".equals(type)) {  
            return new PrintOne();  
        } else if ("Two".equals(type)) {  
            return new PrintTwo();  
        } else {  
            System.out.println("没有要找的类型");  
            return null;  
        }  
    }

}