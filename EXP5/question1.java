public interface Square
{
    
   void area(int side);
}
class Arithmetic implements Square
{
   
   int side;
   void area(int side)
     {
          int a;
          this.side=side;
         a=this.side*side;
            System.out.println("The area of given Square is:-"+a);
      }

}
class ToTest
{
 
   public static void main(String args[])
    {
          Arithmetic s1= new Arithmetic();
         
          s1.area();
     }

}
