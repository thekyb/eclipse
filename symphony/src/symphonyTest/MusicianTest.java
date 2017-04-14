/*
  File name: MusicianTest
  Author: Seokhwan Lee. Stuent # 040842046
  Course: CST8288-OOP
  Project #: Project1
  Date: 12th, April, 2017
  Professor: Leanne Seaward
  
  Purpose: 
 
 */
package symphonyTest;

import static org.junit.Assert.*;
import symphony.Musician;
/** 
* @author Seokhwan Lee
* @see symphony.Person;
* @version 1-1
* @since 1.8.0 
*/

public class MusicianTest {

    @Test
    public MusicianTest(String expertise, int id){
        System.out.println("Excuting Musician's default constructor Test");
        Musician musician = new Musician("Violin", 00001);
        asserTrue(musician.toString.equals("Violin, 00001"));
    }

    @Test
    public String getExpertiseTest(){
        System.out.println("Excuting Musician's default getExpertise Test");
        Musician musician = new Musician("Cello", 00002);
        asserTrue(musician.getExpertise().equals("Cello"));
    }

    @Test
    public void setExpertiseTest(String expertise){
        System.out.println("Excuting Musician's default setExpertise Test");
        Musician musician = new Musician();
        musician.setExpertise("Piano");
        asserTrue(musician.getExpertise().equals("Piano"));
        
    }

    @Test
    public int getIdTest(){
        System.out.println("Excuting Musician's default getId Test");
        Musician musician = new Musician("Violin", 00003);
        asserTrue(musician.getId().equals(00003));
       
    }

    @Test
    public void setIdTest(int id){
        System.out.println("Excuting Musician's default setId Test");
        Musician musician = new Musician();
        musician.setId(00004);
        asserTrue(musician.getId().equals(00004));
   
    }
}