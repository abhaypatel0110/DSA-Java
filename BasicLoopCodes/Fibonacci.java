package BasicLoopCodes;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the limit upto which we have to generate it");
        int limit = input.nextInt();
        int num1 = 0;
        int num2 = 1;
        System.out.print(num1+" "+num2+" ");
        for(int i=2;i<limit;i++)
        {
            int temp = num2;
            num2 += num1;
            num1 = temp;
            System.out.print(num2+" ");
        }
        input.close();
    }
}
