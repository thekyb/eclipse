/*
File name: PostalCodeTest.java
Author: Rebecca Dawdy. Student # 040390031
Course: CST8132 – OOP
Project #1
Date: April 10, 2017
Professor: Leanne Seaward & Reg Dyer
Purpose: This class is used to create an ContactInfo object for each person.
*/


package symphonyTest;

import static org.junit.Assert.*;

import org.junit.Test;


import symphony.PostalCode;

/**
 * @author Rebecca Dawdy
 * @version 1.0
 * @since JavaSE-1.8
 * @see org.junit.Assert.*
 * @see org.junit.Test
 * @see symphony.PostalCode
 *
 */
public class PostalCodeTest {
	
	/**
	 * This variable represents the PostalCode class for testing
	 */
	PostalCode postalCode = new PostalCode(null, null);

	/**
	 * Tests the postal code constructor
	 */
	@Test
	public void testPostalCode() {
		System.out.println("Executing testPostalCode");
		PostalCode postalCode = new PostalCode("K2G", "4M6");
		assertNotNull("\t\tS PostalCode is null", postalCode);
		assertTrue(postalCode.toString().equals("K2G4M6"));
	}

	/**
	 * Tests the forward sortation area getter
	 */
	@Test
	public void testGetForwardSortationAreas() {
		System.out.println("Executing testGetForwardSortationAreas");
		postalCode.setForwardSortationAreas("K2G");
		assertEquals("K2G", postalCode.getForwardSortationAreas());
	}

	/**
	 * Tests the forward sortation area setter
	 */
	@Test
	public void testSetForwardSortationAreas() {
		System.out.println("Executing testSetForwardSortationAreas");
		postalCode.setForwardSortationAreas("P1B");
		assertEquals("P1B", postalCode.getForwardSortationAreas());
	}

	/**
	 * Tests the local delivery unit getter
	 */
	@Test
	public void testGetLocalDeliveryUnit() {
		System.out.println("Executing testGetLocalDeliveryUnit");
		postalCode.setLocalDeliveryUnit("4M6");
		assertEquals("4M6", postalCode.getLocalDeliveryUnit());
	}

	/**
	 * Tests the local delivery unit setter
	 */
	@Test
	public void testSetLocalDeliveryUnit() {
		System.out.println("Executing testSetLocalDeliveryUnit");
		postalCode.setLocalDeliveryUnit("3A1");
		assertEquals("3A1", postalCode.getLocalDeliveryUnit());
	
	}

}
