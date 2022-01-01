package basics;

public class NumberProcessing {
	public static void main(String[] args) {
		System.out.println(fact(10));
	}
	
	public static int addition(int[] arr) {
		int num = 0;
		for (int i = 0; i < arr.length; i++) {
			num = num + arr[i];
		}
		return num;
	}
	
	public static int fact(int num) {
		//In a factorial function, 0 and below should never be used. -1 is for debugging purposes
		if (num <= 0) return -1;
		if (num == 1) return 1;
		return num * fact(num - 1);
	}
	
	public static int findMin(int[] arr) {
		//If array length is one, answer is already provided
		if (arr.length == 1) return arr[0];
		int num = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (num < arr[i]) num = arr[i];
		}
		return num;
	}
	
	public static int findMax(int[] arr) {
		//If array length is one, answer is already provided
		if (arr.length == 1) return arr[0];
		int num = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (num > arr[i]) num = arr[i];
		}
		return num;
	}
	
	public static int findAvg(int[] arr) {
		//If array length is one, answer is already provided
		if (arr.length == 1) return arr[0];
		int num = arr[0];
		int i;
		for (i = 1; i < arr.length; i++) {
			num = num + arr[i];
		}
		return num / i;
	}
}
