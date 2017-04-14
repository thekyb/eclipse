/*
  File name: MembershipTest
  Author: Seokhwan Lee. Stuent # 040842046
  Course: CST8288-OOP
  Project #: Project1
  Date: 12th, April, 2017
  Professor: Leanne Seaward
  
  Purpose: 
 
 */
package symphonyTest;

import static org.junit.Assert.*;
import symphony.Membership;

/** 
* @author Seokhwan Lee
* @see symphony.Membership;
* @version 1-1
* @since 1.8.0 
*/

public class MembershipTest {

    @Test
    public MembershipTest(){
        System.out.println("Excuting Membership's default constructor test");
        Membership membership = new Membership(00001, new PhoneNumber("613","413","3678"),
        new Address("77", "Inverness", "Ottawa", "Ontario". new PostalCode("K2E","6P1"), "Canada"));
        asserTrue(membership.contactInfo.toString.equals("00001, (613)-413-3678, 77 Inverness Ottawa, Ontario, K2E6P1, Canada"));
    }

    @Test
    public int getIdTest(){
        System.out.println("Excuting Membership's getId Test");
        Membership membership = new Membership();
        membership.setId(00002);
        asserTrue(membership.getId.equals(00002));  
        
    }

    @Test
    public void setIdTest(){
        System.out.println("Excuting Membership's setId Test");
        Membership membership = new Membership();
        membership.setId(00003);
        asserTrue(membership.id.equals(00003));
    }

    @TestTest
    public void setContactInfoTest(){
        System.out.println("Excuting Membership's setContect InfoTest");
        Membership membership = new Membership();
        membership.setContactInfo(new PhoneNumber("613","413","3678"),
        new Address("77", "Inverness", "Ottawa", "Ontario". new PostalCode("K2E","6P1"), "Canada"));
        asserTrue(membership.contactInfo.toString.equals("(613)-413-3678, 77 Inverness Ottawa, Ontario, K2E6P1, Canada"));   
    }

    @Test
    public ContactInfo getContactInfoTest(){
        System.out.println("Excuting Membership's get getContact InfoTest");
        Membership membership = new Membership(00001, new PhoneNumber("613","413","3678"),
        new Address("77", "Inverness", "Ottawa", "Ontario". new PostalCode("K2E","6P1"), "Canada"));
        asserTrue(membership.getContactInfo().toString.equals("(613)-413-3678, 77 Inverness Ottawa, Ontario, K2E6P1, Canada"));    

    }

}
