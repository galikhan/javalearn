/**
 * Created by gali on 8/18/17.
 */
public class QuickSort {

//    put this in main
//    QuickSort qs = new QuickSort();
//    int [] a = {111, 10, 80, 30, 40, 50,  90, 40, 50, 70};
//    qs.sort(a, 0,a.length);
//    qs.print(a);


    public void sort(int[] arr, int low, int high) {

        //check if low index is not smaller than high then stop recursion partition
        if (low < high) {

            //sort array and get index of pivot
            int pivotIndex = sortPartition(arr, low, high);
            print(arr);
            System.out.println();

            //get part of array before pivot
            sort(arr, low, pivotIndex);
            //get part of array after pivot
            sort(arr, pivotIndex+1, high);
        }
    }


    public int sortPartition(int[] arr, int low, int high) {

        //i starts from -1 because low = 0
        int i = low - 1;

        //we took pivot as latest element in array
        int pivot = arr[high - 1];
//        System.out.println("pivot - "+pivot);

        for (int j = low; j < high; j++) {

            //check if element is less than pivot then swap with arr[i+1] element
            //i is index of elements that are bigger than pivot
            if (arr[j] <= pivot) {
                i = i + 1;

                //swap
                int ii = arr[i];
                arr[i] = arr[j];
                arr[j] = ii;
            }

        }
        return i;
    }

    public void print(int arr []) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }


    public boolean firstStringBigger(String j, String key) {
        int strLen =j.length();
        for (int i = 0; i < strLen; i++) {
            int val1 = j.codePointAt(i);
            int val2 = key.codePointAt(i);
            if(val1 > val2) {
                return true;
            } else if(val2 > val1) {
                return false;
            }
        }
        return false;
    }

}
