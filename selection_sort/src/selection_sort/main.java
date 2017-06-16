package selection_sort;

public class main {
	public static void main(String[] argv) {
		int[] arr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

		for (int i = 0; i < 10; i++) {//北俱逼糷场常禲Ω
			for (int k = i + 1; k < 10; k++){//北逼(10 9 7 8 5 6 4 3 2 1 )
				if (arr[k] < arr[i]) {
					int temp = arr[k];
					arr[k] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		for(int i=0;i<10;i++){
			System.out.println(arr[i]);
		}
	}
}
