/*
 *Learning java for 1zo_808 certification
 * developer: Shreyash Gaikwad
 * Goal:MAANG F in pune
 */
package com.learnjavaforcertification;

public class IgnoreThisClassFornow {
    public void printRectangle(int length,int breadth){
        for (int i=0;i<breadth;i++){
            for(int j=0;j<length;j++) {
                if (j == 0 || i==0 || j == length -1||i==breadth-1) System.out.print(" * ");
                else System.out.print("   ");
            }
            System.out.println();
        }
    }
}
