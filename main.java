import java.util.Arrays;

class main {
	public static void main(String[] args) {
		mergeArrayTests();
	}
	
	public static char[] mergeArrays( char[] a, char[] b) {
		char[] answer = new char[a.length + b.length];
		for(int i = 0, j = 0, k = 0; i < answer.length;)
			answer[i++] = a.length > j && b.length > k ? a[j] < b[k] ? a[j++] : b[k++] : a.length > j ? a[j++] : b[k++];
		return answer;
	}
	
	public static void mergeArrayTests() {
		char one[] = new char[] {'a','c','e','g','i','k'};
		char two[] = new char[] {'b','d','f'};
		mergeArrays(one, two);
		char[] combinedArray = mergeArrays( one,two);
		System.out.println("merging: "+ Arrays.toString(one) + " " + Arrays.toString(two));
		System.out.println("  --> " + Arrays.toString(combinedArray));
		one = new char[] {'a','c','e','g','i','k'};
		two = new char[] {'b','d'};
		combinedArray = mergeArrays( one, two);
		System.out.println("merging: "+ Arrays.toString(one) + " " + Arrays.toString(two));
		System.out.println("  --> " + Arrays.toString(combinedArray));
		one = new char[] {'a','c','e','g','i','k'};
		two = new char[] {};
		combinedArray = mergeArrays( one,two);
		System.out.println("merging: "+ Arrays.toString(one) + " " + Arrays.toString(two));
		System.out.println("  --> " + Arrays.toString(combinedArray));
		one = new char[] {'b','k'};
		two = new char[] {'a','d','f','h'};
		combinedArray = mergeArrays( one,two);
		System.out.println("merging: "+ Arrays.toString(one) + " " + Arrays.toString(two));
		System.out.println("  --> " + Arrays.toString(combinedArray));
	}
}
