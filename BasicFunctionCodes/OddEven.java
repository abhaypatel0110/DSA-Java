package BasicFunctionCodes;
import java.util.Scanner;
//finding whether a number is even or odd function
public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to check :");
        int number = input.nextInt();
        oddEvenFinder(number);
        input.close();
    }
    public static void oddEvenFinder(int number)
    {
        if(number%2==0)
        {
            System.out.println("Given number is even");
        }
        else
        {
            System.out.println("Given number is odd");
        }
    }
}
