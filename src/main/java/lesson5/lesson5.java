package lesson5;

import lesson5.persistence.entity.Students;
import lesson5.persistence.service.StudentServiceImpl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class lesson5 {
    public static void main(String[] args) {

        SessionFactory factory = HibernateFactory.getFactory();
        Session session = factory.openSession();


//        for (int i = 0; i < 1000; i++) {
//            new StudentServiceImpl().addStudent(session, "Test" + i, 44);
//        }
//
//        new StudentServiceImpl().updateStudentMarkById(session, 5L, 444);
//
//        new StudentServiceImpl().delStudent(session, 5L);

        Students studentById = new StudentServiceImpl().fetchStudentById(session, 1L);
        System.out.println("studentById = " + studentById);

        List<Students> studentsList = new StudentServiceImpl().fetchAllStudent(session);
        for (Students s :
                studentsList) {
            System.out.println("s = " + s);
        }

        session.close();
        factory.close();
    }
}
