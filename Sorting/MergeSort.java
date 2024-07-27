public class MergeSort {
	

	public void merge(int[] arr, int min, int mid, int max) {

		int n1 = mid-(min-1);
		int n2 = max - mid;

		int[] L = new int[n1];
		int[] R = new int[n2];

		//copy data in temp array
		for(int i =0; i<n1; i++) {
			L[i] = arr[min+i];
		}

		for(int j=0; j<n2; j++) {
			R[j] = arr[mid+1+j];
		}

		int i=0, j=0;
		int k = min;

		while(i<n1 && j<n2) {
			if(L[i]<=R[j]) {
				arr[k] = L[i];
				k++;
				i++;
			} else {
				arr[k] = R[j];
				k++;
				j++;
			}

		}

		while(i<n1) {
			arr[k] = L[i];
				k++;
				i++;
		}

		while(j<n2) {
			arr[k] = R[j];
				k++;
				j++;
		}
	}

	public void sort(int[] arr, int min, int max) {

		if(max<=min) {
			return ;
		} 

		int mid = (max - min)/2+ min;
		sort(arr, min, mid);
		sort(arr, mid+1, max);

		merge(arr, min, mid, max);

	}

	public void printArray(int arr[]) {
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		MergeSort ms = new MergeSort();
		int[] arr = {6,1,7,4,2,9,8,5,3};
		ms.printArray(arr);
		ms.sort(arr, 0, arr.length-1);
		ms.printArray(arr);
	}

}