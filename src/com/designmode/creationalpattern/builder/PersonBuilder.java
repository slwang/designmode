package com.designmode.creationalpattern.builder;

public interface PersonBuilder {
	void buildHead();
    void buildBody();
    void buildFoot();
    Person buildPerson();
}
