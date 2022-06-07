/*
 *Learning java for 1zo_808 certification
 * developer: Shreyash Gaikwad
 * Goal:MAANG F in pune
 */
package com.learnjavaforcertification;

public class Shre_java_2 {
    public static void main(String[] args) {


        //variable name validity;
        int $ = 60;//valid variable name
        int _s = 78;//valid variable name
        int s_ = 1; // valid variable name

        //we can add underscores in between integers in below ways

        int n=1_3_3;//valid declartion
        //int n1=_1232;//invalid declartion
        //int n1=133_;//invalid declaration
        double d=1_2_3_4.5_4_8;//valid 123.548




    /* data type size and can store
    |----------------|-----------------------|-------------------------------------------------------------------------------------|
    |Data Type       |     	Size	         |                                Description                                          |
    |  byte	         |      1 byte	         |                 Stores whole numbers from  -128 to 127                              |
    |  short	     |      2 bytes	         |               Stores whole numbers from -32,768 to 32,767                           |
    |  int	         |      4 bytes	         |            Stores whole numbers from -2,147,483,648 to 2,147,483,647                |
    |  long	         |      8 bytes	         |   Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |
    |________________|_______________________|_____________________________________________________________________________________|
*/
        // data type range for integer type
        //byte a=-129;    Invalid
        byte a = -128; //valid
        byte b = 127;  //valid
        // byte b1=128; Invalid
        System.out.println("Byte Can hold from: " + a + "to:" + b);

//        short num=-32769;Invalid
//        short num=32768;Invalid

        short num = -32768;
        short num1 = 32767;
        System.out.println("Short Can hold from: " + num + "to:" + num1);

        int anyNum = 2_147_483_647;// compiler reads as 2147483647
        int anyNum2 = -2147483648;
//        sizeOf(anyNum);
        System.out.println("int Can hold from: " + anyNum + "to:" + anyNum2);
        //
        long $iwant = 9223372036854775807L;// we should add 'L' as suffix
        long $ihave = -9223372036854775807L;
        System.out.println("Long Can hold from: " + $iwant + "to:" + $ihave);

        float f=2147.022225555555555555f;// round of till 6th to 7th digit after decimal  size = 4 bytes
        System.out.println("Float"+f);
        double d1=2147.0222255555555555556666666666d;
        System.out.println("DOUBLE:" + d);// round of till 12th to 13th digit after decimal  size = 8 bytes



        // Char start


        // we can initialize char 2 ways i.e. 1. giving num
        //                                    2. by giving Ascii value

/*
        Dec  Char                           Dec  Char     Dec  Char     Dec  Char
        ---------                           ---------     ---------     ----------
        0  NUL (null)                      32  SPACE     64  @         96  `
        1  SOH (start of heading)          33  !         65  A         97  a
        2  STX (start of text)             34  "         66  B         98  b
        3  ETX (end of text)               35  #         67  C         99  c
        4  EOT (end of transmission)       36  $         68  D        100  d
        5  ENQ (enquiry)                   37  %         69  E        101  e
        6  ACK (acknowledge)               38  &         70  F        102  f
        7  BEL (bell)                      39  '         71  G        103  g
        8  BS  (backspace)                 40  (         72  H        104  h
        9  TAB (horizontal tab)            41  )         73  I        105  i
        10  LF  (NL line feed, new line)    42  *         74  J        106  j
        11  VT  (vertical tab)              43  +         75  K        107  k
        12  FF  (NP form feed, new page)    44  ,         76  L        108  l
        13  CR  (carriage return)           45  -         77  M        109  m
        14  SO  (shift out)                 46  .         78  N        110  n
        15  SI  (shift in)                  47  /         79  O        111  o
        16  DLE (data link escape)          48  0         80  P        112  p
        17  DC1 (device control 1)          49  1         81  Q        113  q
        18  DC2 (device control 2)          50  2         82  R        114  r
        19  DC3 (device control 3)          51  3         83  S        115  s
        20  DC4 (device control 4)          52  4         84  T        116  t
        21  NAK (negative acknowledge)      53  5         85  U        117  u
        22  SYN (synchronous idle)          54  6         86  V        118  v
        23  ETB (end of trans. block)       55  7         87  W        119  w
        24  CAN (cancel)                    56  8         88  X        120  x
        25  EM  (end of medium)             57  9         89  Y        121  y
        26  SUB (substitute)                58  :         90  Z        122  z
        27  ESC (escape)                    59  ;         91  [        123  {
        28  FS  (file separator)            60  <         92  \        124  |
        29  GS  (group separator)           61  =         93  ]        125  }
        30  RS  (record separator)          62  >         94  ^        126  ~
        31  US  (unit separator)            63  ?         95  _        127  DEL
            */
        char c='d';// holds ascii value of given character  size = 2 byte supports unicode
        char till= 65535;
        char start=0;
        System.out.println(till);// prints ￿

        System.out.println(start);//prints blank space

        // we can use num to print ascii values and visa versa
        char ch=0;//A
       // System.out.println(ch);

        //Print Ascii values

        for(int i=ch;i<65565;i++){
            System.out.print(i+" = "+ch+"\t");
            ch++;
        }//prints unicode values
   char dev='ऋ';

        System.out.println((int)(dev));//prints integer value of char



    }

}
