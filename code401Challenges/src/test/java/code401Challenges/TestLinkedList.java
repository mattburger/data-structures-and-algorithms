package code401Challenges;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestLinkedList {
    //testing for insertion method-----------------------------------
    @Test
    public void testLinkedListInsertion(){
        LinkedList ls = new LinkedList();
        ls = LinkedList.Node.insertAtHead(ls, 3);
        ls = LinkedList.Node.insertAtHead(ls, 2);
        ls = LinkedList.Node.insertAtHead(ls, 1);

        assertNotNull("insertAtStart should return the list with the new node added at the start. ");

    }

    //testing for print method---------------------------------------
    @Test
    public void testLinkedListPrint_nodesPresent(){
        LinkedList ls = new LinkedList();
        ls = LinkedList.Node.insertAtHead(ls, 3);
        ls = LinkedList.Node.insertAtHead(ls, 2);
        ls = LinkedList.Node.insertAtHead(ls, 1);
        String expectedOutput = "List contents: 1 2 3 ";

        assertEquals("printLinkedList should return contents of the linked list, or a message stating there is not data. ", expectedOutput, LinkedList.Node.printLinkeList(ls));
    }

    @Test
    public void testLinkedListPrint_differentTypes(){
        Integer[] testArr = {1, 2, 3};
        LinkedList ls = new LinkedList();
        ls = LinkedList.Node.insertAtHead(ls, 3);
        ls = LinkedList.Node.insertAtHead(ls, '2');
        ls = LinkedList.Node.insertAtHead(ls, true);
        String testOuput = LinkedList.Node.printLinkeList(ls);
        System.out.println("testOuput: " + testOuput);
        String expectedOutput = "List contents: true 2 3 ";

        assertEquals("printLinkedList should return contents of the linked list, or a message stating there is not data. ", expectedOutput, LinkedList.Node.printLinkeList(ls));
    }

    @Test
    public void testLinkedListPrint_noNodesPresent(){
        LinkedList ls = new LinkedList();
        String expectedOutput = "Linked List has no data.";
        assertEquals("printLinkedList should return contents of the linked list, or a message stating there is not data. ", expectedOutput, LinkedList.Node.printLinkeList(ls));
    }

    //testing for includes method-------------------------------------
    @Test
    public void testLinkedListIncludes_valuePresent(){
        LinkedList ls = new LinkedList();
        ls = LinkedList.Node.insertAtHead(ls, 3);
        ls = LinkedList.Node.insertAtHead(ls, 2);
        ls = LinkedList.Node.insertAtHead(ls, 1);
        boolean testedOutput = LinkedList.Node.linkedListIncludes(ls, 3);
        assertTrue("linkedListIncludes should return true or false. ", testedOutput);
    }

    @Test
    public void testLinkedListIncludes_valueNotPresent() {
        LinkedList ls = new LinkedList();
        ls = LinkedList.Node.insertAtHead(ls, 3);
        ls = LinkedList.Node.insertAtHead(ls, 2);
        ls = LinkedList.Node.insertAtHead(ls, 1);
        boolean testedOutput = LinkedList.Node.linkedListIncludes(ls, 7);
        assertFalse("linkedListIncludes should return true or false. ", testedOutput);
    }

    @Test
    public void testLinkedListIncludes_noNodesPresent(){
        LinkedList ls = new LinkedList();
        boolean testedOutput = LinkedList.Node.linkedListIncludes(ls, 3);
        assertFalse("linkedListIncludes should return true or false. ", testedOutput);
    }
}
