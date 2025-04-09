package Generics;

public interface GenericQueue<T>{

    boolean isEmpty();
    void enqueue(T item) throws Exception;
    T dequeue() throws Exception;
}
