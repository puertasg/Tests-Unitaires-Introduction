package org.diginamic;

import static org.junit.Assert.*;

import org.junit.Test;

import customexceptions.EmptyCharSequenceException;
import dev.utils.StringUtils;

public class StringUtilsTest {
    
    @Test
    public void levenshteinDistanceTest()
    {
    	String str1 = "Chat";
    	String str2 = "Chats";
    	
    	try {
			assertTrue(StringUtils.levenshteinDistance(str1.subSequence(0, 3), str2.subSequence(0, 4)) == 1);
		} catch (EmptyCharSequenceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    @Test
    public void levenshteinDistanceTestVide()
    {
    	String str1 = "";
    	String str2 = "";
    	
    	try {
			assertTrue(StringUtils.levenshteinDistance(str1.subSequence(0, 0), str2.subSequence(0, 0)) == 0);
		} catch (EmptyCharSequenceException e) {
			e.printStackTrace();
		}
    }
    
    @Test
    public void levenshteinDistanceTestNull()
    {
    	try {
			StringUtils.levenshteinDistance(null, null);
			fail("levenshteinDistance n'a pas renvoyé d'exception");
		} catch (EmptyCharSequenceException e) {
			assertNotNull(e.getMessage());
		}
    }
}
