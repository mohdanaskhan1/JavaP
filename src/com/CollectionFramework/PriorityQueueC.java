package com.CollectionFramework;

import java.util.PriorityQueue;

public class PriorityQueueC {
    public void PQ(){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(456);
        pq.add(123);
        pq.add(789);
        System.out.println(pq);
        System.out.println(pq.poll());;
        System.out.println(pq);;
        pq.clear();
        System.out.println(pq);
    }
}
