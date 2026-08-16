/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practical3;

import com.mycompany.practical3.Dayvisitor;

/**
 *
 * @author emeris
 */
public class Practical3 {

    public static void main(String[] args) {
         Guest guest1 = new Guest("Aphile", "Shezi", 22, "Male", GuestType.VIP);
        guest1.displayInfo();
 
        Guest guest2 = new DayVisitor("Mr", "Bayat", 30, "Male", GuestType.DAY_VISITOR, "Restaurant");
        guest2.displayInfo();
 
        DayVisitor guest3 = new DayVisitor("Mr", "Bayat", 30, "Male", GuestType.DAY_VISITOR, "Restaurant");
        guest3.displayInfo();
        guest3.visitHotel();
 
        guest1.setAge(23);
 
        guest1.displayInfo();
        
    }
}
