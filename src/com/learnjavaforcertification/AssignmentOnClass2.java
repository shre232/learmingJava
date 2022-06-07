package com.learnjavaforcertification;

import java.net.StandardSocketOptions;
import java.sql.SQLOutput;
import java.util.Scanner;

public class AssignmentOnClass2 {
static int sumOfAnglesOfTriangle=180;
    static  double pi=3.147d;
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

/*
*        Write a program to enter two numbers and find their sum.
*        Write a  program to enter two numbers and perform all arithmetic operations.
*        Write a  program to enter length and breadth of a rectangle and find its perimeter.
*        Write a  program to enter length and breadth of a rectangle and find its area.
*        Write a  program to enter radius of a circle and find its diameter, circumference and area.
*       Write a  program to enter length in centimeter and convert it into meter and kilometer.
*       Write a  program to enter two angles of a triangle and find the third angle.
*        Write a  program to enter base and height of a triangle and find its area.
*        Write a  program to calculate area of an equilateral triangle.
 *       Write a  program to enter marks of five subjects and calculate total, average and percentage.
/
        Write a  program to enter P, T, R and calculate Simple Interest.
 */

        System.out.println("program output to enter two numbers and find their sum.");
        // write code to add 2 numbers
        int a = 2;
        int b = 8;
        //addition start
        int c = a + b;
        System.out.println("Addition of "+a+ " & "+b+": "+c);


        System.out.println("Write a  program to enter two numbers and perform all arithmetic operations.");

        //did division because it is little tricky.................

        //divide a int by float
        int num=10;
        float fnum=2.7f;
        int ans= (int) (num/fnum);//3  we can typecast to int but it will lead to data loss
        float ans2=num/fnum;//3.7037036
        System.out.println("ans stored to int == "+ans+" \nans stored to float == "+ans2);

        // dividing int by int
        int num1=100;
        int num2=3;
        System.out.println("ans == "+num1/num2);// 3
        System.out.println("ans should be =="+(float)num1/num2);//33.333332

        System.out.println("Multiply 2 nums");

        System.out.println(9*10);//90


        System.out.println("Write a  program to enter length and breadth of a rectangle and find its perimeter.");
        System.out.println("Enter length :");
        int length=sc.nextInt();
        System.out.println("Enter breadth:");
        int breadth=sc.nextInt();

         int area =length*breadth;
        int perimeter=2*length+(2*breadth);
        System.out.println("For Rectangle with length "+length+" breadth " +breadth+"\nArea : "+area+"\t Perimeter :"+perimeter);

        //fun activity : printing rectangle of given length and breadth
        IgnoreThisClassFornow ig=new IgnoreThisClassFornow();
        ig.printRectangle(length,breadth);


        System.out.println("Write a  program to enter radius of a circle and find its diameter, circumference and area");
        System.out.println("Enter Radius:");
         double radius=sc.nextInt();
         double diameter=radius*2;
//         double pi=3.147d;
         double circumference=pi*radius*2;
         double areaOfCircle=pi*radius*radius;
        System.out.printf("Diameter = %.2f \n",diameter);
        System.out.printf("Circumference =  %.2f \n ",circumference);
        System.out.printf("Area = %.2f  \n",areaOfCircle);


        System.out.println("Write a  program to enter length in centimeter and convert it into meter and kilometer.");
         //Write a  program to enter length in centimeter and convert it into meter and kilometer.
        //Start
        int lengthtoConvert=10000000;//in cms

        int toMeter=lengthtoConvert/100;
        float toKms=(float)toMeter/1000;

        System.out.println("Length in cms:"+lengthtoConvert+"cms \tin meter "+toMeter+"ms \tin Kilometers "+toKms+"Kms");
         //end



        System.out.println("Write a  program to enter two angles of a triangle and find the third angle.");
        //Write a  program to enter two angles of a triangle and find the third angle.
        System.out.println("Enter first angle");
        int angleA=sc.nextInt();
        System.out.println("Enter second angle");
        int angleB=sc.nextInt();
        if(angleA<180&&angleB<180){
            if(angleA>90 && angleB>90){
                System.out.println("only one angle can be graeter than 90 degree \n");

                    System.out.println("change 2nd angle "); //change 2nd angle
//                    angleB= sc.nextInt();
                angleB= sc.nextInt();
                System.out.println("third angle="+(180-(angleA+angleB))+" degrees");
            }else{
                System.out.println("third angle="+(180-(angleA+angleB))+" degrees");
            }
        }else{
            System.out.println("Enter valid angles i.e must be less than 180\nEnter Valid value of angle A");
            angleA=sc.nextInt();
            System.out.println("Enter valid value of angle B");
            angleB= sc.nextInt();
            System.out.println("third angle="+(180-(angleA+angleB))+" degrees");

        }

        System.out.println("Write a  program to enter base and height of a triangle and find its area.");
        //"Write a  program to enter base and height of a triangle and find its area."

        //start
        System.out.println("base");
        int base=sc.nextInt();
        System.out.println("height");
        int height= sc.nextInt();

        System.out.println("Area:"+(float)(0.5*base*height));
        //End

        System.out.println("Write a  program to calculate area of an equilateral triangle.");

        //Write a  program to calculate area of an equilateral triangle.
        //Start
        System.out.println("Enter side of equilateral Triangle");
        double side=sc.nextInt();//12

        System.out.println("Area of equilateral traiange ="+((Math.sqrt(3)/4)*(Math.pow(side,2))));//62.35382907247958
        //End

        System.out.println("Write a  program to enter marks of five subjects and calculate total, average and percentage.");
        //Write a  program to enter marks of five subjects and calculate total, average and percentage.

        //Start
        System.out.println("Enter Marks of 5 subjects");
        int sub1=sc.nextInt();
        int sub2= sc.nextInt();
        int sub3=sc.nextInt();
        int sub4=sc.nextInt();
        int sub5=sc.nextInt();

        //calculate total start
        int total=sub1+sub2+sub3+sub4+sub5;
        //calculate total end

        //calculate average start
        double average=(double) total/5;
        //calculate average end
//        double percentage=((double) total/500*100);
        //calculate percentage
        double percentage=((double)total/500)*100;

        System.out.println("Total "+ total+ "\tAverage "+average+"\tPercentage "+percentage);







//        // write code to swap two numbers
//        int a1=9;
//        int b1=10;
//        System.out.println("Before Swap a1 = "+a1+" b1= "+b1);
//        //swap Start
//        int temp;
//        temp=a1;
//        a1=b1;
//        b1=temp;
//
//        System.out.println("After Swap a1 = "+a1+" b1= "+b1);
//
//        // swap without third variable
//
//        System.out.println("......swap without third variable Start.....");
//        System.out.println("Before Swap a1 = "+a1+" b1= "+b1);
//        a1=a1+b1;//19
//        b1=a1-b1;//9
//        a1=a1-b1;//10
//        System.out.println("After Swap a1 = "+a1+" b1= "+b1);






    }
}
