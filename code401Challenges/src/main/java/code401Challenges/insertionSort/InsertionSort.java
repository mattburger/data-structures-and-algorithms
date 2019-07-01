package code401Challenges.insertionSort;

public class InsertionSort {

    int[] arrToSort;

    public InsertionSort(int[] inputArr) {
        this.arrToSort = inputArr;
    }
    public int[] insertionSortMethod() {
        if(this.arrToSort.length < 1) {
            throw new IllegalStateException("Cannot sort an empty array!");
        }

        else if(this.arrToSort.length == 1) {
            return this.arrToSort;
        }

        else {

            for (int i = 1; i < this.arrToSort.length; i++) {

                int j = i - 1;
                int temp = this.arrToSort[i];

                while(j >= 0 && temp < this.arrToSort[j]) {
                    this.arrToSort[j + 1] = this.arrToSort[j];
                    j = j - 1;
                }

                this.arrToSort[j + 1] = temp;
            }

            return this.arrToSort;

        }
    }
}
