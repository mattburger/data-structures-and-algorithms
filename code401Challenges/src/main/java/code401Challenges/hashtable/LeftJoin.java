package code401Challenges.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeftJoin {

    HashMap<String, String> left;
    HashMap<String, String > right;
    HashMap<String, List<String> > result;

    public LeftJoin(){};

    public LeftJoin(HashMap<String, String > left, HashMap<String, String> right) {
        this.left = left;
        this.right = right;
        this.result = new HashMap<>();
    }

    public HashMap<String, List<String> > leftJoin() {
        if(this.left == null|| this.right == null) {
            throw new IllegalArgumentException("Cannot peform join on null");
        }

        this.left.forEach((k, v) -> {
            List<String> lst = new ArrayList<>();
            lst.add(k);
            lst.add(v);
            this.result.put(k, lst);
        });

        this.result.forEach((k, v) -> {
            if(this.right.get(k) == null) {
                List<String> tmpList = new ArrayList<>();
                tmpList = this.result.get(k);
                this.result.put(k, tmpList);
            }

            List<String> tmpList = new ArrayList<>();
            tmpList = this.result.get(k);
            tmpList.add(this.right.get(k) );
            this.result.put(k, tmpList);
        });

        return this.result;
    }

    public HashMap<String, String> getLeft() {
        return this.left;
    }

    public void setLeft(HashMap<String, String> left) {
        this.left = left;
    }

    public HashMap<String, String> getRight() {
        return this.right;
    }

    public void setRight(HashMap<String, String> right) {
        this.right = right;
    }
}
