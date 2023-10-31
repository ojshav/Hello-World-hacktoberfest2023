public class AgnosticBinarySearch {
    public static void main(String[] args) {
int[] arr = {90,75,18,12,6,4,3,1};
int target = 75;
int ans = agnosticbinar(arr,target);
        System.out.println(ans);
    }
    static int  agnosticbinar(int[] arr, int target){
        int start  =0;
        int end = arr.length-1;
        //find whether the array sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start<=end){
            // find the middle element
            int mid = start + (end-start) / 2;

            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end = mid-1;
                } else if (target>arr[mid]) {
                    start = mid+1;
                }
            }else{
                if(target>arr[mid]){
                    end =  mid-1;
                } else if (target<arr[mid]) {
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
