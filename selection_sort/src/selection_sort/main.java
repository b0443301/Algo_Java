package selection_sort;

public class main {
	public static void main(String[] argv) {
		int[] arr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

		for (int i = 0; i < 10; i++) {//控制整個排序外面一層全部都跑一次
			for (int k = i + 1; k < 10; k++){//控制後面的排序(10 9 7 8 5 6 4 3 2 1 )
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
