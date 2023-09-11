import java.util.*;

public class Sorting
{
  public static int[] selectionSort(int[] arr, int size)
    {
        for(int i = 0; i < size - 1; i++)
        {
            int smallest = i;
            for(int j = i + 1; j < size; j++)
            {
                if(arr[smallest] > arr[j])
                {
                    smallest = j;
                }
            }

            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
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

        selectionSort(arr, size);
        for(int i = 0; i < size; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
