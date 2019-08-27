import java.util.Arrays;

public class ArrayUtils {
	public static void main(String[] args) {
		int[] ar1 = new int[10];
		int[] ar2 = new int[10];

		Arrays.fill(ar1, 7); // ar1의 값을 7로 초기화시킨다.
		for (int num : ar1)
			System.out.print(num + " ");
		System.arraycopy(ar1, 0, ar2, 3, 4);
		
		System.out.println();
		for (int num : ar2)
			System.out.print(num + " ");
	}
}
