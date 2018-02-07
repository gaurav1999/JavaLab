class Parent
{
     int data;
    Parent(int data)
      {
          this.data=data;
       }
 void display()
     {
       System.out.println(""+data);
     }
}
class Child extends Parent
{
     int number;
     Child(int number,int x)
         {
	super(x);           
 	this.number=number;
            
         }
 void display()
      {
         System.out.println(""+number+data);
       }
}
class Driver
{
   public static void main(String args[])
                 {
                    Child c=new Child(20,30);
                    c.display();
                  }
}
