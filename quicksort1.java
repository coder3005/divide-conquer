//pivot point at starting
package Recursion;

public class numbers {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void quickSort(int arr[], int low, int high) {
        int pivot;
        //termination condition!
        if(high>low) {
            pivot=Partition(arr,low,high);
            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,high);
        }
    }
    private static int Partition(int arr[], int low, int high) {
        int left, right, pivot_item=arr[low];
        left=low;
        right=high;
        while(left<right) {
            //move left while item<pivot
            while(arr[left]<=pivot_item) {
                left++;
            }
            //move right while item>pivot
            while(arr[right]>pivot_item) {
                right--;
            }
            if(left<right) {
                swap(arr,left,right);
            }
        }
        //right is final position for the pivot
        arr[low]=arr[right];
        arr[right]=pivot_item;
        return right;
    }
    private static void swap(int arr[], int left, int right) {
            int temp=0;
            temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
        } 
    public static void main(String[] args) {
        int arr[] = {50,25,92,16,76,30,43,54,19};
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
