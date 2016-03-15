package com.designmode.creationalpattern.factory.staticfactorypattern;

import com.designmode.creationalpattern.factory.PrintInterface;

public class PrintFactoryTest {

	public static void main(String[] args) {
		PrintInterface pi = PrintFactory.produceOne();
		pi.print();
	}

}
