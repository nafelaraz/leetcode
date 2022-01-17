package shufflethearray;

public class ShuffleTheArray {

    // O(1) space
    public int[] shuffle(int[] nums, int n) {

        for(int i = 0; i<n;i++){
            nums[i] = nums[i] + 10000 * ( nums[i+n] % 10000 );
        }

        for(int i = n-1; i>=0;i--){
            nums[2*i +1] = nums[i]/10000;
            nums[2*i] = nums[i]%10000;
        }
        return nums;
    }

    
    /*public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int index = 0;
        for(int i=0;i<n;i++){
            ans[index] = nums[i];
            index++;
            ans[index] = nums[i+n];
            index++;
        }
        return ans;
    }*/
}
