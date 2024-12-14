package SearchingTechniques;
import java.util.Scanner;
//Ceiling of a number means a target number or nearest greatest number of a number in array
public class CeilingOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the target number to search in array :");
        int target = input.nextInt();
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,16,18,19,20,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,45,47,50};
        ceiling(arr,target);
        input.close();
    }
    public static void ceiling(int[] arr,int target)
    {
        boolean ascending = arr[0]<arr[arr.length-1];
        int start=0;
        int end = arr.length-1;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(arr[mid]==target)
            {
                System.out.println("Target found");
                return;
            }
            if(ascending)
            {
                if(target>arr[mid])
                {
                    start = mid+1;
                }
                else
                {
                    end = mid-1;
                }
            }
            else
            {
                if(target<arr[mid])
                {
                    start = mid+1;
                }
                else
                {
                    end = mid-1;
                }
            }
            if(end<start)
            {
                System.out.println("Ceiling of number is :"+arr[start]);
            }
        }
    }
}
