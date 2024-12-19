package com.in28minutes.mockito_demo.business;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class SomeBusinessImplMockTest {

	@Test
	void findTheGreatestFromAllData_basicScenario() {
		DataService dataServiceMock = mock(DataService.class);
		
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int [] {25,15,5});
		int result = businessImpl.findGreatestFromAllData();
		assertEquals(25, result);
	}
	
	@Test
	void findTheGreatestFromAllData_oneValue() {
		DataService dataServiceMock = mock(DataService.class);
		
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int [] {35});
		int result = businessImpl.findGreatestFromAllData();
		assertEquals(35, result);
	}
}
