public class SelectionSort {
	
	public static void main(String[] args) {

		System.out.println("<<<<=========Selection Sort==========>>>");
		int[] arr1 = {5,1,3,4,2};
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}

		System.out.println();

		selectionSorting(arr1);
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
	}

	public static void selectionSorting(int[] a) {
		int size = a.length;
		for(int i=0; i<size-1; i++){

			int smallestIndex = i;
			for(int j = i+1; j<size; j++){
				if(a[smallestIndex]>a[j]) {
					smallestIndex = j;
				}
			}

			if(a[smallestIndex]<a[i]) {
				int temp = a[smallestIndex];
				a[smallestIndex] = a[i];
				a[i] = temp;
			}
		}
	}

}