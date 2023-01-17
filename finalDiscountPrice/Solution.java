class Solution {
    public int[] finalPrices(int[] prices) {
        // declare answer variable
        int[] answer = new int[prices.length];
        // for each item, of which there are prices.length
        for (int i = 0; i < prices.length; i++) {
            int count = 0;
            // iterating from that item's index + 1 to prices.length
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] <= prices[i]) {
                    // add prices[i] - prices[j] to answer array
                    answer[i] = prices[i] - prices[j];
                    count++;
                    break;
                }
            }
            // if answer array length doesn't equal current index
            if (count == 0) { 
                answer[i] =  prices[i];
            }
        }

        return answer;
    }
}