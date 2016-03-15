package com.designmode.builder;

public class ManBuilder implements PersonBuilder {
	Person person;
	public ManBuilder() {
        person = new Person();
    }
	@Override
	public void buildHead() {
		person.setHead("�������˵�ͷ");
	}

	@Override
	public void buildBody() {
		person.setBody("�������˵�����");
	}

	@Override
	public void buildFoot() {
		person.setFoot("�������˵Ľ�");
	}

	@Override
	public Person buildPerson() {
		return person;
	}

}
