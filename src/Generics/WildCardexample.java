package Generics;

import java.util.Arrays;
import java.util.List;

// Here, T should be Number (or) Sub-Classes of the number

public class WildCardexample<T extends Number>{
    private Object [] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // also working as index value

    public WildCardexample() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void getList(List<? extends Number> list){
        //do something
    }

    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

//        copy the current item in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove(){
        T removed = (T)(data[--size]);
        return removed;
    }

    public T get(int index){
        return (T)data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, T value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArraylist{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        WildCardexample<Float> list2 = new WildCardexample<>();

    }
}
