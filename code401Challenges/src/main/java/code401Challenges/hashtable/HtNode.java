package code401Challenges.hashtable;

import code401Challenges.stackandqueues.Node;

public class HtNode<T> extends Node {
    String key;

    public HtNode(String key, T data) {
        super(data);
        this.key = key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setNext(HtNode htNode) {
        this.next = htNode;
    }
    public Boolean hasNext() {
        if(this.next == null) {
            return false;
        } else {
            return true;
        }
    }

    public HtNode getNext() {
        return (HtNode) this.next;
    }

}
