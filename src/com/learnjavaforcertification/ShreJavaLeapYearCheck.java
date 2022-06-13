package com.learnjavaforcertification;

import java.util.Scanner;

/**
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * Learning Java For Certification
 * Developer: art3m
 * Date:08-06-2022
 *
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
public class ShreJavaLeapYearCheck {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int year=sc.nextInt();

        leapYearCheck(year);


    }
    static void leapYearCheck(int year){
        System.out.print(year+" is ");
        if(year%4==0){
            if(year%100==0&&year%400!=0){
                System.out.println("not Leap");
            }
            else{
                System.out.println("leap");
            }

        }
        else {
            System.out.println("Not Leap");
        }
    }
}
