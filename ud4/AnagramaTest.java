package com.example.project;



import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AnagramaTest {
	
	@Test
    public void testAnagramas() {
        assertTrue(Anagrama.sonAnagrama("listen", "silent"));
        assertTrue(Anagrama.sonAnagrama("rail safety", "fairy tales"));
        assertTrue(Anagrama.sonAnagrama("debit card", "bad credit"));
        assertTrue(Anagrama.sonAnagrama("Dormitory", "dirty room"));

        assertFalse(Anagrama.sonAnagrama("hello", "world"));
        assertFalse(Anagrama.sonAnagrama("hello", "olleh "));
        assertFalse(Anagrama.sonAnagrama("test", "tests"));
    }
}

