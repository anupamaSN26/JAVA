import java.util.Scanner;
class employee{


    public static void main(String[] args) {
    String Name,Address,Dep,sub;
    int Empid,sal;
 
    System.out.println("Enter the no. of employees");
   
    Scanner s = new Scanner(System.in);   
    int n=s.nextInt();
        Teacher e[] = new Teacher[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the Employee Id : ");
            Empid= s.nextInt();
            System.out.print("Enter the Employee name : ");
            Name = s.next();
            System.out.print("Enter the Address : ");
            Address =s.next();
            System.out.print("Enter the salary : ");
            sal =s.nextInt();
            System.out.print("Enter the Department : ");
            Dep =s.next();
            System.out.print("Enter the subject : ");
            sub=s.next();
            e[i] = new Teacher(Empid,Name,Address,sal,Dep,sub);
            System.out.println("..........................................");
         }
  
  
    for(int i=0; i<n; i++) {
   	e[i].display();
     System.out.println("..........................................");
    }
    }
}

class Employees {
    int Empid;
    String Name;
    String Address;
    int Salary;

    Employees(int id,String name,String addr,int salary){
        this.Empid   = id;
        this.Name    = name;
        this.Address = addr;
        this.Salary  = salary;
    }
    void display(){
        System.out.println("EmpID   : " + this.Empid);
        System.out.println("Name    : " + this.Name);
        System.out.println("Address : " + this.Address);
        System.out.println("Salary  : " + this.Salary);
    }

}



class Teacher extends Employees{  
    String Department;
    String Subject;
    Teacher(int id,String name,String addr,int salary,String dept,String subj){
        super(id,name,addr,salary);
        this.Department=dept;
        this.Subject=subj;
    }
    void display(){   
        super.display();
        System.out.println("Dept Name : " + this.Department);
        System.out.println("Subject Name : " + this.Subject);
        
    }
}