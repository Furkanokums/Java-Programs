package Generics;

public class GenericListMain<T> implements GenericList<T>{

    protected T arr[];
    protected int end;

    GenericListMain() {
        arr = (T[]) new Object[10];
        end = 0;
    }

    public boolean isEmpty() {
        return end ==0;
    }

    public void add(T item, int index) throws Exception {
        if (end == 10) {
            throw new Exception("List is full");
        }
        else {
            for (int i = end ; i > index ; i--) {
                arr[i] = arr[i-1];
            }
            arr[index] = item;
            end ++;
        }
    }

    public T get(int index) throws Exception {
        if (index > end || isEmpty()) {
            throw new Exception("No element in this index");
        }
        else {
            return  arr[index];
        }
    }

    public boolean contains(T item) {
        for (int i = 0 ; i < end ; i++ ) {
            if (arr[i] == item) {
                return true;
            }
        }
        return false;
    }

    public void remove(int index) throws Exception {
        if (isEmpty()) {
            throw new Exception("List is empty");
        }
        else {
            for (int i = index ; i < end-1 ; i++) {
                arr[i] = arr[i+1];
            }
            end--;
        }
    }

    public void printList() {
        for (int i = 0; i < end; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) throws Exception{

        GenericListMain<Integer> list = new GenericListMain<>();

        list.add(1,0);
        list.add(2,1);
        list.add(3,2);
        list.add(3,3);
        list.add(4,4);
        list.add(6,5);
        list.add(7,6);
        list.add(8,7);
        list.add(9,8);
        list.add(10,9);
        list.printList();
        list.remove(3);
        list.printList();
        list.add(5,4);
        list.printList();
    }
}
