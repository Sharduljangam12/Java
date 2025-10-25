import java.util.*;
class Item {
    int weight, value;
    Item(int w, int v) {
        weight = w;
        value = v;
    }

    
}

public class FractionalKnapsack {

    public static double getMaxValue(Item[] items, int W) {
        Arrays.sort(items, (a, b) -> (b.value * a.weight) - (a.value * b.weight));

        double totalValue = 0.0;

        for (Item item : items) {
            if (W >= item.weight) {
                W -= item.weight;
                totalValue += item.value;
            } else {
                totalValue += item.value * ((double) W / item.weight);
                break;
            }
        }

        return totalValue;
    }

    public static void main(String[] args) {
        Item[] items = {
            new Item(10, 60),
            new Item(20, 100),
            new Item(30, 120)
        };
        int W = 50;

        double maxValue = getMaxValue(items, W);
        System.out.println("Maximum value (fractional): " + maxValue);
    }
}
//