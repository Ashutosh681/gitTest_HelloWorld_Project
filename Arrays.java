
public class Arrays {

	public static void main(String[] args) {

		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		System.out.println("Items inside Array2 : " + arr[2]);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("all items inside the Array: " + i + " is " + arr[i]);
		}
	}

}
