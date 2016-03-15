package com.designmode.abstractfactory;

import com.designmode.factory.PrintInterface;

public class PrintFactoryTest {
	public static void main(String[] args){
		Provider provider =  new PrintFactoryOne();
		PrintInterface p = provider.produce();
		p.print();
	}

}
