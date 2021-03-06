## Merge Sort

![Harry Potter sorting hat](https://media.giphy.com/media/JDAVoX2QSjtWU/giphy.gif)

### Language
This problem was solve in Java.

### Description
The problem this algorithm solves is the need to merge to sorted arrays together. I solved this problem as part of some homework for Data Structures I. I was pretty happy with the solution I had for this so I have included it here. Below I have some of the instructions the professor had given us for the problem.

**Examples**
  * merge: [a c e g ] with [ b d f h] would yield [a b c d e f g h]
  * merge: [a f  ] with [ b c  h i] would yield [a b c f h i]

> There is no guarantee about the size of either array. When/if you run out of elements in either array, copy all the remaining elements from the nonempty array to the the new array.

**Preconditions**
  * both arrays are sorted low to high
  * there are no duplicate values among the two arrays
  * either array may be empty

**Postcondition** an array with all elements from both arrays sorted from low to high

**Restrictions**

You may not use any additional methods, sorting routines etc. For full credit, your solution may only go through each array one time ( so in particular - no nested loops)

