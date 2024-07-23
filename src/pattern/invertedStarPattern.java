package pattern;

import java.util.Scanner;
import java.lang.System;

public class invertedStarPattern{
    
  public static void printInvertedStar1(int n){
    int tnol = n;
    int cnol = 1;
    int stars = n;
    while(cnol <= tnol){
        //print stars
        for(int i=1; i<=stars; i++){
            System.out.print("* ");
        }
        // prepare for next line
        cnol++;
        stars--;
        System.out.println();
    }
}


  public static void printInvertedStar2(int n){
    for(int i=n; i>=0; i--){
      for(int j=i; j>=0; j--){
        System.out.print("* ");
      }
      System.out.println();
    }
  }




  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the value of n: ");
    int n = in.nextInt();

    //printInvertedStar1(n);
    printInvertedStar2(n);
   
   
    
    
  }
    
}
