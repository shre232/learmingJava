/*
 *Learning java for 1zo_808 certification
 * developer: Shreyash Gaikwad
 * Goal:MAANG F in pune
 */
package com.learnjavaforcertification;

import java.util.Scanner;

public class Problem_1 {
   /*Write a program to get marks of 5 students as input 
   and calculate Percentage
   Marks out of 100
   * */
   static int outOfMArks = 500;
   public static void main(String[] args) {
       //Taking Input
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Marks Of subjects");

       System.out.println("English:");
       int marksEng = sc.nextInt();

       System.out.println("Maths:");
       int marksMaths = sc.nextInt();

       System.out.println("Science:");
       int marksSci = sc.nextInt();

       System.out.println("Social Science:");
       int marksSocialSci = sc.nextInt();

       System.out.println("Hindi:");
       int marksHin = sc.nextInt();

       // Inside validityChecker Function
       int totalMarks=validityChecker(marksEng,marksHin,marksMaths,marksSci,marksSocialSci);
       //Inside Percentage Function
       double percentage = ((double)totalMarks / outOfMArks) * 100;

       percentagePrint(percentage);
   }
   static int  validityChecker(int marksEng,int marksHin,int marksMaths,int marksSci,int marksSocialSci){
       int total=0;
       Scanner sc =new Scanner(System.in);
       if(marksEng>=100||marksHin>=100||marksEng>=100||marksMaths>=100||marksSci>=100||marksSocialSci>=100){
           if(marksEng>100){
               System.out.println("Enter valid marks of English");
               marksEng = sc.nextInt();

           }
           else if(marksEng==100){
               System.out.println("You got Out of marks in English!!!");
           }
           if(marksHin>100){
               System.out.println("Enter valid marks of Hindi");
               marksHin = sc.nextInt();
           }else if(marksHin==100){
               System.out.println("You got Out of marks in Hindi!!!");
           }
           if(marksMaths>100){
               System.out.println("Enter valid marks of Maths");
               marksMaths= sc.nextInt();
           }else if(marksMaths==100){
               System.out.println("You got Out of marks  Maths!!!");
           }
           if(marksSocialSci>100){
               System.out.println("Enter valid marks of Social Science");
               marksSocialSci = sc.nextInt();
           }
           else if(marksSocialSci==100){
               System.out.println("You got Out of marks in Social Science!!!");
           }
           if(marksSci>100){
               System.out.println("Enter valid marks of  Science");
               marksSci = sc.nextInt();
           }
           else if(marksSci==100) {
               System.out.println("You got Out of marks in Science!!!");
           }
       }
       return total=marksEng+marksHin+marksSci+marksSocialSci+marksMaths;
   }
   static void percentagePrint(double percentage){
       if(percentage<40){
           System.out.println("You Failed"+ percentage);
       }
       else if(percentage>70)
       {
           System.out.println("Counratulations you passed with Distinction! with:"+percentage+"%");
       }
       else {
           System.out.println("You Passed With :" + percentage + "%");
       }

   }
}
