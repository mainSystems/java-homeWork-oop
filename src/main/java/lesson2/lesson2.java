package lesson2;

public class lesson2 {
    public static void main(String[] args) {
        List list = new List();
        for(int i = 0; i<=5; i++){
            list.addBack(i);
        }
        list.printList();
        list.addFront("first");
        list.printList();
        list.delEl(4);
        list.printList();

        System.out.println("\n______________________________");

        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(3);
        System.out.println("arr Size = " + arr.size());
        arr.print();
        arr.add(8);
        arr.add(8);
        arr.add(8);
        System.out.println("arr Size = " + arr.size());
        arr.print();
        System.out.println("Getting element 2: " + arr.get(1));
        arr.remove(0);
        arr.print();
        arr.findByData(8);
    }
}
