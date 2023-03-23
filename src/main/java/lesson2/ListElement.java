package lesson2;

public class ListElement<T> {
    protected ListElement next = null;
    protected T data = null;

    @Override
    public String toString() {
        return "ListElement{" +
                "next=" + next +
                ", data=" + data +
                '}';
    }
}
