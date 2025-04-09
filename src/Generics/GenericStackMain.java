package Generics;

public class GenericStackMain<T> implements GenericStack<T> {

    protected T arr[];
    protected int tos;

    GenericStackMain() {
        arr = (T[]) new Object[10];
        tos = -1;
    }

    public boolean isEmpty() {
        return tos == -1;
    }

    public void push(T item) throws Exception {
        if (tos == 10) {
            throw new Exception("Stack is full");
        }
        else {
            tos++;
            arr[tos] = item;
        }
    }
    public T pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }
        else {
            T temp = arr[tos];
            tos--;
            return temp;
        }
    }

    public void printStack() {
        for (int i = 0; i <= tos ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) throws Exception{

        GenericStackMain<Integer> stack = new GenericStackMain<>();

        for (int i = 1 ; i <= 10; i++) {
            stack.push(i);
        }
        stack.printStack();
        stack.push(11);
        stack.printStack();
    }
}
