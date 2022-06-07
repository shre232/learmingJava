/*
 *Learning java for 1zo_808 certification
 * developer: Shreyash Gaikwad
 * Goal:MAANG F in pune
 */
package com.learnjavaforcertification;

public class SwapTwoNums {

    public static void main(String[] args) {


        // write code to swap two numbers start
        int a1 = 9;
        int b1 = 10;
        System.out.println("Before Swap a1 = " + a1 + " b1= " + b1);
        //swap Start
        int temp;
        temp = a1;
        a1 = b1;
        b1 = temp;

        System.out.println("After Swap a1 = " + a1 + " b1= " + b1);
        //End

        // swap without third variable Start

        System.out.println("......swap without third variable Start.....");
        System.out.println("Before Swap a1 = " + a1 + " b1= " + b1);
        a1 = a1 + b1;//19
        b1 = a1 - b1;//9
        a1 = a1 - b1;//10
        System.out.println("After Swap a1 = " + a1 + " b1= " + b1);
        //End
    }
}
