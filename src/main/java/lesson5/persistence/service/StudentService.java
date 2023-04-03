package lesson5.persistence.service;

import lesson5.persistence.entity.Students;
import org.hibernate.Session;

import java.util.List;

public interface StudentService {
    void addStudent(Session session, String name, int mark);

    void delStudent(Session session, Long id);

    Students fetchStudentById(Session session, Long id);

    List<Students> fetchAllStudent(Session session);

    void updateStudentMarkById(Session session, Long id, int mark);
}
