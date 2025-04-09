package Generics;

public interface GenericStack<T> {
    boolean isEmpty();
    void push(T item) throws Exception;
    T pop() throws Exception;
    void printStack();
}
