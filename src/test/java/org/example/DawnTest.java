package org.example;

import junit.framework.TestCase;

public class DawnTest extends TestCase {

    public void testLikesWord() {
        Dawn k = new Dawn();
        assertTrue(k.likesWord("bob"));
        assertFalse(k.likesWord("steak"));
        assertFalse(k.likesWord(""));
    }
}