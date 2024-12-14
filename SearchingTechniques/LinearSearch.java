package SearchingTechniques;
import java.util.Scanner;
//In this we will use linear search to find an target element using linear search
/*
 * Liner search have time complexity as Worst case = O(N) and best case = O(1)
 * In linear search we find target element by iterating element by element util we find the element or we traversed through whole array/dataset
 */
public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the element which you want to find :");
        int target = input.nextInt();
        int arr[] = {1,2,7,9,3,6,4,55,89,70,500};

        int result[] = finder(arr,target);
        if(result[1]==-1)
        {
            System.out.println(String.format("Given target %d element is not present in the array",result[0]));
        }
        else
        {
            System.out.println(String.format("Given target %d is present at index %d",result[0],result[1]));
        }
        input.close();
    }

    public static int[] finder(int[] arr,int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(target==arr[i])
            {
              int[] result ={target,i};
                return result;
            }
        }
        int[] result = {target,-1};
        return result;
    }
}
