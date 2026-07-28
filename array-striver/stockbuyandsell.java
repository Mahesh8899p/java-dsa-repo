package arrayeasy;

public class stockbuyandsell {
    public static int stockbuyandsell1(int[] nums){
        //best buy
        //maximumprofit
        //selling price -> arr[i] iteration throught the array
        int bestbuy = nums[0];
        int maximumprofit = 0;
        for(int i =0;i<=n;i++){
            if(nums[i] - bestbuy > maximumprofit){
                maximumprofit = nums[i] - bestbuy;
            }
            if(bestbuy < nums[i]){
                bestbuy = nums[i];
            }
        }
        return maximumprofit;

    }

    public static void main(String[] args) {
        int[] nums = {10, 7, 5, 8, 11, 9};
        stockbuyandsell1(nums)
    }
}


