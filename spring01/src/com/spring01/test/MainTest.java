package com.spring01.test;

import com.spring01.sercive.KfcWing;
import com.spring01.sercive.McdonldWing;
import com.spring01.sercive.Wing;

public class MainTest {

	public static void main(String[] args) {
		  Wing wing=new KfcWing();
		  
		  wing.eat();
		  
		  wing = new McdonldWing();
		  wing.eat();
    
	}
}
