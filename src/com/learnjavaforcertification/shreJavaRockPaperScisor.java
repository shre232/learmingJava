package com.learnjavaforcertification;
import java.util.*;
/**
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * Learning Java For Certification
 * Developer: art3m
 * Date:09-06-2022
 * <p>
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
public class shreJavaRockPaperScisor {
    public static void main(String[] args) {
//        taking random num
        Random random=new Random();
        int randomNum=random.nextInt(3);
//           scanning user object
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your object:");
        String userInpt= sc.next();
        int usernum;
        String compHolds="";

        // converting int int to compare

        if(userInpt.equalsIgnoreCase("rock")){
            usernum=0;
        }
        else if(userInpt.equalsIgnoreCase("paper"))
        {
            usernum=1;
        }
        else if(userInpt.equalsIgnoreCase("scissors")){
            usernum=2;
        }
        else{
            usernum=-1;
            System.out.println("It a game of Rock Paper Scissors!");
        }

        // converting random num to string for printing results
        switch (randomNum){
            case 0:
                compHolds="rock";
                break;
            case 1:
                compHolds="paper";
                break;
            case 2 :
                compHolds="scissors";
                break;

        }
//        Game logic
      if(randomNum>usernum){
          System.out.println("Computer Wins! "+compHolds+" beats "+userInpt);
      }
      else if(usernum>randomNum){
          System.out.println("You Win! "+userInpt+" beats "+compHolds);

      }
      else{
          System.out.println("Its a tie computer have "+compHolds+" you have "+userInpt);
      }
    }
}
