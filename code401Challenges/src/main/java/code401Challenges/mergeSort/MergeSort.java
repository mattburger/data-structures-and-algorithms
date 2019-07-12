package code401Challenges.mergeSort;

public class MergeSort {
    int[] mergeSortArr;

    public MergeSort(int[] in) {
        this.mergeSortArr = in;
    }


    public void sort(int[] inputArr, int len) {
        
        if(len < 1 || inputArr == null) {
            throw new IllegalArgumentException("Cannot sort an empty or null array");
        }
        if(len < 2) {
            return;
        }

        int mid = len / 2;
        int[] firstHalf = new int[mid];
        int[] secondHalf = new int[len - mid];

        for (int i = 0; i < mid; i++) {
            firstHalf[i] = inputArr[i];
        }
        for (int i = mid; i < len; i++) {
            secondHalf[i - mid] = inputArr[i];
        }

        sort(firstHalf, mid);
        sort(secondHalf, len - mid);
        merge(inputArr, firstHalf, secondHalf, mid, len - mid);
    }

    private void merge(int[] arr, int[] firstHalf, int[] secondHalf, int firstLen, int secLen) {
        int i = 0, j = 0, k = 0;

        while (i < firstLen && j < secLen) {
            if (firstHalf[i] <= secondHalf[j]) {
                arr[k++] = firstHalf[i++];
            } else {
                arr[k++] = secondHalf[j++];
            }
        }

        while (i < firstLen) {
            arr[k++] = firstHalf[i++];
        }

        while (j < secLen) {
            arr[k++] = secondHalf[j++];
        }
    }

    public int[] mergeSortUtility() {
        sort(this.mergeSortArr, this.mergeSortArr.length);

        return this.mergeSortArr;
    }
}