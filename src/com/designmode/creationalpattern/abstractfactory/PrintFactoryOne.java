package com.designmode.creationalpattern.abstractfactory;

import com.designmode.creationalpattern.factory.PrintInterface;
import com.designmode.creationalpattern.factory.PrintOne;

public class PrintFactoryOne implements Provider {

	@Override
	public PrintInterface produce() {
		return new PrintOne();
	}

}
