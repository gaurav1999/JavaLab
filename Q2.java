import java.awt.*;
import java.io.*;
import java.util.*;
import java.math.*;
import java.util.Arrays;
import java.util.Scanner;

class Test
{
 
  
  static int score=0;
  static public String changeCharInPosition(int position, char ch, String str){
    char[] charArray = str.toCharArray();
    charArray[position] = ch;
    return new String(charArray);
}
  public static void resultCalc(int cord[],String question) //Function To Calculate Result
          {
                 int flag=0;
            Scanner scan = new Scanner(System.in);
            Arrays.sort(cord);
             for(int i=0;i<5;i++)
                 {
                     char c = scan.next().charAt(0);
                      if(c==question.charAt(cord[i]))
                        {
                          flag++;
                        }
                      else
                         {
                            flag=-1;
                            break;
                         }
                         
                 }
           if(flag>0)
             {
                 Test.score+=5;
               }
           else if(flag<0)
            {
               Test.score=Test.score-1;
             }

          }

  public static void game(String word)  //Function To Present Questions
   {
    
    String copy=word;
    int erase[]=randomGen(0,10,5);
    for(int i=0;i<5;i++) //Loop to print Question
       {
           copy = changeCharInPosition(erase[i], '_', copy);
        }
    System.out.print(copy);//Printed Question;
      
         Test.resultCalc(erase,word);
    
   
    
  }
  public static int[] randomGen(int start, int end, int count) {   //Function To Generate Non repeating Integer Values
    Random rng = new Random();

    int[] result = new int[count];
    int cur = 0;
    int remaining = end - start;
    for (int i = start; i < end && count > 0; i++) {
        double probability = rng.nextDouble();
        if (probability < ((double) count) / (double) remaining) {
            count--;
            result[cur++] = i;
        }
        remaining--;
    }
    return result;
} //Function ends


  public static void main(String args[]) //Main Question
     {
           String words[]=                              {"Appreciate","Arithmetic","Artficial","Earthquake","Economical","Elasticity","Population","Positively","Screenplay","Toothpaste"};  
   int wordsOfGame[]=Test.randomGen(0,10,5);  
   
    for(int i=0;i<5;i++)
   { 
       
           Test.game(words[wordsOfGame[i]]);
          }

      System.out.println("Your Score is:"+(Test.score));

       
     }//Main ends


}//Calss Ends







