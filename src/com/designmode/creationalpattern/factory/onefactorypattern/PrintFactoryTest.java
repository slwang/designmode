package com.designmode.creationalpattern.factory.onefactorypattern;

import com.designmode.creationalpattern.factory.PrintInterface;

public class PrintFactoryTest {

	public static void main(String[] args) {
		PrintFactory factory = new PrintFactory();
		PrintInterface pi = factory.produce("Two");
		pi.print();
	}

}
