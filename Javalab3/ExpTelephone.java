abstract class TrunkCall
{
    int duration;
    TrunkCall(int duration)
     {
       this.duration=duration;
     }
   abstract void bill();
   
    
}
class Lightning extends TrunkCall
{
   Lightning(int duration)
   {
      super(duration);
    }
   void bill()
   {
     double rate;
      rate=5.25*duration;
     System.out.println("Call Mode Lightning\n");
     System.out.println("Your Call Charges was"+rate);
   }
 
}
class Ordinary extends TrunkCall
{
  Ordinary(int duration)
   {
      super(duration);
    }
   void bill()
   {
     double rate;
      rate=1.25*duration;
      System.out.println("Call Mode Ordinary\n");
     System.out.println("Your Call Charges was"+rate);
   }
 
}
class Urgent extends TrunkCall
{
  Urgent(int duration)
   {
      super(duration);
    }
   void bill()
   {
     double rate;
      rate=3.25*duration;
      System.out.println("Call Mode Urgent\n");
      System.out.println("Your Call Charges was"+rate);
   }
 
}

class Call
{
    public static void main(String args[])
    {
    Lightning L= new Lightning(80);
    L.bill();
    Ordinary O = new Ordinary(20);
    O.bill();
    Urgent U= new Urgent(10);
    U.bill();
     
    }
}

    
