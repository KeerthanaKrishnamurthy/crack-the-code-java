package linearsearch;

public class linearSearch {
    public static void main(String[] args){
        int[] nums = {1, 6, 3, 9};
        int target = 9;
        System.out.println(search(nums, target));
    }
    private static int search(int[] nums, int target){
        for(int i=0; i< nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
}
