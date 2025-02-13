class Solution {
    public int findPeakElement(int[] arr) {
        int low=0,high=arr.length-1; 
        while(low<=high){
            int mid=(low+high)/2;
            if(mid >0 && arr[mid]<arr[mid-1]){
                high=mid-1;
            }
            else if(mid<arr.length-1 && arr[mid]<arr[mid+1]){
                low=mid+1;

            }
            else{
                return mid;
            }
        }
        return -1;
      
    }
}