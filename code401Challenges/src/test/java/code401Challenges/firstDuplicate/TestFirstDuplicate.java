package code401Challenges.firstDuplicate;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestFirstDuplicate {
    @Test
    public void testFirstDuplicate() {
        String input = "Once upon a time, there was a brave princess who...";
        String input2 = "It was the best of times, it was the worst of times, it was the age of wisdom, " +
                "it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, " +
                "it was the season of Light, it was the season of Darkness, " +
                "it was the spring of hope, it was the winter of despair, we had everything before us, " +
                "we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, " +
                "the period was so far like the present period, that some of its noisiest authorities insisted on its being received, " +
                "for good or for evil, in the superlative degree of comparison only...";
        String input3 = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, " +
                "and I didn’t know what I was doing in New York...";

        FirstDuplicate fd = new FirstDuplicate(input);
        String actual = fd.findDuplicate();
        String expected = "a";

        FirstDuplicate fd2 = new FirstDuplicate(input2);
        String actual2 = fd2.findDuplicate();
        String expected2 = "it";

        FirstDuplicate fd3 = new FirstDuplicate(input3);
        String actual3 = fd3.findDuplicate();
        String expected3 = "summer";

        assertEquals("The method should return 'a'", expected, actual);
        assertEquals("The method should return 'it'", expected2, actual2);
        assertEquals("The method should return 'summer'", expected3, actual3);


    }

    @Test(expected = IllegalStateException.class)
    public void testFirstDuplicate_emptyString_throwsError() {
        String input = "";
        FirstDuplicate fd = new FirstDuplicate(input);
        String actual = fd.findDuplicate();
        String expected = "a";

        assertEquals("The method should return 'a'", expected, actual);

    }

    @Test(expected = IllegalStateException.class)
    public void testFirstDuplicate_null_throwsError() {
        String input = "";
        FirstDuplicate fd = new FirstDuplicate(input);
        String actual = fd.findDuplicate();
        String expected = "a";

        assertEquals("The method should return 'a'", expected, actual);

    }

    @Test
    public void testFirstDuplicate_oneCharacterOrWord() {
        String input = "a";
        FirstDuplicate fd = new FirstDuplicate(input);
        String actual = fd.findDuplicate();
        String expected = "No duplicates";

        assertEquals("The method should return 'No duplicates'", expected, actual);
    }

    @Test
    public void testFirstDuplicate_oneLargeWord() {
        String input = "Supercalifragilisticexpialidocious";
        FirstDuplicate fd = new FirstDuplicate(input);
        String actual = fd.findDuplicate();
        String expected = "No duplicates";

        assertEquals("The method should return 'No duplicates'", expected, actual);
    }


}
