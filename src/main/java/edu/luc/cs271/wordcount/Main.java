package edu.luc.cs271.wordcount;

import java.util.*;

public class Main {

  public static void main(final String[] args) throws InterruptedException {

    // set up the scanner so that it separates words based on space and punctuation
    final Scanner input = new Scanner(System.in).useDelimiter("[^\\p{Alnum}]+");

    Map<String, Integer> theMap = new HashMap<String, Integer>();
    // TODO complete this main program
    // 1. create a WordCounter instance
    WordCounter WC = new WordCounter(theMap);
    // 2. use this to count the words in the input
    WC.countWords(input);
    // 3. determine the size of the resulting map
    int size = WC.getCounts().size();
    // 4. create an ArrayList of that size and
    List<Map.Entry<String, Integer>> theMapEntries = new ArrayList<>(size);
    // 5. store the map's entries in it (these are of type Map.Entry<String, Integer>
    theMapEntries.addAll(WC.getCounts().entrySet());
    // 6. sort the ArrayList in descending order by count
    //    using Collections.sort and an instance of the provided comparator (after fixing the
    // latter)
    Collections.sort(theMapEntries, new DescendingByCount());
    // 7. print the (up to) ten most frequent words in the text
    if (WC.getCounts().size() <= 10) {
      for (int i = 0; i < WC.getCounts().size(); i++) {
        System.out.println(theMapEntries.get(i));
      }
    } else {
      for (int j = 0; j <= 9; j++) {
        System.out.println(theMapEntries.get(j));
      }
    }
  }
}
