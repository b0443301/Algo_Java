package bubble_sort;

public class main {
	public static void main(String[] argv) {
		int[] arr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		
		for (int i = 9; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				if (arr[j - 1] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println(arr[i]);
		}
	}
}
