package linkedin.javads;

public class BinarySearch {
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println("4 " + BinarySearch(arr,4));
        System.out.println("6 " + BinarySearch(arr,6));
        System.out.println("7 " + BinarySearch(arr,7));
        System.out.println("9 " + BinarySearch(arr,9));
        System.out.println("0 " + BinarySearch(arr,0));
    }

    private static String BinarySearch(int[] arr, int i) {
        int min=0,max=arr.length-1;
        int mid= min+ (( max-min)/2);
        while ( min <= max) {
            mid= min+ (( max-min)/2);
            if (arr[mid]==i) 
                return "true";
            else if ( i < arr[mid] ) {
                max=mid-1;
            } else {
                min = mid+1;
            }
        }
        return "false";
    }
}
