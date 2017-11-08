package edu.luc.cs271.wordcount;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class TestWordCounter {

  // TODO complete this test class

  // TODO declare a reference to the SUT (system under test), i.e., WordCounter
  Map<String, Integer> testMap = new HashMap<String, Integer>();
  WordCounter fixture;

  @Before
  public void setUp() {
    // TODO create the SUT instance
    fixture = new WordCounter(testMap);
  }

  @After
  public void tearDown() {
    // TODO set the SUT instance to null
    fixture = null;
  }

  @Test
  public void testGetCountEmpty() {
    // TODO verify that the SUT initially returns an empty map
    assertEquals(fixture.getCounts(), Collections.emptyMap());


  }

  @Test
  public void testGetCountNonEmpty() {

    // TODO run the SUT on a specific String iterator with some repeated words,
    // then use assertions to verify the correct counts
    // do this for at least two words in the iterator and two not in the iterator
    ArrayList<String> testArray;
    testArray = new ArrayList<String>(Arrays.asList("one","two","two","three","three","three"));

    fixture.countWords(testArray.iterator());

    assertEquals(fixture.getCount("one"), 1);
    assertEquals(fixture.getCount("two"), 2);
    assertEquals(fixture.getCount("three"), 3);
    assertEquals(fixture.getCount("aRandomWord"), -1);
    assertEquals(fixture.getCount("notEvenAWord"), -1);
    assertEquals(fixture.getCount("password"), -1);
    assertEquals(fixture.getCount("Habibi"), -1);


  }
}