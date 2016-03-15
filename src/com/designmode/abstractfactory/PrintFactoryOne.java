package com.designmode.abstractfactory;

import com.designmode.factory.PrintInterface;
import com.designmode.factory.PrintOne;

public class PrintFactoryOne implements Provider {

	@Override
	public PrintInterface produce() {
		return new PrintOne();
	}

}
