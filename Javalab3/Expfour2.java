class Player
{
     String name;
     int age;
     Player(int age,String name)
           {
             this.age=age;
             this.name=name;
           }
  void display()
      {
           System.out.println("Player Name:-"+name+"\n"+"Player Age:-"+age);
           
       }
}
class Player_Football extends Player
{
    int allgoals;
    int redcards;
    Player_Football(String Name,int Age,int allgoals,int redcards)
         {
	super(Age,Name);              
	this.allgoals=allgoals;
         this.redcards=redcards;
              
         }
 void display()
      {
         super.display();   
         System.out.println("All Goals:-"+allgoals +"\n" + "Redcards:-"+redcards);
            
      }
}
class Player_Hockey extends Player
{
    int allgoals;
    Player_Hockey(String Name,int Age,int allgoals)
         {
		 super(Age,Name);
              this.allgoals=allgoals;
             
         }
 void display()
      {
         super.display();   
         System.out.println("All Goals:-"+allgoals);
            
      }
}
class Drriver
{
    public static void main(String args[])
    {
    Player Fh= new Player_Hockey("Major Dhyanchand",32,300);
    Player_Football Fp=new Player_Football("Ronaldo",22,50,2);
    Fh.display();
    Fp.display();
   } 
}
