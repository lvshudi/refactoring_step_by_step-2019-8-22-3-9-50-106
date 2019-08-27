package com.tws.refactoring.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.tws.refactoring.Driver;
import com.tws.refactoring.Police;

public class PoliceTest {
	@Test
	public void should_return_ture_when_input_18() {
		//given
		Driver driver = new Driver(18);
		Police police = new Police();
		//when
		boolean result = police.checkDriver(driver);
		//then
		assertEquals(true, result);
	}
	
	@Test
	public void should_return_false_when_input_17() {
		//given
		Driver driver = new Driver(17);
		Police police = new Police();
		//when
		boolean result = police.checkDriver(driver);
		//then
		assertEquals(false, result);
	}
}
