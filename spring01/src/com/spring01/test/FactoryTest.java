package com.spring01.test;

import com.spring01.factory.WingFactory;
import com.spring01.sercive.Wing;

public class FactoryTest {
	public static void main(String[] args) {
		Wing wing=WingFactory.getWing("mcdonld");
		wing.eat();
		
		wing =WingFactory.getWing("kfc");
		wing.eat();
		
		wing =WingFactory.getWing("xxxx");
		wing.eat();
	}
}
