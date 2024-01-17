package arraydemo;

import java.util.Scanner;

/**
 *
 * @author jasba
 */
public class ArrayDemo {

    public static void main(String[] args) {
    System.out.println("Enter a word");
    Scanner input = new Scanner(System.in);
    
    String myWord = input.nextLine();
    
    char[] myLetters = new char[myWord.length()];
    
//    for(int i = 0; i<myWord.length(); i++)
    for(int i = 0; i<myLetters.length; i++)
    {
        myLetters[i] = myWord.charAt(i);
        
    }
    
    System.out.println("Printing in reverse");
    
    for (int i = myLetters.length-1; i >=0; i--)
    {
        System.out.println(myLetters[i]);
    }
    }
    
}
