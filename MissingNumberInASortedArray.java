// Time Complexity: O(n)
// Space Complexity: O(1)


public class MissingNumberInASortedArray {
		public static void main (String[] args) {
			int [] nums = new int[6];
			for(int i = 0; i < 6; i++){
			    if(i == 4){
			        nums[i] = 0;
			    }
			    else
			        nums[i] = i+1;
			    System.out.println("Nums: "+ nums[i]);
			}
			
			System.out.println("Missing number:"+missingNumber(nums));
		}
		public static int missingNumber(int[] nums) {
	        float n = nums.length;
	        int a1 = nums[0];
	        int aN = nums[nums.length-1];
	        float sum1 = ((n/2)*(a1 + aN));
	        float tmpSum = 0;
	        for(int i=0; i<n; i++){
	            tmpSum += nums[i];
	        }
	        System.out.println("Sum1: "+ sum1);
	        System.out.println("tmpSum: "+ tmpSum);
	        return (int)((sum1-tmpSum));
	    }

}
