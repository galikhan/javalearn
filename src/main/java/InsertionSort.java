/**
 * Created by gali on 8/17/17.
 */
public class InsertionSort {

    //normal insertion sort
    public int [] sort(int [] arr) {

        int n = arr.length;
        //5 4 3 2 1
        for (int i = 1; i < n ; i++) {
            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > key) {

                arr[j+1] = arr[j];

                j = j - 1;
            }


            arr[j+1] = key;
        }
        return arr;
    }

    public void printArr(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public void printArr(String [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
    }

    //sort array of string numbers
    public String [] sort(String [] arr) {

        int n = arr.length;
        //5 4 3 2 1
        for (int i = 1; i < n ; i++) {
            String key = arr[i];
            int j = i - 1;
            boolean proceed = true;

            while(j >= 0 && proceed) {

                proceed = false;
                if(arr[j].length() > key.length()) {
                    proceed = true;
                } else if(arr[j].length() == key.length()) {
                    if(firstStringBigger(arr[j], key)) {
                        proceed = true;
                    }
                }

                if(proceed) {
                    arr[j+1] = arr[j];
                    j = j - 1;
                }
            }


            arr[j+1] = key;
        }
        return arr;
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
