package BasicLoopCodes;
import java.util.Scanner;
//In this we will print table of given number
public class Table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of which you want table : ");
        int number = input.nextInt();

        for(int i=1;i<=10;i++)
        {
            System.out.println(number +" * "+ i +" = " +number*i);
        }
        input.close();
    }
}
