/*
   Write a java program to find out below problem, in a small company, 
the average salary of three employees is Rs10,000 per week. 
If one employee earns Rs11000 and other earns Rs5000, how much will the third employee earn?

 */

public class LabQus1 {
    public static void main(String[] args) {
        int averageSalary=10000;        // per week
        int EmpSalary1 =11000;// per week
        int EmpSalary2 =5000;// per week
        int averageSalData =averageSalary*3;
        int TotalEmp1Emp2=EmpSalary1+EmpSalary2;
        int EmpSalary3 =averageSalData-TotalEmp1Emp2;
        System.out.print("third employee earn :"+EmpSalary3);
    }
}
/*
 * output :third employee earn :14000                                                                                                                                                   
 */