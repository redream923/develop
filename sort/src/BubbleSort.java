
import java.util.Arrays;

/**
 * 排序
 */

public class BubbleSort {
	public static void main(String[] args) {

		int[] arr = { 2, 5, 1, 3, 4 };
		// bubbleSort(arr);
		searchSort(arr);
		System.out.println(Arrays.toString(arr));

	}

	// 冒泡排序：
	// 规则：相邻两个元素进行比较，大的往后放，第一轮排序后，找出了最大值...
	public static void bubbleSort(int[] arr) {
		// i：表示比较的轮次
		for (int i = 0; i < arr.length - 1; i++) {
			// j；表示每一轮比较的次数
			// j：前面元素小标 j+1：后面元素下标
			for (int j = 0; j < arr.length - 1 - i; j++) {
				// 相邻的2个元素进行比较，大的往后放。
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	// 选择排序
	// 规则：第一轮拿1个元素和后面的所有元素进行比较，小的往前放
	// 第二轮拿第二个元素和后面的多有元素进行比较：
	public static void searchSort(int[] arr) {
		// i：表示比较的的轮次，前面需要比较的元素下标
		for (int i = 0; i < arr.length - 1; i++) {
			// j；表示每一轮比较的次数；后面需要比较元素下标
			for (int j = i + 1; j < arr.length; j++) {
				// 前后比较，小的往前放
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}

