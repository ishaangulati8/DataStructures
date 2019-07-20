package com.company;
import java.util.PriorityQueue;
/**
 *Merge N sorted Arrays of different size using Priority queue.
 *
 */
public class MergeNSortedArrays {
    //Node class can also implement comparable interface for comparing the values of the nodes.
   private class Node {
       public  int number, index, value;
       public Node(int number, int index, int value) {
           this.number = number;
           this.index = index;
           this.value = value;
       }
   }

//Function to merge the arrays.
   public int[] merge(int[][] arr) {
       if (arr == null) {
           return new int[]{};
       }
       PriorityQueue<Node> queue = new PriorityQueue<>(arr.length, (Node a, Node b) -> a.value - b.value);
       int size = 0;
       for (int i = 0; i < arr.length; i++) {
           size += arr[i].length;
       }
       int[] result = new int[size];
       // Add the value at 0th index of each array to the queue
       for (int i = 0; i < arr.length; i++)
       {
           queue.add(new Node (i, 0, arr[i][0]));
       }
       for (int i = 0; i < size; i++) {
           Node node = queue.poll();
           if (node != null) {
               result[i] = node.value;
               if (node.index + 1 < arr[node.number].length) {
                   queue.add(new Node(node.number, node.index + 1, arr[node.number][node.index + 1]));
               }
           }

       }
       return result;
   }
}