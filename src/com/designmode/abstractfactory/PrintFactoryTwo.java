package com.designmode.abstractfactory;

import com.designmode.factory.PrintInterface;
import com.designmode.factory.PrintTwo;

public class PrintFactoryTwo implements Provider {

	@Override
	public PrintInterface produce() {
		return  new PrintTwo();
	}

}
