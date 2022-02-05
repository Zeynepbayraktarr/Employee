
package javaenumtest2;
    enum CompanyName{
       MİCROSOFT ("Microsoft Corporation is a technology company with headquarters in Redmond, Washington"),
       GOOGLE("Google was founded in 1998 by Larry Page and Sergey Brin while");
       
       String desc;
      
      private CompanyName(String desc){
          this.desc = desc;
      }
    }

public class Company {
    Employee[] employees;
    CompanyName cName;
    
    public Company(Employee[] emps , CompanyName cName){
        
        this.employees = emps;
        this.cName = cName;
    }
    public CompanyName getCompanyName() {
        
        return cName;
    }
    
}
