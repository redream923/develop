
import java.util.Arrays;

/**
 * ����
 */

public class BubbleSort {
	public static void main(String[] args) {

		int[] arr = { 2, 5, 1, 3, 4 };
		// bubbleSort(arr);
		searchSort(arr);
		System.out.println(Arrays.toString(arr));

	}

	// ð������
	// ������������Ԫ�ؽ��бȽϣ��������ţ���һ��������ҳ������ֵ...
	public static void bubbleSort(int[] arr) {
		// i����ʾ�Ƚϵ��ִ�
		for (int i = 0; i < arr.length - 1; i++) {
			// j����ʾÿһ�ֱȽϵĴ���
			// j��ǰ��Ԫ��С�� j+1������Ԫ���±�
			for (int j = 0; j < arr.length - 1 - i; j++) {
				// ���ڵ�2��Ԫ�ؽ��бȽϣ��������š�
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	// ѡ������
	// ���򣺵�һ����1��Ԫ�غͺ��������Ԫ�ؽ��бȽϣ�С����ǰ��
	// �ڶ����õڶ���Ԫ�غͺ���Ķ���Ԫ�ؽ��бȽϣ�
	public static void searchSort(int[] arr) {
		// i����ʾ�Ƚϵĵ��ִΣ�ǰ����Ҫ�Ƚϵ�Ԫ���±�
		for (int i = 0; i < arr.length - 1; i++) {
			// j����ʾÿһ�ֱȽϵĴ�����������Ҫ�Ƚ�Ԫ���±�
			for (int j = i + 1; j < arr.length; j++) {
				// ǰ��Ƚϣ�С����ǰ��
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}

