package code401Challenges.LinkedList;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestLinkedList {

    //helper function to create Linked Lists
    LinkedList createLinkedList(int n){
        LinkedList ll = new LinkedList();

        for(int i = 0; i < n; i++){
            ll.append(i + 1);
        }
        return ll;
    }

    //testing for insertion method-----------------------------------
    @Test
    public void testLinkedListInsertion(){
        LinkedList ls = new LinkedList();
        ls.insertAtHead(ls, 3);
        ls.insertAtHead(ls, 2);
        ls.insertAtHead(ls, 1);

        assertNotNull("insertAtStart should return the list with the new node added at the start. ");

    }

    //testing for print method---------------------------------------
    @Test
    public void testLinkedListPrint_nodesPresent(){
        LinkedList ls = new LinkedList();
        ls.insertAtHead(ls, 3);
        ls.insertAtHead(ls, 2);
        ls.insertAtHead(ls, 1);
        String expectedOutput = "List contents: 1 2 3 ";

        assertEquals("printLinkedList should return contents of the linked list, or a message stating there is not data. ", expectedOutput, ls.printLinkeList(ls));
    }

    @Test
    public void testLinkedListPrint_differentTypes(){
        Integer[] testArr = {1, 2, 3};
        LinkedList ls = new LinkedList();
        ls.insertAtHead(ls, 3);
        ls.insertAtHead(ls, '2');
        ls.insertAtHead(ls, true);
        String expectedOutput = "List contents: true 2 3 ";

        assertEquals("printLinkedList should return contents of the linked list, or a message stating there is not data. ", expectedOutput, ls.printLinkeList(ls));
    }

    @Test
    public void testLinkedListPrint_noNodesPresent(){
        LinkedList ls = new LinkedList();
        String expectedOutput = "Linked List has no data.";
        assertEquals("printLinkedList should return contents of the linked list, or a message stating there is not data. ", expectedOutput, ls.printLinkeList(ls));
    }

    //testing for includes method-------------------------------------
    @Test
    public void testLinkedListIncludes_valuePresent(){
        LinkedList ls = new LinkedList();
        ls.insertAtHead(ls, 3);
        ls.insertAtHead(ls, 2);
        ls.insertAtHead(ls, 1);
        boolean testedOutput = ls.linkedListIncludes(3);
        assertTrue("linkedListIncludes should return true or false. ", testedOutput);
    }

    @Test
    public void testLinkedListIncludes_valueNotPresent() {
        LinkedList ls = new LinkedList();
        ls.insertAtHead(ls, 3);
        ls.insertAtHead(ls, 2);
        ls.insertAtHead(ls, 1);
        boolean testedOutput = ls.linkedListIncludes( 7);
        assertFalse("linkedListIncludes should return true or false. ", testedOutput);
    }

    @Test
    public void testLinkedListIncludes_noNodesPresent(){
        LinkedList ls = new LinkedList();
        boolean testedOutput = ls.linkedListIncludes(3);
        assertFalse("linkedListIncludes should return true or false. ", testedOutput);
    }

    //test challenge 6 insertion methods
    @Test
    public void testAppend_oneValue(){
        LinkedList ls = new LinkedList();
        ls.append(5);
        String actualOutput = ls.printLinkeList(ls);
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
        String actualOutput = ls.printLinkeList(ls);
        String expectedOutput = "List contents: 5 C true 10 End ";
        assertEquals("append should add a value to the end of the list. ", expectedOutput, actualOutput);
    }

    @Test
    public void testInsertBefore(){
        LinkedList ls = new LinkedList();
        ls.append(1);
        ls.append(2);
        ls.append(4);
        ls.insertBefore(4,3);

        String actualOutput = ls.printLinkeList(ls);
        String expectedOutput = "List contents: 1 2 3 4 ";
        assertEquals("insertBefore should add a value before the designate value. ", expectedOutput, actualOutput);
    }

    @Test
    public void testInsertBefore_multipleTargetValues(){
        LinkedList ls = new LinkedList();
        ls.append(1);
        ls.append(2);
        ls.append(5);
        ls.append(5);
        ls.append(5);
        ls.insertBefore(5,4);

        String actualOutput = ls.printLinkeList(ls);
        String expectedOutput = "List contents: 1 2 4 5 5 5 ";
        assertEquals("insertBefore should add a value before the designated value. If there are multiple target values, insert will happen before the 1st occurrence. ", expectedOutput, actualOutput);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertBefore_failure(){
        LinkedList ls = new LinkedList();
        ls.append(1);
        ls.append(2);
        ls.append(5);
        ls.append(5);
        ls.append(5);
        ls.insertBefore(4,3);

        String actualOutput = ls.printLinkeList(ls);
        String expectedOutput = "List contents: 1 2 4 5 5 5 ";
        assertEquals("insertBefore should add a value before the designated value. If there are multiple target values, insert will happen before the 1st occurrence. ", expectedOutput, actualOutput);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertAfter_failure(){
        LinkedList ls = new LinkedList();
        ls.append(1);
        ls.append(2);
        ls.append(2);
        ls.append(4);
        ls.insertAfter(3, 4);
        String actualOutput = ls.printLinkeList(ls);
        String expectedOutput = "List contents: 1 2 4 2 4 ";
        assertEquals("insertAfter should add a value after the designated value. If there are multiple target values, insert will happen after the 1st occurrence.", expectedOutput, actualOutput);
    }

    @Test
    public void testInsertAfter(){
        LinkedList ls = new LinkedList();
        ls.append(1);
        ls.append(2);
        ls.append(3);
        ls.insertAfter(3, 4);

        String actualOutput = ls.printLinkeList(ls);
        String expectedOutput = "List contents: 1 2 3 4 ";
        assertEquals("insertAfter should add a value after the designated value. ", expectedOutput, actualOutput);
    }

    @Test
    public void testInsertAfter_multipleTargetValues(){
        LinkedList ls = new LinkedList();
        ls.append(1);
        ls.append(2);
        ls.append(2);
        ls.append(4);
        ls.insertAfter(2, 4);
        String actualOutput = ls.printLinkeList(ls);
        String expectedOutput = "List contents: 1 2 4 2 4 ";
        assertEquals("insertAfter should add a value after the designated value. If there are multiple target values, insert will happen after the 1st occurrence.", expectedOutput, actualOutput);
    }

    @Test
    public void testGetKthFromEnd_middle(){
        LinkedList ll = createLinkedList(4);
        Object actualOutput = ll.getKthFromEnd(2);
        Object expectedOutpu = 2;

        assertEquals("values should be equal", expectedOutpu, actualOutput);

    }

    @Test
    public void testGetKthFromEnd_lengthEqualToK(){
        LinkedList ll = createLinkedList(4);
        Object actualOutput = ll.getKthFromEnd(4);
        Object expectedOutpu = 1;

        assertEquals("values should be equal", expectedOutpu, actualOutput);

    }

    @Test
    public void testGetKthFromEnd_oneNode(){
        LinkedList ll = createLinkedList(1);
        Object actualOutput = ll.getKthFromEnd(1);
        Object expectedOutpu = 1;

        assertEquals("values should be equal", expectedOutpu, actualOutput);

    }

    @Test
    public void testGetKthFromEnd_negativeK(){
        LinkedList ll = createLinkedList(4);
        Object actualOutput = ll.getKthFromEnd(-2);
        Object expectedOutpu = 2;

        assertEquals("values should be equal", expectedOutpu, actualOutput);

    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetKthFromEnd_lengthLessThanK(){
        LinkedList ll = createLinkedList(4);
        Object actualOutput = ll.getKthFromEnd(10);
        Object expectedOutpu = 2;

        assertEquals("values should be equal", expectedOutpu, actualOutput);

    }

    @Test(expected = IllegalStateException.class)
    public void testGetKthFromEnd_null(){
        LinkedList ll = new LinkedList();
        Object actualOutput = ll.getKthFromEnd(2);
        Object expectedOutpu = 2;

        assertEquals("values should be equal", expectedOutpu, actualOutput);

    }

    @Test
    public void testMergeLists_bothListLengthsEqual(){
        LinkedList ls1 = createLinkedList(5);
        LinkedList ls2 = createLinkedList(5);

        LinkedList ls3 = new LinkedList();
        ls3.append(1);
        ls3.append(1);
        ls3.append(2);
        ls3.append(2);
        ls3.append(3);
        ls3.append(3);
        ls3.append(4);
        ls3.append(4);
        ls3.append(5);
        ls3.append(5);


        LinkedList actualLs3 = new LinkedList();
        actualLs3.head = actualLs3.mergeLists(ls1, ls2);
        String expectedOutput = actualLs3.printLinkeList(ls3);
        String actualOutput = actualLs3.printLinkeList(actualLs3);

        assertEquals("both list should be the same", expectedOutput, actualOutput);
    }

    @Test
    public void testMergeLists_bothListLengthsNotEqual() {
        LinkedList ls1 = createLinkedList(5);
        LinkedList ls2 = createLinkedList(3);

        LinkedList ls3 = new LinkedList();
        ls3.append(1);
        ls3.append(1);
        ls3.append(2);
        ls3.append(2);
        ls3.append(3);
        ls3.append(3);
        ls3.append(4);
        ls3.append(5);


        LinkedList actualLs3 = new LinkedList();
        actualLs3.head = actualLs3.mergeLists(ls1, ls2);
        String expectedOutput = actualLs3.printLinkeList(ls3);
        String actualOutput = actualLs3.printLinkeList(actualLs3);

        assertEquals("both list should be the same", expectedOutput, actualOutput);
    }

    @Test
    public void testMergeLists_oneListNull() {
        LinkedList ls1 = createLinkedList(5);
        LinkedList ls2 = new LinkedList();

        LinkedList ls3 = new LinkedList();
        ls3.append(1);
        ls3.append(2);
        ls3.append(3);
        ls3.append(4);
        ls3.append(5);

        LinkedList actualLs3 = new LinkedList();
        actualLs3.head = actualLs3.mergeLists(ls1, ls2);
        String expectedOutput = ls3.printLinkeList(ls3);
        String actualOutput = actualLs3.printLinkeList(actualLs3);

        assertEquals("both list should be the same", expectedOutput, actualOutput);
    }

    @Test
    public void testMergeLists_bothListsNull() {
        LinkedList ls1 = new LinkedList();
        LinkedList ls2 = new LinkedList();

        LinkedList ls3 = new LinkedList();
        ls3.append(1);

        LinkedList actualLs3 = new LinkedList();
        actualLs3.head = actualLs3.mergeLists(ls1, ls2);
        String expectedOutput = "Linked List has no data.";
        String actualOutput = actualLs3.printLinkeList(actualLs3);

        assertEquals("both list should be the same", expectedOutput, actualOutput);
    }
}
