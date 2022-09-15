/* Create any real time logical entity with atleast 3 non static properties and create all possible
type of parameterized constructor. Create objects using each type of constructor and display the object data.
*/
public class LabQus3 {
    int EmpID,Salary;
    String Name,Dep;
    LabQus3(String Name,String Dep){
        this.Name=Name;
        this.Dep=Dep; 
        
    }
    LabQus3(int EmpID,int Salary){
    this.EmpID=EmpID;
    this.Salary=Salary;
    }
    LabQus3(String Name,String Dep,int EmpID,int Salary){
        this.Name=Name;
        this.Dep=Dep; 
        this.EmpID=EmpID;
        this.Salary=Salary;
    }
    void Display(){
        System.out.println(EmpID+" "+Name+" "+Salary+" "+Dep);
    }
    public static void main(String[] args) {
        //creating Employee 
        LabQus3 a=new LabQus3("Soham","Manager");
        LabQus3 b=new LabQus3(349,100000);
        LabQus3 c=new LabQus3("Aayush","Developer");
        LabQus3 d=new LabQus3(100,250000);
        LabQus3 e=new LabQus3("soham","Developer",1002,500000);
        a.Display();b.Display();c.Display();d.Display();e.Display();
    }
}
