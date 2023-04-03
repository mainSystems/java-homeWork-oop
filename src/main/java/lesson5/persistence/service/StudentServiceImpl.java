package lesson5.persistence.service;

import lesson5.persistence.repository.StudentDaoImpl;
import lesson5.persistence.entity.Students;
import org.hibernate.Session;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    @Override
    public void addStudent(Session session, String name, int mark) {
        new StudentDaoImpl().addStudent(session, name, mark);
    }

    @Override
    public void delStudent(Session session, Long id) {
        new StudentDaoImpl().delStudent(session, id);
    }

    @Override
    public Students fetchStudentById(Session session, Long id) {
        return new StudentDaoImpl().fetchStudentById(session, id);
    }

    @Override
    public List<Students> fetchAllStudent(Session session) {
        return new StudentDaoImpl().fetchAllStudent(session);
    }

    @Override
    public void updateStudentMarkById(Session session, Long id, int mark) {
        new StudentDaoImpl().updateStudentMarkById(session, id,mark);
    }
}
