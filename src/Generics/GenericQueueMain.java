package Generics;

public class GenericQueueMain<T> {

    protected T arr[];
    protected int front;
    protected int rear;
    protected int size;
    protected int capacity;

    GenericQueueMain() {
        capacity = 10;
        arr = (T[]) new Object[capacity];
        front = 0;
        rear = 0;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void enqueue(T item) throws Exception {
        if (isFull()) {
            throw new Exception("Queue is full");
        }
        arr[rear] = item;
        rear = (rear + 1) % capacity;
        size++;
    }

    public T dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        T temp = arr[front];
        front = (front + 1) % capacity;
        size--;
        return temp;
    }

    public void printQueue() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        GenericQueueMain<Integer> queue = new GenericQueueMain<>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.enqueue(10);
        queue.printQueue();
        queue.dequeue();
        queue.printQueue();
        queue.enqueue(11);
        queue.printQueue();
        queue.dequeue();
        queue.enqueue(12);
        queue.printQueue();
    }
}
