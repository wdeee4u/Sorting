import java.util.*;

public class Sorting
{
   public static int[] bubbleSort(int[] arr, int size)
    {
        for(int i = 0; i < size - 1; i++)
        {
            for(int j = 0; j < size - i - 1; j++)
            {
                if(arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter array: ");
        for(int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        bubbleSort(arr, size);
        for(int i = 0; i < size; i++)
        {
            System.out.print(arr[i] + ", ");
        }
    }
}
