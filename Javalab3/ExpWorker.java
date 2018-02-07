class Worker
{
     int  sr;
     String name;
     Worker(String name,int sr)
      {
         this.sr=sr;
         this.name=name;
      }
 void display()
     {
         System.out.println("Name:-"+name+"\n"+"Salary Per hour"+sr+"\n");
     }
  void compay(int hours)
      {
             int wage;
             wage=hours*sr;
             System.out.println("Your wage is:-"+wage);
      }
  
}
class DailyWorker extends Worker
{

     int hours; 
     DailyWorker(String name,int sr,int hours)
                {
                     super(name,sr);
                     this.hours=hours;
                }
      void compay()
               {
                 int wage;
                  wage=hours*sr;
                  System.out.println("Your wage is:-"+wage);
               }
     void display()
          {
               super.display();
           }

}
class SalaryWorker extends Worker
{
      int week;
      SalaryWorker(String name,int sr,int week)
                {
                     super(name,sr);
                     this.week=week;
                }
   void compay()
        {
               int wage;
               
               
               wage=week*40*sr;
               
              
           System.out.println("Your wage is:-"+wage);
              
        }
void display()
          {
               super.display();
           }
      
}


class Compute
{
    public static void main(String args[])
    {
        SalaryWorker Virat= new SalaryWorker("Virat",300,8);
        Virat.display();
        Virat.compay();
        DailyWorker Dhoni= new DailyWorker("Dhoni",200,50);
        Dhoni.display();
        Dhoni.compay();
        Worker Bill = new Worker("Bill", 100);
        Bill.display();
        Bill.compay(10);
     }
}


