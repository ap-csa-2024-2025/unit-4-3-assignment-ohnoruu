import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // write solutions to problems here
    //Problem 1
    System.out.println("Problem 1: ");
    for (int i = 1; i <= 25; i += 1){
      if (i % 2 == 1){
      System.out.print(i + " ");
      System.out.println("\n");
      }
    }

    //Problem 2
    System.out.println("Problem 2: ");
    int numCycles = 0;
    for (int num = 17; num <=73; num += 1){
      System.out.print(num + " ");
      numCycles ++;
      if (numCycles % 10 == 0){
        System.out.println("\n");
      }
    }

    //Problem 3
    System.out.println("Problem 3: ");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number between 0 and 50: ");
    int numInput = sc.nextInt();
    numCycles = 0;
    if (numInput > 0 && numInput < 50){
      for (int val = numInput; val <= 50; val++){
        System.out.print(val + " ");
        numCycles++;
        if (numCycles % 5 == 0){
          System.out.print("\n");
        }
      }
    } else {
      System.out.println("error");
    }

    //Problem 4
    System.out.println("Problem 4: ");
    System.out.println("Enter a positive integer: ");
    int valInput = sc.nextInt();
    
  }
}
