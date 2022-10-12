/*
OOP - Fields and Methods:

Create a class called 'Employee' to store and manipulate details of an employee with private fields and public set / get methods.

Based on the no. of hours he worked, we have generate the amount payable to him.
Tax is 5% on his earnings, if he earns more than Rs. 30000 in a month.

class Employee
int _empID
string _empName
double _noOfHoursWorked
double _hourlyPrice

Add the following methods:
void SetEmpID(int value) : Sets value into _empID
int GetEmpID() : Gets value from _empID
void SetEmpName(string value) : Sets value into _empName
string GetEmpName() : Gets value from _empName
void SetNoOfHoursWorked(double value) : Sets value into _noOfHoursWorked
double GetNoOfHoursWorked() : Gets value from _noOfHoursWorked
void SetHourlyPrice() : Sets value into _hourlyPrice
double GetHourlyPrice() : Gets value from _hourlyPrice
double GetGrossSalary( ) : Returns gross earnings of the employee based on hourly price and no. of hours he / she worked.
double GetNetSalary( ) : Returns net earnings of the employee i.e. gross salary - tax

- Read inputs from keyboard in Main method and display all details at last, once.
- Process the details of only one employee.
*/
package Oop_Employe;

public class EmpMain {
	public static void main(String[] args) {
		Emp emp =new Emp();
		emp.SetEmpID(100);
		emp.SetEmpName("Soham");
		emp.SetHourlyPrice(10000);
		emp.SetNoOfHoursWorked(6);
		
		System.out.println("Employee Id :"+emp.GetEmpID());
		System.out.println("Employee Name :"+emp.GetEmpName());
		System.out.println("Employee Working Hours :"+emp.GetNoOfHoursWorked());
		System.out.println("Employee Hourly Price :"+emp.GetHourlyPrice());
		System.out.println("Employee  GrossSalary:"+emp.GetGrossSalary());
		System.out.println("Employee  NetSalary:"+emp.GetNetSalary());
	}
}

class Emp{
	private int _empID;
	private String _empName;
	private double _noOfHoursWorked;
	private double _hourlyPrice;
	
	
	

	void SetEmpID(int value) {
		this._empID=value;
	}
	

	public int GetEmpID(){
		return _empID;
	}
	
	public void SetEmpName(String value) {
		this._empName=value;
	}
	public String GetEmpName() {
		return _empName;
	}
	
	
	public void SetNoOfHoursWorked(double value) {
		this._noOfHoursWorked=value;
	}
	
	double GetNoOfHoursWorked() {
		return _noOfHoursWorked;
	} 
	void SetHourlyPrice(double value) {
		this._hourlyPrice=value;
	}
	
	double GetHourlyPrice() {
		return _hourlyPrice;
	} 
	
	double GetGrossSalary( ) {
		return (_hourlyPrice*_noOfHoursWorked);
	} 
	double GetNetSalary( ) {
		double totalTax = 0;
		double GetGrossSalary=GetGrossSalary();
		if(GetGrossSalary>30000) {
			 totalTax=(GetGrossSalary*5)/100;
			 System.out.println("Tax Ammount: "+totalTax);
			 double GetNetSalary=GetGrossSalary-totalTax;
			 return GetNetSalary;
		}
		double GetNetSalary = GetGrossSalary;
		return GetNetSalary;
	}
}
