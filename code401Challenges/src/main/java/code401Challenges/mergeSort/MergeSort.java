package code401Challenges.mergeSort;

public class MergeSort {
    int[] mergeSortArr;

    public MergeSort(int[] in) {
        this.mergeSortArr = in;
    }


    public int[] mergeSortMethod(int[] inputArr) {
        int len = inputArr.length;
        int[] outputArr = new int[len];

        if (len > 1) {
            int mid = len / 2;
            int[] firstHalf = new int[mid];
            int[] secondHalf = new int[len - mid];

            for (int i = 0; i < mid; i++) {
                firstHalf[i] = inputArr[i];
            }
            for (int i = mid; i < len; i++) {
                secondHalf[i - mid] = inputArr[i];
            }

            mergeSortMethod(firstHalf);
            mergeSortMethod(secondHalf);
            merge(firstHalf, secondHalf, outputArr);
        }
        return outputArr;
    }

    private void merge(int[] firstHalf, int[] secondHalf, int[] newSortedArr) {
        int i = 0, j = 0, k = 0;

        while (i < firstHalf.length && j < secondHalf.length) {
            if (firstHalf[i] <= secondHalf[j]) {
                newSortedArr[k] = firstHalf[i];
                i = i + 1;
            } else {
                newSortedArr[k] = secondHalf[j];
                j = j + 1;
            }

            k = k + 1;
        }

        if (i == firstHalf.length) {
            while (j < secondHalf.length) {
                newSortedArr[k] = secondHalf[j];

                j = j + 1;
                k = k + 1;
            }
        } else {
            while (i < firstHalf.length) {
                newSortedArr[k] = firstHalf[i];

                i = i + 1;
                k = k + 1;
            }
        }

        //return newSortedArr;
    }

    public int[] mergeUtility() {
        this.mergeSortArr = mergeSortMethod(this.mergeSortArr);

        for(int i = 0; i < this.mergeSortArr.length; i++) {
            System.out.println(this.mergeSortArr[i]);
        }
        return this.mergeSortArr;
    }
}