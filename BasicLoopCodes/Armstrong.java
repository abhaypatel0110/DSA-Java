package BasicLoopCodes;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to check for armstrong");
        int number = input.nextInt();
        int numberLength = String.valueOf(Math.abs(number)).length();
        System.out.print(numberLength+"is the ength of number");
        int reminder,checkNumber = 0;
        int number1=number;
        while(number1>0)
        {
            reminder = number1 % 10;
            System.out.println("reminder is"+reminder);
            checkNumber = (int)Math.pow(reminder, numberLength) + checkNumber;
            number1 = number1/10; 
        }
        System.out.println(checkNumber);
        if(checkNumber==number)
        {
            System.out.println("Given number "+number+" is g number");
        }
        else{
            System.out.println("Given number "+number+" is not a armstrong number");
        }
        input.close();
    }
}
