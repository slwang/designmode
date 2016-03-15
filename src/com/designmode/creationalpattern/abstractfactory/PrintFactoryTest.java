package com.designmode.creationalpattern.abstractfactory;

import com.designmode.creationalpattern.factory.PrintInterface;

public class PrintFactoryTest {
	public static void main(String[] args){
		Provider provider =  new PrintFactoryOne();
		PrintInterface p = provider.produce();
		p.print();
	}

}
