package Generics;

import java.util.ArrayList;

public class CustomList<T>
{
    private final ArrayList<T> arr = new ArrayList<>();

    public void add(T ele) {
        arr.add(ele);
    }

    public boolean remove(T ele) {
        return arr.remove(ele);
    }

    public T get(int index) {
        return arr.get(index);
    }

    public String toString() {
        return arr.toString();
    }
}
