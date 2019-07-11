package code401Challenges.tree;

import code401Challenges.quicksort.QuickSort;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TreeIntersection {
    private BinaryTree bTree1;
    private BinaryTree bTree2;

    public TreeIntersection(){}

    public TreeIntersection(BinaryTree t1, BinaryTree t2) {
        this.bTree1 = t1;
        this.bTree2 = t2;
    }

    public int[] convertToIntArr(Object[] input) {

        if(input.length < 1) {
            return new int[0];
        }

        //convert Object array to Integer array first. Objects cannot be cast to int
        Integer[] fromObjArr = Arrays.stream(input)
                .map(Object::toString)
                .map(Integer::valueOf)
                .toArray(Integer[]::new);

        int[] output = new int[fromObjArr.length];

        for(int i = 0; i < output.length; i++) {
            output[i] = fromObjArr[i].intValue();
        }

        return output;
    }

    public int[] sort(int[] input) {
        if(input.length < 2) {
            return input;
        }
        int[] output = new int[input.length];

        QuickSort q1 = new QuickSort(input);
        q1.quickSortUtilityMethod();
        output = q1.getQuickSortArr();

        return output;
    }

    public Set<Integer> findTreeIntersection() {

        if(this.bTree1.root == null || this.bTree2.root == null) {
            throw new IllegalArgumentException("Cannot find the intersection of an empty tree");
        }

        int[] fromBTree = convertToIntArr(this.bTree1.inOrderTraversal());
        int[] fromBTree2 = convertToIntArr(this.bTree2.inOrderTraversal());

        fromBTree = sort(fromBTree);
        fromBTree2 = sort(fromBTree2);

        int bTreeLength = fromBTree.length;
        int bTreeLength2 = fromBTree2.length;
        int i = 0;
        int j = 0;

        Set<Integer> intersections = new HashSet<>();

        while(i < bTreeLength  && j < bTreeLength2 ) {
            if(fromBTree[i] < fromBTree2[j]) {
                i++;
            } else if(fromBTree2[j] < fromBTree[i]) {
                j++;
            } else {
                intersections.add(fromBTree[i++]);
                j++;
            }
        }
        return intersections;
    }

    //getters and setters
    public BinaryTree getbTree1() {
        return this.bTree1;
    }

    public BinaryTree getbTree2() {
        return this.bTree2;
    }

    public void setbTree1(BinaryTree t1) {
        this.bTree1 = t1;
    }

    public void setbTree2(BinaryTree t2) {
        this.bTree2 = t2;
    }
}
