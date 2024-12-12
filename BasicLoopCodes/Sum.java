package BasicLoopCodes;
import java.util.Scanner;

//Summing up the numbers between two given limit
public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the lower limit");
        int lowerLimit = input.nextInt();
        System.out.println("Enter the upper limit");

        int upperLimit = input.nextInt();
        int sum =0;
        for(int i=lowerLimit;i<=upperLimit;i++)
        {
            sum += i;
        }
        System.out.println("Some of numbers between given limit is : "+sum);
        input.close();
    }
    
}
