package blind75;

public class MinRotated {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8 , 0, 1, 2, 3};
        int ans = findMin(arr);
        int ans2 = findMax(arr);
        int target =0;
        int index= findTarget(arr,target);
        System.out.println("The minimum element is: " + ans );
        System.out.println("The minimum element is: " + ans2 );
        System.out.println("The index for target: " + target + " is " + index);
    }


    private static int findTarget(int[] arr, int target) {
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while ( low <= high) {
         int mid = (low + ( high -low)/2);
            if ( arr[mid]==target){
                ans=mid;
                return ans;
            } else  if ( arr[low] <= arr[mid] ) // first half is sorted
         {
            if ( target <= arr[mid] && target >= arr[low]) {
                high = mid-1;
            } else {
                low = mid+1;
            }
          
         } else  // right half is sorted
         {
          if ( target >= arr[mid] && target <= arr[high]) {
            low = mid+1;
          } else {
            high = mid-1;
          }
         }
        }
        return ans;
     }
 

    private static int findMin(int[] arr) {
       int low = 0;
       int high = arr.length-1;
       int ans = Integer.MAX_VALUE;
       while ( low <= high) {
        int mid = (low + ( high -low)/2);
        if ( arr[low] <= arr[mid]) // first half is sorted
        {
         ans= Math.min(ans,arr[low]); 
         low = mid+1;  
        } else  // right half is sorted
        {
            ans = Math.min(ans,arr[mid]);
            high=mid-1;
        }
       }
       return ans;
    }

    private static int findMax(int[] arr) {
        int low = 0;
        int high = arr.length-1;
        int ans = Integer.MIN_VALUE;
        while ( low <= high) {
         int mid = (low + ( high -low)/2);
         if ( arr[low] <= arr[mid]) // first half is sorted
         {
          ans= Math.max(ans,arr[mid]); 
          low = mid+1;  
         } else  // right half is sorted
         {
             ans = Math.max(ans,arr[high]);
             high=mid-1;
         }
        }
        return ans;
     }
 

}
