package com.bootcamp.java.mockitopractise;

import org.junit.Test;
import static org.mockito.Mockito.*;
import org.junit.Before;
import static org.junit.Assert.assertEquals;


import org.junit.Assert;

public class CalServiceTest {

 CalService calService;
 @Before
 public void setup(){
	 ICalculator cal=mock(ICalculator.class);
	 when(cal.add(3, 3)).thenReturn(6);
	 calService=new CalService();
	 calService.setCal(cal);
 }
	
	@Test
	
	public void testAddTwoNumber(){
		
	Assert.assertEquals(6,calService.addTwoNumbers(3, 3));
	
	}
}
