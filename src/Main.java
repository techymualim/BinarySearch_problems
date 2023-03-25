public class Main {
    public static void main(String[] args) {

        int [] arr={12,22,44,55};
        System.out.println(search(arr,44));
    }
    static int search(int [] arr,int target){
        int start=0;
        int end=arr.length-1;


        while(start <=end){
            int mid=start + (end-start) /2;
            if(arr[mid] > target){
                end=mid-1;
            }
            else if(arr[mid] < target){
                start=mid+1;
            }
            else{
                return mid;
            }


        }
        return -1;
    }
}