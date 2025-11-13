package Greedy;
import java.util.*;
class Item {
    double value, weight;
    public Item(double value, double weight) {
        this.value = value;
        this.weight = weight;
    }
    public double partial() {
        return value / weight;
    }
}

public class Question05 {
    public static double fractionalKnapsack(int[] wt, int[] val, int capacity) {
        ArrayList<Item> list = new ArrayList<>();
        for (int i = 0; i < wt.length; i++) {
            list.add(new Item(val[i], wt[i]));
        }
        list.sort((a, b) -> Double.compare(b.partial(), a.partial()));

        double total = 0.0;
        double remcapacity = capacity;
        for (Item item : list) {
            if (remcapacity == 0) break;
            if (item.weight <= remcapacity) {
                total += item.value;
                remcapacity -= item.weight;
            } else {
                total += item.value * (remcapacity / item.weight);
                remcapacity = 0;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        int[] wt = {10, 20, 30};
        int[] val = {60, 100, 120};
        int capacity = 50;
        double maxValue = fractionalKnapsack(wt, val, capacity);
        System.out.println("Maximum value in the Knapsack = " + maxValue);
    }
}
