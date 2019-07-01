package code401Challenges.insertionSort;

public class InsertionSort {

    public int[] insertionSortMethod(int[] inputArr) {
        if(inputArr.length < 1) {
            throw new IllegalStateException("Cannot sort an empty array!");
        }

        else if(inputArr.length == 1) {
            return inputArr;
        }

        else {

            for (int i = 1; i < inputArr.length; i++) {

                int j = i - 1;
                int temp = inputArr[i];

                while(j >= 0 && temp < inputArr[j]) {
                    inputArr[j + 1] = inputArr[j];
                    j = j - 1;
                }

                inputArr[j + 1] = temp;
            }

            return inputArr;

        }
    }
}
