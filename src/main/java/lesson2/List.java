package lesson2;

class List<T> {
    private ListElement head;
    private ListElement tail;


    private ListElement createNewElement(T data) {
        ListElement newElement = new ListElement();
        newElement.data = data;
        return newElement;
    }

    public void addFront(T data) {
        ListElement newElement = createNewElement(data);

        if (head == null) {
            tail = newElement;
        } else {
            newElement.next = head;
        }
        head = newElement;
    }

    public void addBack(T data) {
        ListElement newElement = createNewElement(data);

        if (tail == null) {
            head = newElement;
        } else {
            tail.next = newElement;
        }
        tail = newElement;
    }

    public void printList() {
        ListElement head = this.head;
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println("\n______________________________");
    }

    public void delEl(T data) {
        if (head == null) {
            return;
        }
        if (head.data == data) {
            head = head.next;
        }


        ListElement findElement = head;
        while (findElement.next != null) {
            if (findElement.next.data == data) {
                if (tail == findElement.next) {
                    tail = findElement;
                }
                findElement.next = findElement.next.next;
            }
            findElement = findElement.next;
        }
    }
}