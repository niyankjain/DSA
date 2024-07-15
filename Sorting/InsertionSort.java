public class InsertionSort {
	
	public static void main(String[] args) {

		System.out.println("<<<<=========Insertion Sort==========>>>");
		int[] arr2 = {6,1,7,4,2,9,8,5,3};
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}

		System.out.println();

		insertionSorting(arr2);
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println();

	}

	public static void insertionSorting(int[] a) {

		for(int i=1; i<a.length; i++) {
			int temp = a[i];
			for (int j=i-1; j>=0; j--) {
				if(temp<a[j]) {
					int nor = a[j];
					a[j] = a[j+1];
					a[j+1] = nor;
				}	
			}
		}
	}

}