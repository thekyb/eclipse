/*
File name: AddressTest.java
Author: Rebecca Dawdy. Student # 040390031
Course: CST8132 – OOP
Project #1
Date: April 10, 2017
Professor: Leanne Seaward & Reg Dyer
Purpose: This class is used to create an ContactInfo object for each person.
*/

package symphonyTest;

import org.junit.Test;

import symphony.Address;
import symphony.PostalCode;

/**
 * @author Rebecca Dawdy
 * @version 1.0
 * @since JavaSE-1.8
 * @see org.junit.Assert.*
 * @see org.junit.Test
 * @see symphony.Address
 * @see symphony.PostalCode
 */
public class AddressTest{
	
	/**
	 * This variable creates an address of the instance object for testing
	 */
	private Address address = new Address(0, null, null, null, null, null);
	
	/**
	 * Tests the Address Constructor
	 */
	@Test
	public void testAddress() {
		
		System.out.println("Executing testAddress");
		Address address = new Address(30, "Woodroffe", "Nepean", "Ontario", new PostalCode("K2G","4M6"), "Canada");
		assertNotNull("\t\tS Address is null", address);
		assertTrue(address.toString().equals("30 Woodroffe, Nepean, Ontario, K2G4M6, Canada"));
		
	}



	/**
	 * Tests the unit number getter
	 */
	@Test
	public void testGetUnitNumber() {
		System.out.println("Executing testGetUnitNumber");
		address.setUnitNumber(30);
		assertEquals(30, address.getUnitNumber(), 0);
	
	}

	/**
	 * Tests the unit number setter
	 */
	@Test
	public void testSetUnitNumber() {
		System.out.println("Executing testSetUnitNumber");
		address.setUnitNumber(300);
		assertEquals(300, address.getUnitNumber(),0);
	}

	/**
	 * Tests the Street Name getter
	 */
	@Test
	public void testGetStreetName() {
		System.out.println("Executing testGetStreetName");
		address.setStreetName("Woodroffe");
		assertEquals("Woodroffe",address.getStreetName());
	}

	/**
	 * Tests the street name setter
	 */
	@Test
	public void testSetStreetName() {
		System.out.println("Executing testSetStreetName");
		address.setStreetName("Baseline");
		assertEquals("Baseline", address.getStreetName());
	}

	/**
	 * Tests the city name getter
	 */
	@Test
	public void testGetCityName() {
		System.out.println("Executing testGetCityName");
		address.setCityName("Ottawa");
		assertEquals("Ottawa", address.getCityName());
	}

	/**
	 * Tests the city name setter
	 */
	@Test
	public void testSetCityName() {
		System.out.println("Executing testGetCityName");
		address.setCityName("Montreal");
		assertEquals("Montreal", address.getCityName());
	}

	/**
	 * Tests the Province getter
	 */
	@Test
	public void testGetProvince() {
		System.out.println("Executing testGetProvince");
		address.setProvince("Ontario");
		assertEquals("Ontario", address.getProvince());
	}

	/**
	 * Tests the province setter
	 */
	@Test
	public void testSetProvince() {
		System.out.println("Executing testGetProvince");
		address.setProvince("Quebec");
		assertEquals("Quebec", address.getProvince());
	}

	/**
	 * Tests the country getter
	 */
	@Test
	public void testGetCountry() {
		System.out.println("Executing testGetCountry");
		address.setCountry("Canada");
		assertEquals("Canada", address.getCountry());
	}

	/**
	 * Tests the country setter
	 */
	@Test
	public void testSetCountry() {
		System.out.println("Executing testGetCountry");
		address.setCountry("Ireland");
		assertEquals("Ireland", address.getCountry());
	}

	/**
	 * Tests the postal code getter
	 */
	@Test
	public void testGetPostalCode() {
		PostalCode postalCode = new PostalCode("K2G", "4M6");
		System.out.println("Executing testGetPostalCode");
		address.setPostalCode(postalCode);
		assertEquals("K2G4M6", address.getPostalCode().toString());
		
	}

	/**
	 * Tests the postal code setter
	 */
	@Test
	public void testSetPostalCode() {
		PostalCode postalCode = new PostalCode("K2C", "0C7");
		System.out.println("Executing testGetPostalCode");
		address.setPostalCode(postalCode);
		assertEquals("K2C0C7", address.getPostalCode().toString());
	}
	
	

}
