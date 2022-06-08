package com.learnjavaforcertification;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;

/*
 *Learning java for 1zo_808 certification
 * developer: Shreyash Gaikwad
 * Goal:MAANG F in pune
 */
public class shre_java_StringMethods {
    public static void main(String[] args) {
         // in this class we will learn string methods

        String str =" Hello there How Are you ? ";

        //string.length()
        //The String class length() method returns length of the specified String.
        System.out.println(str.length());//25

        //The Java String toUpperCase() method converts this
        // String into uppercase letter and
        // String toLowerCase() method into lowercase letter.

        //toLowerCase()
        System.out.println(str.toLowerCase());//hello there how are you ?
        //toUpperCase()
        System.out.println(str.toUpperCase());//HELLO THERE HOW ARE YOU ?

        //charAt()
        //The String class charAt() method returns a character at specified index.
        System.out.println(str.charAt(0));//H

        //getBytes()
        System.out.println(Arrays.toString(str.getBytes()));//[B@7c30a502

         //compareTo(other String)
        //if s1 > s2, it returns positive number
        //if s1 < s2, it returns negative number
        //if s1 == s2, it returns 0
        System.out.println(str.compareTo("Hello there How Are you Doing!"));//if equal print O if ig grater than passed +positive & -negatve when less than passed string

        //concat(sting)
        //The Java String class concat() method combines specified string at the end of this string. It returns a combined string.
        // It is like appending another string.
        System.out.println(str.concat("Doing"));//Hello there How Are you ?Doing

        //trim() remove spaces before and After
        //The String class trim() method eliminates white spaces before and after the String.
         System.out.println(str.trim());

         //startsWith() & endWith()
        //The method startsWith() checks whether the String starts with the letters passed as arguments and
        // endsWith() method checks whether the String ends with the letters passed as arguments.
        System.out.println(str.startsWith(" He"));//true
        System.out.println(str.endsWith("? "));//true

        //valueOf
        //The String class valueOf() method coverts given type such as int, long, float, double, boolean, char and char array into String.
        int a=1000;
        String newStr;
        System.out.println(str.valueOf(a)+a);

        //replace("","")
        //The String class replace() method replaces all occurrence of first sequence of character with second sequence of character.
        System.out.println(str.replace("e","bb"));


        //equalsIgnoreCase
        //The Java String class equalsIgnoreCase() method compares the two given strings on the basis of the content of the string irrespective of the case (lower and upper) of the string. It is just like the equals() method but doesn't check the case sensitivity. If any character is not matched, it returns false, else returns true.
        String s="shreyash";
        String s2="Shreyash";
        System.out.println(s.equalsIgnoreCase(s2));//true

        //indexOf and lastIndexOf()
        System.out.println(s.indexOf('h'));//1
        System.out.println(s.lastIndexOf('h'));//7

        System.out.println(str.indexOf("there"));//7
        String str2=str.concat("there");
        System.out.println(str2);// Hello there How Are you ? there
        System.out.println(str2.lastIndexOf("there"));//27


        //subString()
        //We pass beginIndex and endIndex number position in the Java substring method where beginIndex is inclusive, and endIndex is exclusive. In other words, the beginIndex starts from 0, whereas the endIndex starts from 1.
        String s1="javatpoint";
        System.out.println(s1.substring(2,4));//returns va
        System.out.println(s1.substring(2));//returns vatpoint
        // startIndex is inclusive
        //endIndex is not inclusive



    }
}
