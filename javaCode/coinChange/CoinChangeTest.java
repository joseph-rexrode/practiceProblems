public class CoinChangeTest {
    public static void main(String[] args) {
        CoinChange test = new CoinChange();

        int[] coinsInput = {186,419,83,408};
        int amountInput = 6249;

        System.out.println(test.coinChange(coinsInput, amountInput));
    }
}
