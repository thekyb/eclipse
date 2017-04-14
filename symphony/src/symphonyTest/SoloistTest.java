/*
  File name: SoloistTest
  Author: Seokhwan Lee. Stuent # 040842046
  Course: CST8288-OOP
  Project #: Project1
  Date: 12th, April, 2017
  Professor: Leanne Seaward
  
  Purpose: This class provides test for method of Soloist class.
 
 */

package symphonyTest;

import static org.junit.Assert.*;
import symphony.Soloist;

/** 
* @author Seokhwan Lee
* @see symphony.Soloist;
* @version 1-1
* @since 1.8.0 
*/


public class SoloistTest {


@Test
public void Soloist(){
    System.out.println("Excuting Soloist's default constructor Test");
    Soloist soloist = new Soloist(new PhoneNumber("613","413","3678"),
    new Address("77", "Inverness", "Ottawa", "Ontario". new PostalCode("K2E","6P1"), "Canada")); 
    asserTrue(soloist.contactInfo.toString.equals("(613)-413-3678, 77 Inverness Ottawa, Ontario, K2E6P1, Canada"));
	
}

@Test
public void setContactInfo(){
    System.out.println("Excuting Soloist's setContectInfo Test");
	Soloist soloist = new Soloist();
    soloist.setContactInfo(new PhoneNumber("613","413","3678"),
        new Address("77", "Inverness", "Ottawa", "Ontario". new PostalCode("K2E","6P1"), "Canada"));
        asserTrue(soloist.getContactInfo.equals("(613)-413-3678, 77 Inverness Ottawa, Ontario, K2E6P1, Canada"));    
    }
    
@Test    
public ContactInfo getContactInfo(){
    System.out.println("Excuting Soloist's getContectInfo Test");
    Soloist soloist = new Soloist(); Soloist soloist = new Soloist(new PhoneNumber("613","413","3678"),
    new Address("77", "Inverness", "Ottawa", "Ontario". new PostalCode("K2E","6P1"), "Canada"));
	asserTrue(soloist.getContactInfo.equals("(613)-413-3678, 77 Inverness Ottawa, Ontario, K2E6P1, Canada"));    
    }
}