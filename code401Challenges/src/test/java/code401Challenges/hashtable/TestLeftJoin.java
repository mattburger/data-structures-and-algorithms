package code401Challenges.hashtable;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


import static org.junit.Assert.assertEquals;

public class TestLeftJoin {
    @Test
    public void testLeftJoin_happyPath() {
        HashMap<String, String > hm1 = new HashMap<>();
        HashMap<String, String> hm2 = new HashMap<>();
        ArrayList<String> expected = new ArrayList<>();


        hm1.put("fond", "enamored" );
        hm1.put("wrath", "anger");
        hm1.put("diligent", "employed");
        hm1.put("outfit", "garb");
        hm1.put("guide", "usher");

        hm2.put("fond", "averse");
        hm2.put("wrath", "delight");
        hm2.put("diligent", "idle");
        hm2.put("guide", "follow");
        hm2.put("flow", "jam");

        LeftJoin lj = new LeftJoin(hm1, hm2);
        HashMap<String, List<String> > result = lj.leftJoin();

        expected.add("fond");
        expected.add("enamored");
        expected.add("averse");
        assertEquals(expected, result.get("fond") );


        expected.remove(2);
        expected.remove(1);
        expected.remove(0);
        expected.add("outfit");
        expected.add("garb");
        expected.add(null);
        assertEquals(expected, result.get("outfit"));

    }

    @Test(expected = IllegalArgumentException.class)
    public void TestLeftJoin_empyHashMap() {
        HashMap<String, String > hm1 = new HashMap<>();
        LeftJoin lj = new LeftJoin();

        hm1.put("fond", "enamored" );
        hm1.put("wrath", "anger");
        hm1.put("diligent", "employed");
        hm1.put("outfit", "garb");
        hm1.put("guide", "usher");

        lj.setLeft(hm1);

        lj.leftJoin();

        assertEquals("Cannot join a null HashMap", hm1.get("fond"));

    }
}
