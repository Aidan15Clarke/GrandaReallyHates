package org.example;

import junit.framework.TestCase;

public class AnaTest extends TestCase {

    public void testLikesWord() {
        Grandma d = new Ana();
        assertTrue(d.likesWord("racecar"));
        assertFalse(d.likesWord("joe"));
        assertFalse(d.likesWord(""));
    }
}