package lesson1;

public class lesson1 {
    public static void main(String[] args) {
        Person person = new Person.Builder()
                .setFirstName("Dn")
                .setAddress("SPb")
                .setAge(99999)
                .setCountry("ru")
                .setGender("Male")
                .setLastName("Ming")
                .setMiddleName("Null")
                .setPhone("999999999999")
                .build();


        System.out.println("person = " + person);

        Rectangle rectangle = new Rectangle(4,5);
        Traingle traingle = new Traingle(4,6,8);
        Circle circle = new Circle(8);

        rectangle.isShape();
        traingle.isShape();
        circle.isShape();
    }

    /*2.
    - No class Engine in Car class
    - No "implements" in Lorry class
    - no "Override" abstract method open from abstract class Car
    */
}
