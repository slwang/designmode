package com.designmode.factory.multiplefactorypattern;

import com.designmode.factory.PrintInterface;

public class PrintFactoryTest {

	public static void main(String[] args) {
		PrintFactory factory = new PrintFactory();
		PrintInterface pi = factory.produceOne();
		pi.print();
	}

}
