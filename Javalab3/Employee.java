class Employee
{
    String name;
    int empid;
    private  double salary;
    Employee(String name, int empid, double salary)
            {
               this.name=name;
               this.empid=empid;
               this.salary=salary;
             }
  

   void display()
   {
        System.out.println("Name:-"+name+"\n");
        System.out.println("Empid:-"+empid+"\n");
        System.out.println("Salary:-"+salary+"\n");

   }
}
class Manager extends Employee
{
  String Department;
  Manager(String name, int empid, double salary,String Department)
       {
          super(name,empid,salary);
          this.Department=Department;
       }
 void increaseSalary(int pin, double perc)
       {
            if(pin==3412)
              {
                   System.out.println("Salary Raise successfully ");
                   this.salary= this.salary+((perc*(this.salary))/100);
             }
       }
   
}

class Check
{
   public static void main(String args[])
        {
           Employee Ram= new Employee("Ram",1,30000);
           Ram.increaseSalary(3412,10);
           Ram.display();
           Manager Hari= new Manager("Hari",2,40000,"CIT");
           Hari.increaseSalary(3412,11);
           Hari.display();
        }
}
