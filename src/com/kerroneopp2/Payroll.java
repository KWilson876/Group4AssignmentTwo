// Group Members: Kerrone Wilson - 1817001549 | Tukeisha Brown - 1300067096 | Erroldo McCarthy - 2017001806

package com.kerroneopp2;

import java.util.ArrayList;
import java.util.List;

public class Payroll {

    public static void main(String[] args) {
        StaffMember sMember = new StaffMember();
        sMember.display();

        List<SalesRep> salesReps = new ArrayList<>();
        salesReps.add(new SalesRep("Mr.","Erroldo", "McCarthy", "VTDI001",40, 5000));
        salesReps.add(new SalesRep("Ms.", "Tukeisha", "Brown", "VTDI001",30, 1000));
        salesReps.add(new SalesRep("Ms.", "Steph", "Smith", "VTDI003", 38, 920));
        salesReps.add(new SalesRep("Mrs.", "Kae", "Francis", "VTDI004", 20, 1000));
        salesReps.add(new SalesRep("Mr.", "Saint", "John", "VTDI005", 12, 1200));

        for(int i = 0; i < salesReps.size(); i++) {
            salesReps.get(i).display();
            salesReps.get(i).calculateSalary();;
        }

        Manager manager1 = new Manager("Mr.","Kerrone", "Wilson", "VTDI000", 45, 5890.99);
        manager1.display();
        manager1.calculateSalary();
    }
}
