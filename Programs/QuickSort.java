import java.util.Arrays;

class QuickSort{

    static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low, j = high;
        while(i < j){
            while(arr[i] <= pivot && i < high){
                i++;
            }
            while(arr[j] >= pivot && j > low){
                j--;
            }
            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }

    static void quickSort(int[] arr, int low, int high){
        if(low < high){
            int p = partition(arr, low, high);
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }

    public static void main(String[] args){
        int[] arr = {5, 3, 8, 2, 1, 6, 9, 10};
        int low = 0, high = arr.length - 1;

        quickSort(arr, low, high);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}