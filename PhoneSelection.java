/********************************************************************
*MartianMoney.java
/********************************************************************
*Maira Ahsan
*09/14/2022
*CMSC-255-001
********************************************************************/
import java.util.Scanner;
public class PhoneSelection  {
public static void main(String[] args) {
            Scanner scnr = new Scanner (System.in);
            System.out.println("Enter a single letter, and I will tell you what the corresponding digit is on the telephone");
            char letter = scnr.next().charAt(0);
            letter = Character.toUpperCase(letter); 
            
/*********************************
1) Prompt user to enter a singleLetter 
2)  If singleLetter = A || B || C, print 2
3) If singleLetter = D || E || F, print 3
4) If singleLetter = G || H || I, print 4
5) If singleLetter = J || K || L, print 5
6) If singleLetter =  M || N || O, print 6
7) If singleLetter = P || Q || R || S, print 7 
8) If SingleLetter = T || U || V , print 8
9) If SingleLetter = W || X || Y || Z, print 9
10) print digit
***********************************/

/**1) Prompt user to enter a singleLetter**/



/* 2)  If singleLetter = A || B || C, print 2*/

    if (letter == 'A' || letter == 'B' || letter == 'C') {
	System.out.println("The digit " + 2 + " corresponds to the letter " + letter + " on the telephone.");
}

/* 3) If singleLetter = D || E || F, print 3*/
else
    if (letter == 'D' || letter == 'E' || letter == 'F' ) {
    System.out.println("The digit " + 3 + " corresponds to the letter " + letter + " on the telephone.");
}

/* 4) If singleLetter = G || H || I, print 4*/
else 
    if (letter == 'G' || letter == 'H' || letter == 'I') {
    System.out.println("The digit " + 4 + " corresponds to the letter " + letter + " on the telephone.");
}

/*5) If singleLetter = J || K || L, print 5*/ 
else 
    if (letter == 'J' || letter == 'K' || letter == 'L' ) {
    System.out.println("The digit " + 5 + " corresponds to the letter " + letter + " on the telephone.");
}
/*6) If singleLetter =  M || N || O, print 6*/
else 
    if (letter == 'M' || letter == 'N' || letter == 'O') {
     System.out.println("The digit " + 6 + " corresponds to the letter " + letter + " on the telephone.");
}
/*7) If singleLetter = P || Q || R || S, print 7 */
else 
    if (letter== 'P' || letter == 'Q' || letter == 'R' || letter == 'S') {
    System.out.println("The digit " + 7 + " corresponds to the letter " + letter + " on the telephone.");
}
/*8) If SingleLetter = T || U || V , print 8*/ 
else 
    if ( letter == 'T' || letter == 'U' || letter == 'V' ) {
    System.out.println ("The digit " + 8 + " corresponds to the letter " + letter + " on the telephone.");
}
/*9) If SingleLetter = W || X || Y || Z, print 9*/
else 
    if ( letter == 'W' || letter == 'X' || letter == 'Y' || letter == 'Z'){
    System.out.println ("The digit " + 9 + " corresponds to the letter " + letter + " on the telephone.");

}
else {
    System.out.println("There is no matching digit.");
}
    scnr.close();   
}
}


