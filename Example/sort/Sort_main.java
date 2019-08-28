import java.util.Arrays;

class Sort {
	// 0번째 index는 정렬되어있다 가정하고, 1번째 index부터 현재 index 기준 앞 데이터와 비교하여 삽입한다.
	public void insertionSort(int[] arr) {
		System.out.println("**********Insertion Sort**********");


	}

	// 0번째 index부터 현재 index+1 부터 끝까지 비교하여 자리를 바꾼다.
	public void selectionSort(int[] arr) {
		System.out.println("**********Selection Sort**********");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
			System.out.printf("%d회 정렬 : %s\n", i + 1, Arrays.toString(arr));
		}
	}

	
	// 0번째 index부터 가장 근접한 두 개를 비교하며 정렬한다.
	public void bubbleSort(int[] arr) {
		System.out.println("**********Bubble Sort**********");

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[i] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.printf("%d회 정렬 : %s\n", i + 1, Arrays.toString(arr));
		}
	}
}

public class Sort_main {
	public static void main(String[] args) {
		int[] arr = { 8, 7, 6, 5, 4, 1, 2, 3 };
		Sort sort = new Sort();
		sort.bubbleSort(arr.clone());
		sort.selectionSort(arr.clone());
	}
}
