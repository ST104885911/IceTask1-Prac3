/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practical3;
import java.util.Random;

/**
 *
 * @author emeris
 */
public class Guest {
    //private variables
    private String patientID;
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private GuestType guestType;
    
    //Constructor
    public Guest(String firstName,String lastName,int age,String gender,GuestType guestType){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.guestType = guestType;
        this.patientID = generateID() ;
        
    }
    private String generateID(){
        Random random = new Random();
        String id = "";
        
        for(int i =0; i<10;i++){
            int number = random.nextInt(0,9);
            id = id+ Integer.toString(number);
        }
       return id;         
        
    }
    public String getFirstName(String name) {
        return firstName;
    }
    public void setFirstName (String name) {
        firstName = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public GuestType getGuestype() {
        return guestType;
    }

    public void setGuestype(GuestType guestype) {
        this.guestType = guestType;
    }
    public String getPatientID(){
        return patientID;
    }
  public void displayInfo(){
      System.out.println("---Guest Info--");
      System.out.println("First Name : " +firstName);
      System.out.println("Last Name : "+lastName);
      System.out.println("Guest Type : "+guestType);
      System.out.println("Guest ID :"+ patientID);
  }  

    private String getFirstName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  
  //Sub Class
  class DayVisitor extends Guest {
      private String visitPurpose;
      //constructor
      public DayVisitor(String firstName,String lastName,int age,String gender,GuestType guestType,String visitPurpose){
          super(firstName,lastName,age,gender,guestType);
          this.visitPurpose = visitPurpose;
      }
      public void displayInfo() {
          super.displayInfo();
          System.out.println("Visit purpose : "+visitPurpose);
      }
       public void visitHotel() {

           System.out.println(super.getFirstName() + "has visited our hotel");
      }
      
      public String getVisitPurpose() {
          return visitPurpose;
      }
      
      public void setVisitPurpose(String visitPurpose) {
          this.visitPurpose = visitPurpose;
      }
      
 }
class Vip extends Guest{
    public Vip(String firstName, String lastName, int age, String gender, GuestType guestType) {
        super(firstName,lastName, age, gender, guestType);
    }
    public void displayInfo(){
        super.displayInfo();
    }
  
      
      
  }
                
  }
  
    
  
    
    

