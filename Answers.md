###1. Try using a `TreeMap` instead of a `HashMap`. Does this make any difference?
    -
###2. What happens if you invoke `countWords` multiple times for different String iterators?
    - It increases the complexity of the program.
###3. What crucial role does the Iterator abstraction play in making `WordCounter` testable?
    - It allows the wordcounter to assign different keys to the same value. This allows us to locate and count keys to get word count.


####output:
 >the=33282
 
 >of=18016
 
 >and=12849
 
 >a=12717
 
 >to=12450
 
 >in=9387
 
 >was=7788
 
 >that=6601
 
 >he=6202
 
 >his=5529
