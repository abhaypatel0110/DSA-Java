package ArrayQuestions;
import java.util.Scanner;
import java.util.Arrays;

//In this we will initially have a array which have numbers till n element and we have to store odd and even in separate arrays
public class OddEven {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number limit");
        int limit = input.nextInt();
        int[] arr = new int[limit];
        //using a loop to initialize the array
        for(int i=0;i<limit;i++)
        {
            arr[i] = i+1;
        }
        
        //passing the array to method to separate and print it.
        oddEvene(arr);
        input.close(); 
    }

    public static void oddEvene(int[] arr)
    {
        int oddLength;
        int evenLength;
        if(arr.length%2==0)
        {
            oddLength = arr.length/2;
            evenLength = arr.length/2;
        }
        else
        {
            oddLength = (arr.length/2)+1;
            evenLength = (arr.length/2)-1;
        }
        int[] odd = new int[oddLength];
        int[] even = new int[evenLength];
        int oddi=0,eveni=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                even[eveni] = arr[i];
                eveni++;
            }
            else
            {
                odd[oddi] = arr[i];
                oddi++;
            }
        }
        System.out.println("Even array is:"+Arrays.toString(even));
        System.out.println("Odd array is:"+Arrays.toString(odd));
    }
    
}
