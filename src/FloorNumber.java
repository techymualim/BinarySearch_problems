public class FloorNumber {

    public static void main(String[] args) {
        int [] arr={9,10,11,14,18,20};
        System.out.println(ceilingNumber(arr,17));
    }

    static int ceilingNumber(int [] arr,int target){
        int start=0;
        int end=arr.length -1;
        if(target <= arr[arr.length-1]){
            return target;
        }

        while(start <= end){
            int mid= start + (end-start)/2;

            if(arr[mid] > target){
                end=mid -1;
            }else if(arr[mid] < target){
                start=mid +1;
            }else{
                return mid;
            }
        }
        return arr[end];
    }
}
