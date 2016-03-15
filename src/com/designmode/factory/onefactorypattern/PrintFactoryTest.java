package com.designmode.factory.onefactorypattern;

import com.designmode.factory.PrintInterface;

public class PrintFactoryTest {

	public static void main(String[] args) {
		PrintFactory factory = new PrintFactory();
		PrintInterface pi = factory.produce("Two");
		pi.print();
	}

}
