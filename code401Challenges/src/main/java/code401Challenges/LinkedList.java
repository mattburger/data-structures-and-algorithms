package code401Challenges;

public class LinkedList {
    Node head = null;
//    Node tail;

    //code challenge 6 additions
    //add node to end of list
    protected void append(Object data){
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
    protected void insertBefore(Object value, Object newValue){
        if(this.head == null){
            this.head = new Node(newValue);
            this.head.next = null;
        }
        else{
            Node newNode = new Node(newValue);
            Node findVal = this.head;
            while( (findVal.next != null) && (findVal.next.data != value) ){
                findVal = findVal.next;
            }
            if( findVal.next != null ){
                if(findVal.next.data == value) {
                    Node tmp = findVal;
                    findVal = newNode;
                    findVal.next = tmp;
                }

            }
            else{
                Node tmp = this.head;
                this.head = newNode;
                this.head.next = tmp;
            }
        }
    }

    //insertAfter
    protected void insertAfter(Object value, Object newValue){
        if(this.head == null){
            this.head = new Node(newValue);
            this.head.next = null;
        }
        else{
            Node newNode = new Node(newValue);
            Node findVal = this.head;
            while( (findVal.data != value) && (findVal.next != null) ){
                findVal = findVal.next;
            }
            if(findVal.data == value){
                Node tmp = findVal.next;
                findVal.next = newNode;
                findVal.next.next = tmp;

            }
            else{
                findVal.next = newNode;
            }
        }
    }

    static class Node{
        Object data;//data held within the node
        Node next; // reference to next node or null
//        Node prev;

        //constructor
        Node(Object data){
            this.data = data;
            this.next = null;
        }

        //insert value at start of list
        public static LinkedList insertAtHead(LinkedList list, Object data){
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
        public static String printLinkeList(LinkedList list){
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
        public static boolean linkedListIncludes(LinkedList list, Object value){
            Node currentNode = list.head;
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
}
