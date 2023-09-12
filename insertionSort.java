import java.util.*;

public class Sorting
{
    public static int[] insertionSort(int[] arr, int size)
    {
        for (int i = 1; i < size; ++i)
        {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key)
            {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
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

        insertionSort(arr, size);

        for(int i = 0; i < size; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
