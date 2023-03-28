
public class SmallestLetter {
    public static void main(String[] args) {

        char [] letters= {'c','f','j'};
        System.out.println(nextGreatestLetter(letters,'c'));
    }

    static char nextGreatestLetter(char [] letters,char target){
        int start=0;
        int end=letters.length;

        while(start<=end){
            int mid=start +(end -start) /2;
            if(target < letters[mid]){
                end=mid -1;
            }else{
                start=mid+1;
            }
        }
        return letters[start % letters.length];
    }
}
