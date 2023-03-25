public class OrderAgnosticSearch {
    public static void main(String[] args) {

    }
    static int orderAgonisticBS(int []arr,int target){
        int start=0;
        int end=arr.length-1;
        //find whether the array is in ascending or descending order
        boolean isAsc=arr[start] < arr[end];

        while(start <= end){

            int mid=start + (end-start) /2;

            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(arr[mid] > target){
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }else{
                if(arr[mid] < target){
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }


        }
    return -1;
    }
}
