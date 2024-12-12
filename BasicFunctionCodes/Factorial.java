package BasicFunctionCodes;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to find it's fctorial :");
        int number = input.nextInt();
        facto(number);
        System.out.println("Factorial of given number : "+number +" is "+ facto(number));
        input.close();
    }


    public static int facto(int n)
    {
        int factorial = 1;
        for(int i=1;i<=n;i++)
        {
            factorial = factorial * i;
        }
        return factorial;
    }
    
}
