/*
File name: ContactInfoTest.java
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

import symphony.Address;
import symphony.ContactInfo;
import symphony.PhoneNumber;
import symphony.PostalCode;

/**
 * @author Rebecca Dawdy
 * @version 1.0
 * @since JavaSE-1.8
 * @see org.junit.Assert.*
 * @see org.junit.Test
 * @see symphony.Address
 * @see symphony.PostalCode
 * @see symphony.PhoneNumber
 * @see symphony.ContactInfo
 */

public class ContactInfoTest {

	/**
	 * Variable representing the ContactInfo class for testing 
	 */
	ContactInfo contactInfo = new ContactInfo(null, null);

	/**
	 * Tests the ContactInfo constructor
	 */
	@Test
	public void testContactInfo() {
		System.out.println("Executing testContactInfo");
		ContactInfo contactInfo = new ContactInfo(new PhoneNumber("613", "555", "1234"),
				new Address(30, "Woodroffe", "Ottawa", "Ontario", new PostalCode("K2G", "4M6"), "Canada"));
		System.out.println(contactInfo);
		assertNotNull("\t\tS PostalCode is null", contactInfo);
		assertTrue(contactInfo.toString().equals("(613)-555-1234, 30 Woodroffe, Ottawa, Ontario, K2G4M6, Canada"));
	}

	/**
	 *Tests the phone number getter 
	 */
	@Test
	public void testGetPhoneNumber() {
		System.out.println("Executing testGetPhoneNumber");
		PhoneNumber phoneNumber = new PhoneNumber("705", "777", "5678");
		contactInfo.setPhoneNumber(phoneNumber);
		assertEquals("(705)-777-5678", contactInfo.getPhoneNumber().toString());
	}

	/**
	 *Tests the phone number setter 
	 */
	@Test
	public void testSetPhoneNumber() {
		System.out.println("Executing testSetPhoneNumber");
		PhoneNumber phoneNumber = new PhoneNumber("416", "888", "9101");
		contactInfo.setPhoneNumber(phoneNumber);
		assertEquals("(416)-888-9101", contactInfo.getPhoneNumber().toString());
	}

	/**
	 * Tests the address getter
	 */
	@Test
	public void testGetAddress() {
		System.out.println("Executing testGetAddress");
		Address address = new Address(1980, "Baseline", "Nepean", "Ontario", new PostalCode("A1A", "1A1"), "Canada");
		contactInfo.setAddress(address);
		assertEquals("1980 Baseline, Nepean, Ontario, A1A1A1, Canada", contactInfo.getAddress().toString());

	}

	/**
	 * Tests the address setter
	 */
	@Test
	public void testSetAddress() {
		System.out.println("Executing testSetAddress");
		Address address = new Address(1234, "Merivale", "Toronto", "Manitoba", new PostalCode("B2B", "2B2"), "Japan");
		contactInfo.setAddress(address);
		assertEquals("1234 Merivale, Toronto, Manitoba, B2B2B2, Japan", contactInfo.getAddress().toString());
	}

}
