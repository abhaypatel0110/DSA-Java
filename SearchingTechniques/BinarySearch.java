package SearchingTechniques;
import java.util.Scanner;
//In this we will use binary sort to search element in array
public class BinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the element to find in array");
        int target = input.nextInt();
        int[] arr = {1,5,10,15,18,20,55,70,80,90,100,120,140,160,180,190,195,200,201,205,208,210,220,240,250,260,270,290,300,305,310};

        binary(arr,target);
        input.close();
    }

    public static void binary(int[] arr,int target)
    {
        int start = 0;
        int end = arr.length-1;
        int i=0;
        boolean order = arr[0]<arr[arr.length-1];
        while(start<=end)
        {
            i++;
            int mid = start+(end-start)/2;
            if(target==arr[mid])
            {
                System.out.println("loop "+i);
                System.out.println(String.format("Target element %d is present at index %d",target,mid));
                return;
            }
            if(order)
            {
                if(target<arr[mid])
                {
                    end = mid-1;
                }
                else if(target>arr[mid])
                {
                    start = mid+1;
                                }
            }
            else
            {
                if(target<arr[mid])
                {
                    end = mid-1;
                                }
                else if(target>arr[mid])
                {
                    start = mid+1;                }
            }
        }
    }
    
}
