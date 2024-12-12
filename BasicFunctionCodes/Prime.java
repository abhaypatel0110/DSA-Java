package BasicFunctionCodes;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to check for prime :");
        int number = input.nextInt();
        primeFinder(number);
        input.close();
    }

    public static boolean primeFinder(int n)
    {
        if(n<=1)
        {
            return false;
        }
        int c=2;
        while(c*c<=n)
        {
            if(n%2==0)
            return false;
        }
        return (c*c>n);
        
    }
    
}
