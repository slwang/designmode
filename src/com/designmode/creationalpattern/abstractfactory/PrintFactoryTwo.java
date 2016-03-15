package com.designmode.creationalpattern.abstractfactory;

import com.designmode.creationalpattern.factory.PrintInterface;
import com.designmode.creationalpattern.factory.PrintTwo;

public class PrintFactoryTwo implements Provider {

	@Override
	public PrintInterface produce() {
		return  new PrintTwo();
	}

}
