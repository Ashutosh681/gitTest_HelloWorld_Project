package HomeWorks;

public class array {

	void repeating(int arr[], int size) {
		int i, j;
		System.out.println("Repeated Elements are :");
		for (i = 0; i < size; i++) {
			for (j = i + 1; j < size; j++) {
				if (arr[i] == arr[j])
					System.out.print(arr[i] + ", ");
			}
		}
	}

	public static void main(String[] args) {
		array repeat = new array();
		int arr[] = { 1, 2, 5, 5, 2, 7, 1, 7, 7, 2, 5, 9, 10 };
		int arrsize = arr.length;
		repeat.repeating(arr, arrsize);
	}

}
