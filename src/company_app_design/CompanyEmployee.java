package company_app_design;

public class CompanyEmployee {

    /** INSTRUCTIONS
     *  This class has a main method where you will be able to create instances of the EmployeeInfo class in order
     *  to use attributes and methods.
     *
     *  Demonstrate as many methods as possible here. Feel free to show off what you've learned so far.
     *
     *  The goal of this application is to provide basic employee information services
     *  Try to think like a Software Developer
     */
    public static void main(String[] args) {
    EmployeeInfo employee = new EmployeeInfo("Fariha", 12345, "QA tester","ff77@gmail.com", "IT", 80000 );
        System.out.println("Fariha earned:"+employee.calculateAnnualBonus(80000, 4));
    //employee.calculateEmployeePension(80000);
        System.out.println("pension of the employee:"+ employee.calculateEmployeePension(80000));
    }

}
