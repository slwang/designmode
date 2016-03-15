package com.designmode.factory.staticfactorypattern;

import com.designmode.factory.PrintInterface;

public class PrintFactoryTest {

	public static void main(String[] args) {
		PrintInterface pi = PrintFactory.produceOne();
		pi.print();
	}

}
