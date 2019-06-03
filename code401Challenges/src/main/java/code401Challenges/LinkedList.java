package code401Challenges;

public class LinkedList {
    Node head = null;
//    Node tail;

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
                System.out.println("No data");
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
