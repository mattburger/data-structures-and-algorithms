package code401Challenges.hashtable;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.*;

public class TestHashtable {

    @Test
    public void testHashTable() {
        Hashtable testHT = new Hashtable(512);
        testHT.add("John", "Instructor");
        testHT.add("Matt", "Student");
        testHT.add("Paula", "Student");
        testHT.add("Michelle", "Instructor");
        testHT.add("Demi", "Dog");
        testHT.add("Denzel", "Awesome");
        testHT.add("Ali", "Greatest");
        testHT.add("Peter", "hehehehehe");
        testHT.add("Rick", "Scientist");
        testHT.add("Tesla", "Genius");
        testHT.add("Dum", "test");
        testHT.add("Dum", "testAgain");
        testHT.add("key space", "another TEst");
        testHT.add("Dum", "test2");


        assertEquals("get should return 'hehehehehe'", "hehehehehe", testHT.get("Peter"));
        assertNull("Value at 'taylor' should be null", testHT.get("taylor"));
        assertEquals("Value at 'Dum' should return multiple key value pairs",
                "{ [Dum, test2] [Dum, testAgain] [Dum, test] }",
                testHT.get("Dum"));
        assertEquals("get method shoud return 'another TEst' ", "another TEst", testHT.get("key space"));
        assertTrue("'Tesla' exists in the Hashtable and the contains method should return true", testHT.contains("Tesla"));
        assertFalse("'Taylor doesn't exist in the Hashtable and the contains method should return false",
                testHT.contains("Taylor"));
    }
}
