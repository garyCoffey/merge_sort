 * PROBLEM 3: merge together two sorted arrays of char into a new array.
	 * 
	 * The examples below 
	 * Example1  merge: [a c e g ] with [ b d f h] would yield [a b c d e f g h] 
	 * Example2  merge: [a f  ] with [ b c  h i] would yield [a b c f h i] 
	 * There is no guarantee about the size of either array. When/if you run out of elements in 
	 * either array, copy all the remaining elements from the nonempty array to the the new array 
	 * preconditions:
	 *          both arrays are sorted low to high
	 *          there are no duplicate values among the two arrays
	 *          either array may be empty
	 * postcondition: an array with all elements from both arrays sorted from low to high
	 * 
	 * You may not use any additional methods, sorting routines etc
	 * For full credit, your solution may only go through each array one time ( so in particular - no nested loops)
	 * 
	 * You will need to create a new array inside the function
	 * You do not have to write this recursively. 
	 */
	public static char[] mergeArrays( char[] a, char[] b) {
		char[] answer = new char[a.length + b.length];
		for(int i = 0, j = 0, k = 0; i < answer.length;)
			answer[i++] = a.length > j && b.length > k ? a[j] < b[k] ? a[j++] : b[k++] : a.length > j ? a[j++] : b[k++];
		return answer;
	}
	/*
	 * testing functions and main.
	 * There are no Todo's for you in the code below.
	 */
	public static void mergeArrayTests() {
		char one[] = new char[] {'a','c','e','g','i','k'};
		char two[] = new char[] {'b','d','f'};
		char[] combinedArray = mergeArrays( one,two);
		StdOut.println("merging: "+ Arrays.toString(one) + " " + Arrays.toString(two));
		StdOut.println("  --> " + Arrays.toString(combinedArray));
		one = new char[] {'a','c','e','g','i','k'};
		two = new char[] {'b','d'};
		combinedArray = mergeArrays( one, two);
		StdOut.println("merging: "+ Arrays.toString(one) + " " + Arrays.toString(two));
		StdOut.println("  --> " + Arrays.toString(combinedArray));
		one = new char[] {'a','c','e','g','i','k'};
		two = new char[] {};
		combinedArray = mergeArrays( one,two);
		StdOut.println("merging: "+ Arrays.toString(one) + " " + Arrays.toString(two));
		StdOut.println("  --> " + Arrays.toString(combinedArray));
		one = new char[] {'b','k'};
		two = new char[] {'a','d','f','h'};
		combinedArray = mergeArrays( one,two);
		StdOut.println("merging: "+ Arrays.toString(one) + " " + Arrays.toString(two));
		StdOut.println("  --> " + Arrays.toString(combinedArray));
	}
