package arraystrv;

/*
Approach:
- Traverse the array and add the profit whenever the current price is greater than the previous one.
- This gives the maximum profit for multiple transactions.
*/

public class stockbuyandsell2 {
    public static int Stockbuyandsell2(int[] nums){
        int maximumprofit = 0;
        int n = nums.length- 1;
        for(int i =0;i<n;i++){
            if(nums[i+1] > nums[i]){
                maximumprofit += nums[i+1] - nums[i];
            }
        }
        return maximumprofit;
    }
}
/*
The Problem (Restated)
You're given prices for n days: arr[0], arr[1], ..., arr[n-1].
You can buy and sell as many times as you want, but:

You must sell before you can buy again (no holding 2 stocks at once).
You want to maximize total profit.

Step 1: Think About a Small Case First
Let's say prices are: 1, 2, 3
What are your options?

Option A: Buy at 1, sell at 3 → profit = 3 - 1 = 2
Option B: Buy at 1, sell at 2 (profit 1), then buy at 2, sell at 3 (profit 1) → total = 1 + 1 = 2

Both give the same profit! That's the key mathematical insight.
Step 2: Why This Happens (The Math)
Notice:

(arr[2]−arr[0])=(arr[1]−arr[0])+(arr[2]−arr[1])(arr[2] - arr[0]) = (arr[1] - arr[0]) + (arr[2] - arr[1])(arr[2]−arr[0])=(arr[1]−arr[0])+(arr[2]−arr[1])
3−1=(2−1)+(3−2)3 - 1 = (2 - 1) + (3 - 2)3−1=(2−1)+(3−2)
2=1+12 = 1 + 12=1+1
This is just basic telescoping — a big jump from day 0 to day 2 can always be broken into smaller consecutive jumps, and they add up to the exact same value!
So mathematically:

arr[j]−arr[i]=∑k=ij−1(arr[k+1]−arr[k])arr[j] - arr[i] = \sum_{k=i}^{j-1} (arr[k+1] - arr[k])arr[j]−arr[i]=k=i∑j−1​(arr[k+1]−arr[k])
This means: any profit from buying on day i and selling on day j is exactly equal to the sum of all the daily differences in between.
Step 3: What About Decreasing Prices?
Now consider: 3, 2, 1

If you buy at 3 and try to sell at 1 → profit = 1 - 3 = -2 (a loss!)
Since we're not forced to trade every day, the smart move is: do nothing when prices are dropping.

So the rule becomes:

If arr[i+1] - arr[i] > 0 → this difference adds positively to your profit, so include it.
If arr[i+1] - arr[i] < 0 → this difference would reduce your profit, so simply skip that day (don't trade).

Step 4: The Mathematical Formulation
We want:
Total Profit=∑i=1n−1max⁡(0, arr[i]−arr[i−1])\text{Total Profit} = \sum_{i=1}^{n-1} \max(0, \, arr[i] - arr[i-1])Total Profit=i=1∑n−1​max(0,arr[i]−arr[i−1])
In words: Look at every pair of consecutive days. If the price went up, add that gain to your profit. If it went down, ignore it (add 0).
Step 5: Why Does This Give the Maximum Profit? (Proof Intuition)
Think of the price graph as a zig-zag line (up and down movements).

Every time the price rises continuously (a mountain going up), you want to capture the entire rise from the local bottom to the local top.
You can prove that capturing this rise in one trade (buy at bottom, sell at top) gives the same total profit as capturing it in many smaller trades (thanks to the telescoping sum we saw in Step 2).
So there's no advantage to splitting an upward run into pieces or combining multiple upward runs — the sum of "daily gains" already accounts for the best possible strategy.

Formally: Since profit is additive across any partition of an increasing segment, the maximum total profit equals the sum of all positive daily changes.
Step 6: Final Simple Rule (In Words)

"Add up every day where tomorrow's price is higher than today's price. Ignore every day where the price drops."

That's it. No need to track "when to buy" or "when to sell" explicitly — the math guarantees that summing positive differences gives you the optimal total profit.
Worked Example
arr = [7, 1, 5, 3, 6, 4]
Differences day by day:

1 - 7 = -6 → skip (loss)
5 - 1 = +4 → add
3 - 5 = -2 → skip
6 - 3 = +3 → add
4 - 6 = -2 → skip

Total Profit = 4 + 3 = 7 ✅ (matches what we found earlier!)
Summary (The "Math Proof" in One Paragraph)
Because profit over any range can be decomposed into a sum of profits over smaller consecutive sub-ranges (telescoping), and because we're free to skip any losing day, the optimal strategy is simply to sum every positive day-to-day price increase — this captures the maximum achievable profit without ever needing to explicitly decide "buy here, sell there."

*/


