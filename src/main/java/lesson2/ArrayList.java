package lesson2;

import java.text.MessageFormat;

public class ArrayList<T> {

    private final int INIT_SIZE = 1;
    private Object[] array = new Object[INIT_SIZE];
    private int arraySize = 0;

    private void resize(int length) {
        Object[] newArr = new Object[(int) (length * 1.5 + 1)];
        System.arraycopy(array, 0, newArr, 0, arraySize);
        array = newArr;
    }

    public int size() {
        return array.length;
    }

    public void add(T data) {
        if (arraySize == array.length) {
            resize(array.length);
        }
        array[arraySize++] = data;
    }

    public void remove(int index) {
        array[index] = null;
    }

    public T get(int index) {
        return (T) array[index];
    }

    public void findByData (T data) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == data) {
                System.out.println(MessageFormat.format(" found data {0}, on index {1}", data, i));
            }
        }
    }

    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "]");
        }
        System.out.println("\n______________________________");
    }
}
