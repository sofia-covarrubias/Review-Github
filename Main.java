import java.util.Scanner;

class Main 
{
  public static void main (String[] args) 
  {
    Scanner kb = new Scanner (System.in);
    int num1;
    System.out.println("Pick an int: ");
    num1 = kb.nextInt();
    System.out.println("Today's lucky number is " + num1);
  } // end main method

} // end Main class