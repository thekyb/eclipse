/*
  File name: ConductorTest
  Author: Seokhwan Lee. Stuent # 040842046
  Course: CST8288-OOP
  Project #: Project1
  Date: 12th, April, 2017
  Professor: Leanne Seaward
  
  Purpose: 
 
 */
package symphonyTest;

import org.junit.Test;

import symphony.Conductor;
/** 
* @author Seokhwan Lee
* @see symphony.Conductor;
* @version 1-1
* @since 1.8.0 
*/


public class ConductorTest {

@Test
public ConductorTest(){
    System.out.println("Excuting Conductor's default constructor");
    Conductor conductor = new Conductor(new PhoneNumber("613","413","3678"),
    new Address("77", "Inverness", "Ottawa", "Ontario". new PostalCode("K2E","6P1"), "Canada"));
    asserTrue(conductor.contactInfo.toString.equals("(613)-413-3678, 77 Inverness Ottawa, Ontario, K2E6P1, Canada"));   
    }
    

@test
public ContactInfo setContactInfoTest(ContactInfo contactInfo){
    System.out.println("Excuting Conductor's setContactInfoTest method");
    Conductor conductor = new Conductor();
    conductor.setContactInfo(new PhoneNumber("613","413","3678"),
    new Address("77", "Inverness", "Ottawa", "Ontario". new PostalCode("K2E","6P1"), "Canada"));
    asserTrue(conductor.contactInfo.toString.equals("(613)-413-3678, 77 Inverness Ottawa, Ontario, K2E6P1, Canada"));
    }

@test    
public void getContactInfoTest(){
    System.out.println("Excuting Conductor's getContactInfoTest method");
    Conductor conductor = new Conductor();
    conductor.setContactInfo(new PhoneNumber("613","413","3678"),
    new Address("77", "Inverness", "Ottawa", "Ontario". new PostalCode("K2E","6P1"), "Canada"));
    asserTrue(conductor.getContactInfo().toString.equals("(613)-413-3678, 77 Inverness Ottawa, Ontario, K2E6P1, Canada"));    

    }
}