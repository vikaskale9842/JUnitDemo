package com.edusol.JUnitDemo.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootApplication
@RunWith(SpringRunner.class)
public class DemoTest {
	Demo d1;
	
	@Before
	public void setUp() throws Exception{
		System.out.println("Inside Setup Method");
		d1=new Demo();
	}
	
	@Test
	public void additiontest() {
	System.out.println("Inside sum method");
	
	int cActual=d1.sum(10,10);
	System.out.println(cActual);
	
	assertEquals(cActual,20);

}
	@Test
	public void substractiontest() {
	System.out.println("Inside substraction method");
	
	int cActual=d1.substract(20,10);
	System.out.println(cActual);
	
	assertEquals(cActual,10);

}
	
}