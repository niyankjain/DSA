public class QuickSort {
	
	public static void main(String[] args) {

		System.out.println("<<<<=========Quick Sort==========>>>");
		int[] arr2 = {6,1,7,4,2,9,8,5,3};
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}

		System.out.println();
		quickSort(arr2, 0, arr2.length-1);

		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
	}

	public static void quickSort(int[] arr, int low, int high) {

		if(high > low){
			int pidx = fetchPivotOriginalIndex(arr, low, high);
			quickSort(arr, low, pidx-1);
			quickSort(arr, pidx+1, high);
		}
	}

	public static int fetchPivotOriginalIndex(int[] arr, int low, int high) {
		
			int i=low-1;
			int pivot = arr[high];
			for(int index = low; index<high; index++) {
				if(arr[index]<pivot) {
					i++;
					int temp = arr[index];
					arr[index] = arr[i];
					arr[i] = temp;
				}
			}
			i++;
			int temp = arr[high];
			arr[high] = arr[i];
			arr[i] = temp;
			return i;
	}

}