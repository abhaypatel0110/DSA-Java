package BasicLoopCodes;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to check for armstrong");
        int number = input.nextInt();
        int numberLength = String.valueOf(Math.abs(number)).length();
        int reminder,checkNumber = 0;
        int number1=number;
        while(number1>0)
        {
            reminder = number1 % 10;
            checkNumber = (int)Math.pow(reminder, numberLength) + checkNumber;
            number1 = number1/10; 
        }
        
        if(checkNumber==number)
        {
            System.out.println("Given number "+number+" is armstrong number");
        }
        else{
            System.out.println("Given number "+number+" is not a armstrong number");
        }
        input.close();
    }
}
