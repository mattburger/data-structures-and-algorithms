package code401Challenges.LinkedList;

import code401Challenges.stackandqueues.Node;

import static java.lang.Math.abs;

public class LinkedList<T> {
    public Node head = null;
//    Node tail;

    //code challenge 6 additions
    //add node to end of list
    public void append(T data){
        Node newNode = new Node(data);
        newNode.next = null;
        Node lastNode;

        //if head is null, make head the new value
        if(this.head == null){
            this.head = newNode;

        }
        //move old head to the right and insert new head
        else{
            lastNode = this.head;
            while(lastNode.next != null ){
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
    }

    //insertBefore
    public void insertBefore(T value, T newValue){
        if(this.head == null){
            this.head = new Node(newValue);
            this.head.next = null;
        }
        else{
            Node newNode = new Node(newValue);
            Node findVal = this.head;
            try {
                while ( /*(findVal.next != null) && */(findVal.next.data != value)) {
                    findVal = findVal.next;
                }
                //if( findVal.next != null ){
                if (findVal.next.data == value) {
                    Node tmp = findVal.next;
                    findVal.next = newNode;
                    findVal.next.next = tmp;
                }
            }
            catch (NullPointerException err){
                throw new IllegalArgumentException("Bad target value");
            }
        }
    }

    //insertAfter
    public void insertAfter(T value, T newValue){
        if(this.head == null){
            this.head = new Node(newValue);
            this.head.next = null;
        }
        else{
            Node newNode = new Node(newValue);
            Node findVal = this.head;
            try {
                while ((findVal.data != value)/* && (findVal.next != null) */) {
                    findVal = findVal.next;
                }
                if (findVal.data == value) {
                    Node tmp = findVal.next;
                    findVal.next = newNode;
                    findVal.next.next = tmp;

                }
            }
            catch(NullPointerException err){
                throw new IllegalArgumentException("Bad target value");
            }
        }
    }

    //kth from end method challenge 7
    public T getKthFromEnd(int k) {
        if (this.head == null) {
            throw new IllegalStateException("can't find kth node of an empty linked list!");
        } else {
            Node ref = this.head;
            Node main = this.head;
            int count = 0;
            int length = 0;
            k = abs(k); //absolute value of k

            while (ref.next != null) {
                if (count == k) {
                    ref = ref.next;
                    main = main.next;
                    length++;
                } else {
                    ref = ref.next;
                    count++;
                    length++;
                }

            }
            if ((count + 1 < k) || (length + 1 < k)) {
                throw new IllegalArgumentException("k must be withing the bounds of the list.");
            }

            return (T)main.data;
        }
    }

    public Node mergeLists(LinkedList ls1, LinkedList ls2){
        if ( (ls1 == null) && (ls2 == null) ) {
            ls1.head = new Node(1);
            return ls1.head;
        } else if (ls1 == null) {
            return ls2.head;
        } else if (ls2 == null) {
            return ls1.head;
        }else {
            Node ptr1 = ls1.head;
            Node ptr2 = ls2.head;

            while ( (ptr1 != null) && (ptr2 != null) ) {
                Node tmp = ptr1.next;
                ptr1.next = ptr2;
                ptr1 = ptr1.next;
                ptr2 = tmp;

            }
            if ( (ptr1 == null) && (ptr2 == null) ){
//                ls3.head = ls1.head;
                return ls1.head;
            } else if (ptr1 == null) {
                ptr1 = ptr2;
//                ls3.head = ls1.head;
            } else {
                ptr2 = ptr1;
//                ls3.head = ls1.head;
            }

            return ls1.head;
        }
    }



    //insert value at start of list
    public LinkedList insertAtHead(LinkedList list, T data){
        Node newNode = new Node(data);
        newNode.next = null;

        //if head is null, make head the new value
        if(list.head == null){
            list.head = newNode;

        }
        //move old head to the right and insert new head
        else{
            Node tmp = list.head; //temporary holder
            newNode.next = list.head;
            list.head = newNode;
        }

        return list;
    }

    //print LinkedList
    public String printLinkeList(LinkedList list){
        Node currentNode = list.head;
        String output = "List contents: ";

        //if head is null than return a message stating there is no data to print
        if(currentNode == null){
            return "Linked List has no data.";
        }
        //traverse list and add each node's data to output
        else{
            while(currentNode != null){
                output = output + currentNode.data + " ";
                currentNode = currentNode.next;
            }

            return output;
        }
    }

    //indicate if value exists in list
    public boolean linkedListIncludes(T value){
        Node currentNode = this.head;
        if(currentNode == null){
            return false;
        }
        else{
            while( (currentNode.next != null) && (currentNode.data != value) ){
                currentNode = currentNode.next;
            }
            if(currentNode.data == value){
                return true;
            }
            else{
                return false;
            }
        }
    }
}
