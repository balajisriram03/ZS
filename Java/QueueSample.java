package Accordion;

import java.util.ArrayList;

public class QueueSample {
    public static void main(String[] args) {
        ArrayListQueue<Integer> mq = new ArrayListQueue<>();

        mq.enqueue(10);
        mq.enqueue(20);
        mq.enqueue(30);
        mq.enqueue(40);

        System.out.println("Dequeued item: " + mq.dequeue());
        System.out.println("Dequeued item: " + mq.dequeue());
        System.out.println("Dequeued item: " + mq.dequeue());
        System.out.println("Dequeued item: " + mq.dequeue());
    }
}

class ArrayListQueue<T> {
    private ArrayList<T> queue;

    public ArrayListQueue() {
        queue = new ArrayList<>();
    }

    // Method to enqueue (add an element to the end of the queue)
    public void enqueue(T item) {
        queue.add(item);
    }

    // Method to dequeue (remove and return the element from the front of the queue)
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.remove(0);
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Method to get the size of the queue
    public int size() {
        return queue.size();
    }

    // Method to peek at the front element of the queue without removing it
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.get(0);
    }
}
