public class BinarySearchRecur {

  public static void main(String[] args) {
    // step 1: Array should be sorted
    int[] arr = {1,3,4,6,7,8,10,12,13,14};
    int target = 14;
    int findIdx = performBinarySearch(arr, target);
    if(findIdx == -1) {
      System.out.println("Element not present in array");
    } else {
      System.out.println("Element: " + target + ", found on index: " + findIdx);
    }
  }

  private static int performBinarySearch(int[] arr, int target) {
    return searchElement(arr, 0, arr.length-1, target);
  }

  private static int searchElement(int[] arr, int startIdx, int endIdx, int target) {
    if(endIdx < startIdx) {
      return -1;
    }
    int midIdx = (endIdx-startIdx)/2 + startIdx;
    if(target == arr[midIdx]) {
      return midIdx;
    } else if (target > arr[midIdx]) {
      return searchElement(arr, midIdx+1, endIdx, target);
    } else {
      return searchElement(arr, startIdx, midIdx-1, target);
    }
  }

}
