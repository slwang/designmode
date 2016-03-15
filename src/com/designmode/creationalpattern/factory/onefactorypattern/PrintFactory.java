package com.designmode.creationalpattern.factory.onefactorypattern;

import com.designmode.creationalpattern.factory.PrintInterface;
import com.designmode.creationalpattern.factory.PrintOne;
import com.designmode.creationalpattern.factory.PrintTwo;

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