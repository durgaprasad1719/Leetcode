class Solution {
    public int search(int[] arr, int target) {
        // in rotated sorted arry low to mid is sorted or mid to high sorted
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[low]<=arr[mid]){
                // low to mid is sorted
                if(target>=arr[low]&&target<=arr[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
                

            }
            else{
                // mid to high is sorted
                if(target>=arr[mid]&& target<=arr[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }

        }
        return -1;
        
    }
}