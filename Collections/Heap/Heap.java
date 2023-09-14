package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class Heap {
    public static int findKthSmallest(int[] nums, int k) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());

        for (int i = 0; i < nums.length; i++) {
            maxHeap.add(nums[i]);

            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        return maxHeap.peek();
    }

    public static int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();

        for (int i = 0; i < nums.length; i++) {
            minHeap.add(nums[i]);

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        return minHeap.peek();
    }

    public static void main(String[] args) {
        int[] nums = { 7, 10, 9, 3, 20, 15 };
        int k = 3;

        System.out.println(findKthSmallest(nums, k));
        System.out.println(findKthLargest(nums, k));
    }
}
