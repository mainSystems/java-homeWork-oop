package lesson5.persistence.repository;

import lesson5.persistence.entity.Students;
import org.hibernate.Session;

import java.util.List;

public interface StudentDao {
    public abstract void addStudent(Session session, String name, int mark);

    public abstract void delStudent(Session session, Long id);

    public abstract Students fetchStudentById(Session session, Long id);

    public abstract List<Students> fetchAllStudent(Session session);
    public abstract void updateStudentMarkById(Session session, Long id, int mark);
}
