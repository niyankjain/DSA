public class Main {

  public static void main(String[] args) {

  }
}




//  public static void main(String[] args) {
//
//
////    for(int i=0; i<s.length(); i++) {
////      String ch = s.substring(i, i + 1);
////      if(s.contains(ch)) {
////        maxLength = Math.max(maxLength, sb.length());
////        sb = subString(1, )
////      } else {
////        sb +=ch;
////      }
////    }
//
////    String s = "A man, a plan, a canal: Panama";
////    String collect = s.chars()
////        .filter(Character::isLetterOrDigit)
////        .map(Character::toLowerCase)
////        .mapToObj(ch -> String.valueOf((char) ch))
////        .collect(Collectors.joining());
////
////    System.out.println(collect);
//
////    String s = "anagram", t = "nagaram";
////    boolean isAnagram = s.chars()
////        .sorted()
////        .mapToObj(ch -> String.valueOf((char) ch))
////        .collect(Collectors.joining())
////        .equals(
////            t.chars()
////                .sorted()
////                .mapToObj(ch -> String.valueOf((char) ch))
////                .collect(Collectors.joining())
////        );
////    System.out.println("String is anagram : "+isAnagram);
//
////    int[] A = new int[]{3, 1, 2, 5, 4};
////    int k=2;
////    PriorityQueue<Integer> pq = new PriorityQueue<>();
////    for(int i=0; i<A.length; i++) {
////      pq.add(A[i]);
////      System.out.println(pq.peek());
////      if(pq.size() > k) {
////        Integer poll = pq.poll();
////        System.out.println("Polled Element: " +poll);
////      }
////    }
////
////    System.out.println("Available Elements in Priority Queue");
////    pq.stream().iterator().forEachRemaining(System.out::println);
//
////    Main m = new Main();
////    int[] A = new int[]{3, 1, 2, 5, 3};
////    int[] outputArray = m.repeatedNumber(A);
////    for (int i=0; i<outputArray.length ; i++) {
////      System.out.println(outputArray[i]);
////    }
//  }

//  public int[] repeatedNumber(int[] A) {
//
//    Optional<Integer> number = Arrays.stream(A)
//        .boxed()
//        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//        .entrySet()
//        .stream()
//        .filter(entry -> entry.getValue() > 1)
//        .map(Map.Entry::getKey)
//        .findFirst();
//
//    int[] outputArray = new int[2];
//    if(!number.isEmpty()) {
//      outputArray[0] = number.get();
//      outputArray[1] = number.get()+1;
//    }
//    return  outputArray;
//  }

//  public static void main(String[] args) {
//    System.out.println("<<<<=========Quick Sort==========>>>>");
//    int[] arr = { 6, 1, 7, 4, 2, 9, 8, 5, 3 };
//    for (int i = 0; i < arr.length; i++) {
//      System.out.print(arr[i] + " ");
//    }
//    System.out.println();
////    quick(arr, 0, arr.length-1);
//    devide(arr, 0, arr.length - 1);
//
//    for (int i = 0; i < arr.length; i++) {
//      System.out.print(arr[i] + " ");
//    }
//  }


//  public static void main(String[] args) {
//
//
//    double lat = 19.0760;
//    double lon = 72.8777;
//
//    String geohash = encode(lat, lon, 6);
//    String geohash1 = encode(18.5866, 73.7306, 6);
//    String geohash2 = encode(18.5935, 73.7802, 6);
//
//
//    System.out.println(geohash);
//    System.out.println(geohash1);
//    System.out.println(geohash2);
//  }


//  private static final char[] BASE32 = {
//      '0', '1', '2', '3', '4', '5', '6', '7',
//      '8', '9', 'b', 'c', 'd', 'e', 'f', 'g',
//      'h', 'j', 'k', 'm', 'n', 'p', 'q', 'r',
//      's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
//  };

//  public static String encode(double lat, double lon, int precision) {
//
//    double[] latRange = { -90.0, 90.0 };
//    double[] lonRange = { -180.0, 180.0 };
//
//    StringBuilder binary = new StringBuilder();
//
//    boolean processLon = true;
//
//    while (binary.length() < precision * 5) {
//
//      if (processLon) {
//
//        double mid = (lonRange[0] + lonRange[1]) / 2;
//
//        if (lon >= mid) {
//          binary.append("1");
//          lonRange[0] = mid;
//        } else {
//          binary.append("0");
//          lonRange[1] = mid;
//        }
//
//      } else {
//
//        double mid = (latRange[0] + latRange[1]) / 2;
//
//        if (lat >= mid) {
//          binary.append("1");
//          latRange[0] = mid;
//        } else {
//          binary.append("0");
//          latRange[1] = mid;
//        }
//      }
//
//      processLon = !processLon;
//    }
//
//    StringBuilder geohash = new StringBuilder();
//
//    for (int i = 0; i < binary.length(); i += 5) {
//
//      String chunk = binary.substring(i, i + 5);
//
//      int index = Integer.parseInt(chunk, 2);
//
//      geohash.append(BASE32[index]);
//    }
//
//    return geohash.toString();
//  }
//
//
//  public static void devide(int[] arr, int start, int end) {
//    if (end > start) {
//      int mid = (end - start) / 2 + start;
//      devide(arr, start, mid);
//      devide(arr, mid + 1, end);
//      merge(arr, start, mid, end);
//    }
//  }

//  private static void merge(int[] arr, int start, int mid, int end) {
//
//    int m = mid - start + 1;
//    int n = end - mid;
//
//    int[] L = new int[m];
//    for (int i = 0; i < m; i++) {
//      L[i] = arr[start + i];
//    }
//
//    int[] R = new int[n];
//    for (int i = 0; i < n; i++) {
//      R[i] = arr[mid + 1 + i];
//    }
//
//    int i = 0;
//    int j = 0;
//    int k = start;
//
//    while (i < m && j < n) {
//      if (L[i] < R[j]) {
//        arr[k++] = L[i++];
//      } else {
//        arr[k++] = R[j++];
//      }
//    }
//
//    while (i < m) {
//      arr[k++] = L[i++];
//    }
//
//    while (j < n) {
//      arr[k++] = R[j++];
//    }
//  }
//
//
//  private static void quick(int[] arr, int start, int end) {
//    if (end > start) {
//      int pIdx = partition(arr, start, end);
//      quick(arr, start, pIdx - 1);
//      quick(arr, pIdx + 1, end);
//    }
//  }
//
//  private static int partition(int[] arr, int start, int end) {
//    int i = -1;
//    int pivot = arr[end];
//    for (int j = 0; j < end; j++) {
//      if (pivot > arr[j]) {
//        i++;
//        swap(arr, j, i);
//      }
//    }
//
//    i++;
//    swap(arr, end, i);
//    return i;
//  }
//
//  private static void swap(int[] arr, int startIdx, int endIdx) {
//    int temp = arr[startIdx];
//    arr[startIdx] = arr[endIdx];
//    arr[endIdx] = temp;
//  }
//}
