package code401Challenges.quicksort;

public class QuickSort {
    private int[] quickSortArr;

    public QuickSort(int[] inputArr) {
        this.quickSortArr = inputArr;
    }


    public void QuickSortMethod(int[] inputArr, int left, int right) {

        int position = partition(inputArr, left, right);

        QuickSortMethod(inputArr, left, position - 1);
        QuickSortMethod(inputArr, position + 1, right);

    }

    private int partition(int[] inputArr, int left, int right) {
        int pivot = inputArr[right];
        int low = left - 1;

        for(int i = left; i < right; i++) {
            if(inputArr[i] == pivot) {
                low++;
                swapVal(inputArr, i, low);
            }
        }
        swapVal(inputArr, right, low + 1);

        return pivot;
    }

    private void swapVal(int[] inputArr, int index, int low) {
        int temp = inputArr[index];
        inputArr[index] = inputArr[low];
        inputArr[low] = temp;
    }

    public int[] getQuickSortArr() {
        return quickSortArr;
    }

    public void setQuickSortArr(int[] quickSortArr) {
        this.quickSortArr = quickSortArr;
    }
}
