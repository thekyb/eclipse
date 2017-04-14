/*
  File name: PersonTest
  Author: Seokhwan Lee. Stuent # 040842046
  Course: CST8288-OOP
  Project #: Project1
  Date: 12th, April, 2017
  Professor: Leanne Seaward
  
  Purpose: 
 
 */
package symphonyTest;

import static org.junit.Assert.*;
import symphony.Person;
/** 
* @author Seokhwan Lee
* @see symphony.Person;
* @version 1-1
* @since 1.8.0 
*/

public class PersonTest {


    @Test
    public PersonTest(){
        System.out.println("Excuting Person's default constructor Test");
        Person person = new Person("Seokhwan", "Lee", "Male", "28");
        asserTrue(person.toString.equals("Seokhwan Lee, Male, 28"));
    }
    
    @Test
    public String getFirstNameTest(){
        System.out.println("Excuting Person's getFirstName Test");
        Person person = new Person("Seokhwan", "Lee", "Male", "28");
        asserTrue(person.getFirstName().equals("Seokhwan"));
    }

    @Test
    public void setFirstNameTest(){
        System.out.println("Excuting Person's setFirstName Test");
        Person person = new Person();
        person.setFirstName("Seokhwan");
        asserTrue(person.getFirstName().equals("Seokhwan"));
        
    }

    @Test
    public String getLastNameTest(){
        System.out.println("Excuting Person's getLastName Test");
        Person person = new Person("Seokhwan", "Lee", "Male", "28");
        asserTrue(person.getLastName().equals("Lee"));
    }

    @Test
    public void setLastNameTest(){
        System.out.println("Excuting Person's setLastName Test");
        Person person = new Person();
        person.setLasttName("Lee");
        asserTrue(person.getLastName().equals("Lee"));
    }

    @Test
    public String getGenderTest(){
        System.out.println("Excuting Person's getGender Test");
        Person person = new Person("Seokhwan", "Lee", "Male", "28");
        asserTrue(person.getGender().equals("Male"));
    }

    @Test
    public void setGenderTest(){
        System.out.println("Excuting Person's setGender Test");
        Person person = new Person();
        person.setGender("Male");
        asserTrue(person.getGenderName().equals("Male"));
    }

    @Test
    public int getAgeTest(){
        System.out.println("Excuting Person's getAge Test");
        Person person = new Person("Seokhwan", "Lee", "Male", "28");
        asserTrue(person.getAge().equals("28"));
        
    }

    public void setAgeTest(Int age){
        System.out.println("Excuting Person's setAge Test");
        Person person = new Person();
        person.setAge("Male");
        asserTrue(person.getAge().equals("28"));
    }
    
}