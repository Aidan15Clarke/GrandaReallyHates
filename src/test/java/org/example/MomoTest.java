package org.example;

import junit.framework.TestCase;

public class MomoTest extends TestCase {

    public void testLikesWord() {
        Grandma m = new Momo();
        assertTrue(m.likesWord("banana"));
        assertTrue(m.likesWord("anana"));
        assertFalse(m.likesWord("jack"));
        //assertFalse(m.likesWord(""));
    }
}