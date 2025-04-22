import java.util.*;

public class Q1 {
    
    static class Item implements Comparable<Item> {
        int index;
        double cost;
        
        public Item(int index, double cost) {
            this.index = index;
            this.cost = cost;
        }
        
        public int compareTo(Item other) {
            return Double.compare(other.cost, this.cost);
        }
    }
    
    public static double[] fractionalKnapsack(double[] weights, double[] cost, double knapsackWeight) {
        int n = weights.length;
        double[] X = new double[n];
        double totalWeight = 0;
        
        PriorityQueue<Item> maxHeap = buildMaxHeap(weights, cost);
        
        while (totalWeight < knapsackWeight && !maxHeap.isEmpty()) {
            Item item = maxHeap.poll();
            int i = item.index;
            
            if (totalWeight + weights[i] <= knapsackWeight) {
                X[i] = 1;
                totalWeight += weights[i];
            } else {
                X[i] = (knapsackWeight - totalWeight) / weights[i];
                totalWeight = knapsackWeight;
            }
        }
        
        return X;
    }
    
    public static PriorityQueue<Item> buildMaxHeap(double[] weights, double[] cost) {
        int n = weights.length;
        PriorityQueue<Item> maxHeap = new PriorityQueue<>();
        
        for (int i = 0; i < n; i++) {
            double valuePerWeight = cost[i] / weights[i];
            maxHeap.offer(new Item(i, valuePerWeight));
        }
        
        return maxHeap;
    }
    
    public static void main(String[] args) {
        double[] weights = {3, 2, 2};
        double[] cost = {300, 190, 180};
        double knapsackWeight = 6;
        
        double[] result = fractionalKnapsack(weights, cost, knapsackWeight);
        
        System.out.println("Fraction of each item :");
        for (int i = 0; i < weights.length; i++) {
            System.out.println("Item " + (i+1) + ": " + result[i]);
        }
        System.out.println("Maximum profit: "+ (result[0]*cost[0]+ result[1]*cost[1]+ result[2]*cost[2]));
    }
}