/*
  File name: Musician
  Author: Seokhwan Lee. Stuent # 040842046
  Course: CST8288-OOP
  Project #: Project1
  Date: 12th, April, 2017
  Professor: Leanne Seaward
  
  Purpose: 
 
 */
package symphony;

import symphony.Person.Gender;

/** 
* @author Seokhwan Lee
* @version 1-1
* @since 1.8.0 
*/
public class Musician extends Person{

    private int id;
    private String expertise;

    public Musician(String firstName, String lastName, Gender gender, int age){
        super(firstName, lastName, gender, age);
    }
    public Musician(String firstName, String lastName, Gender gender, int age, String experties, int id){
        this(firstName, lastName, gender, age);
    	setExpertise(expertise);
        setId(id);
    }

	public String getExpertise(){
        return expertise;
    }

    public void setExpertise(String expertise){
        this.expertise = expertise;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String toString(){
        return expertise + ", " + id;
    }
}
