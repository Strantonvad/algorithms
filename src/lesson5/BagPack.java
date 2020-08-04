package lesson5;

public class BagPack {

    public static void main(String[] args) {
        int[] prices = new int[]{765, 149, 287, 495, 54, 111, 345};
        int[] weights = new int[]{2, 3, 4, 0, 1, 5, 7};
        int volume = 10;
        int[] tab = new int[volume + 1];
        System.out.println(bagPack(prices, weights, volume, tab, 0));
    }

    static int bagPack(int[] prices, int[] weights, int volume, int[] tab, int i) {
        if (i >= prices.length) return 0;
        if (tab[volume] != 0)
            return tab[volume];

        int value1 = bagPack(prices, weights, volume, tab, i + 1);
        int value2 = 0;
        if (volume >= weights[i]) {
            value2 = bagPack(prices, weights, volume - weights[i], tab, i + 1) + prices[i];
        }

        return tab[volume] = Math.max(value1, value2);
    }
}
