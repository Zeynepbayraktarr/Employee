/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaenumtest2;

/**
 *
 * @author Zeynep
 */
public class JavaEnumTest2 {

  
    public static void main(String[] args) {
        
        Employee emp1 = new Employee (45, "Ahmnet", 1234);
        Employee emp2 = new Employee (32, "Ali", 1235);          
        Employee emp3 = new Employee (45, "Merve", 1236); 
        Employee emp4 = new Employee (45, "Nergis", 1237);
        
        Employee[] emps = {emp1, emp2, emp3, emp4 };
         
       
        Company comp = new Company(emps, CompanyName.GOOGLE);
      
        for(Employee e : emps){
            
            System.out.println(e.ssn);
        }
    }
    
}
