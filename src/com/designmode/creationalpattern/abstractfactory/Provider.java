package com.designmode.creationalpattern.abstractfactory;

import com.designmode.creationalpattern.factory.PrintInterface;

public interface Provider {
	public  PrintInterface produce();
}
