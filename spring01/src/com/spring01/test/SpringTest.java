package com.spring01.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring01.pojo.Car;
import com.spring01.sercive.Human;
import com.spring01.sercive.Wing;

public class SpringTest {

	@Test
	public void testWing() {
		@SuppressWarnings("resource")
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Wing wing=(Wing) ctx.getBean("kfc");
		wing.eat();
		
		wing=ctx.getBean("mcdonld",Wing.class);
		wing.eat();
	}

	
	@Test
	public void testAxe(){
@SuppressWarnings("resource")
ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
    Human human=ctx.getBean("human",Human.class);
    human.cutTree();
	}
	
	@Test
	public void testAbstractApplicationContext(){
 AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
    Human human=ctx.getBean("human",Human.class);
    human.cutTree();
    //关闭应用程序上下文，销毁bean工厂中所有的bean
    ctx.close();
	}
	
	@Test
	public void testScope(){

@SuppressWarnings("resource")
ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
    Human human=ctx.getBean("human",Human.class);
    human.cutTree();
    System.out.println("1."+human);
    
    human=ctx.getBean("human",Human.class);
    human.cutTree();
    System.out.println("2."+human);
	}
	
	
	@Test
	public void testCar(){

@SuppressWarnings("resource")
ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
    Car car=ctx.getBean("car",Car.class);
       System.out.println(car.getName()+"  "+car.getPrice());
	}
}
