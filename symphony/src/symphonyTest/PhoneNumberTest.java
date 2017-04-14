/*
File name: PhoneNumberTest.java
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

import symphony.PhoneNumber;




/**
 * @author Rebecca Dawdy
 * @version 1.0
 * @since JavaSE-1.8
 * @see org.junit.Assert.*
 * @see org.junit.Test
 * @see symphony.PhoneNumber
 *
 */
public class PhoneNumberTest {
	
	/**
	 *This variable represents the phone number class for testing.   
	 */
	private PhoneNumber phoneNumber = new PhoneNumber(null, null, null);

	/**
	 * Tests the phone number class constructor
	 */
	@Test
	public void testPhoneNumber() {
		
		System.out.println("Executing testPhoneNumber");
		PhoneNumber phoneNumber = new PhoneNumber("613", "555", "1234");
		assertNotNull("\t\tS PhoneNumber is null", phoneNumber);
		assertTrue(phoneNumber.toString().equals("(613)-555-1234"));
	}

	/**
	 * Tests the area code getter 
	 */
	@Test
	public void testGetAreaNumber() {
		System.out.println("Executing testGetAreaNumber");
		phoneNumber.setAreaNumber("613");
		assertEquals("613",phoneNumber.getAreaNumber());
	}

	/**
	 * Tests the area code setter
	 */
	@Test
	public void testSetAreaNumber() {
		System.out.println("Executing testSetAreaNumber");
		phoneNumber.setAreaNumber("705");
		assertEquals("705", phoneNumber.getAreaNumber());
	}

	/**
	 * Tests the first local number getter
	 */
	@Test
	public void testGetFirstLocalNumber() {
		System.out.println("Executing testGetFirstLocalNumber");
		phoneNumber.setAreaNumber("555");
		assertEquals("555", phoneNumber.getAreaNumber());
	}

	/**
	 * Tests the first local number getter
	 */
	@Test
	public void testSetFirstLocalNumber() {
		System.out.println("Executing testSetFirstLocalNumber");
		phoneNumber.setAreaNumber("777");
		assertEquals("777", phoneNumber.getAreaNumber());
	}

	/**
	 * Tests the second local number getter
	 */
	@Test
	public void testGetSecondLocalNumber() {
		System.out.println("Executing testGetSecondLocalNumber");
		phoneNumber.setSecondLocalNumber("1234");
		assertEquals("1234", phoneNumber.getSecondLocalNumber());
	}

	/**
	 * Tests the second local number setter
	 */
	@Test
	public void testSetSecondLocalNumber() {
		System.out.println("Executing testSetSecondLocalNumber");
		phoneNumber.setSecondLocalNumber("5678");
		assertEquals("5678", phoneNumber.getSecondLocalNumber());
	}

}
