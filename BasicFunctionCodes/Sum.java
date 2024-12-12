package BasicFunctionCodes;
import java.util.Scanner;
//in this we will sum up numbers between given limits without using for loop
public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the lower limit :");
        int lowerLimit = input.nextInt();
        System.out.println("Enter the upper limit :");
        int upperLimit = input.nextInt();
        sum(lowerLimit,upperLimit);
        input.close();
    }

    public static void sum(int a, int b)
    {
        int sum = ((b-a+1)*(b+a))/2;
        System.out.println("Sum of numbers between given limit is :" + sum);
    }

}
