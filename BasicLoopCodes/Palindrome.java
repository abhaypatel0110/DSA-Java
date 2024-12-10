package BasicLoopCodes;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string to check");
        String word = input.next();
        String reversed = "";
        for(int i=0;i<word.length();i++)
        {
            char ch = word.charAt(i);
            reversed = ch+reversed;
        }
        /*instead of using the loop to reverse the string we can also use stringbuilder to reverse it
         * String reversed = new StringBuilder(word).revere().toString();
        */
        if(reversed.equals(word))
        {
            System.out.println("Given word "+word+" is palindrome");
        }
        else{
            System.out.println("Given word "+word+" is not palindrome");
        }

        input.close();
    }
}
