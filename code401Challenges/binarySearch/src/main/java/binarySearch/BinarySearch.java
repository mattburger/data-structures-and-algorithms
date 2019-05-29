/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package binarySearch;

public class BinarySearch {
    public int binarySearch(int[] arrInput, int searchKey){
        int left = 0;
        int right = arrInput.length - 1;
        int mid;
        while(left <= right){
            mid = (left + right) / 2;
            if(arrInput[mid] < searchKey) {
                left = mid + 1;
            } else if(arrInput[mid] > searchKey) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public int[] generatArr(int n){
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = i;
        }

        return arr;
    }
}
