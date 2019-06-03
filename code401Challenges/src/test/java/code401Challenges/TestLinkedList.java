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

    //test challenge 6 insertion methods
    @Test
    public void testAppend_oneValue(){
        LinkedList ls = new LinkedList();
        ls.append(5);
        String actualOutput = LinkedList.Node.printLinkeList(ls);
        String expectedOutput = "List contents: 5 ";
        assertEquals("append should add a value to the end of the list. ", expectedOutput, actualOutput);
    }

    @Test
    public void testAppend_multipleValues(){
        LinkedList ls = new LinkedList();
        ls.append(5);
        ls.append('C');
        ls.append(true);
        ls.append(10);
        ls.append("End");
        String actualOutput = LinkedList.Node.printLinkeList(ls);
        String expectedOutput = "List contents: 5 C true 10 End ";
        assertEquals("append should add a value to the end of the list. ", expectedOutput, actualOutput);
    }

    @Test
    public void testInsertBefore(){
        LinkedList ls = new LinkedList();
        ls.insertBefore(5,4);
        ls.insertBefore(4, 3);
        ls.insertBefore(3, 2);
        ls.insertBefore(2, 1);

        String actualOutput = LinkedList.Node.printLinkeList(ls);
        String expectedOutput = "List contents: 1 2 3 4 ";
        assertEquals("insertBefore should add a value before the designate value. In case the value doesn't exist, the new value is added at head. ", expectedOutput, actualOutput);
    }

    @Test
    public void testInsertAfter(){
        LinkedList ls = new LinkedList();
        ls.insertAfter(0,1);
        ls.insertAfter(1, 2);
        ls.insertAfter(2, 3);
        ls.insertAfter(3, 4);

        String actualOutput = LinkedList.Node.printLinkeList(ls);
        String expectedOutput = "List contents: 1 2 3 4 ";
        assertEquals("insertBefore should add a value before the designate value. In case the value doesn't exist, the new value is added at head. ", expectedOutput, actualOutput);
    }

}
