
public class BubbleSort {
	
	public static void main(String[] args) {

		System.out.println("<<<<=========Bubble Sort==========>>>");

		int[] arr = {5,1,3,4,2};
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

		System.out.println();

		bubbleSorting(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

		System.out.println();
	}

	public static void bubbleSorting(int[] a) {
		int size = a.length;
		for(int i=0; i<size; i++){
			for(int j = 0; j<size-i-1; j++){
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
}