import java.util.Arrays;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int currentAmount = amount;
        int coinIndex = coins.length - 1;
        int coinCount = 0;

        if (amount == 0) { return 0; }

        while (currentAmount != 0) {
            if (currentAmount < coins[coinIndex] && coinIndex == 0) {
                return -1;
            }

            if (currentAmount >= coins[coinIndex]) {
                currentAmount -= coins[coinIndex];
                coinCount++;
                continue;
            }

            coinIndex--;
        }

        return coinCount;
    }
}