package Generics;

public interface GenericList<T>{

    void add(T item , int index) throws Exception;
    boolean contains(T item);
    T get(int index) throws Exception;
    boolean isEmpty();
    void remove(int index) throws Exception;

}
