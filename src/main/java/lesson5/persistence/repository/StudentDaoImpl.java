package lesson5.persistence.repository;

import lesson5.persistence.entity.Students;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

@Slf4j
public class StudentDaoImpl implements StudentDao {
    @Override
    public void addStudent(Session session, String name, int mark) {
        session.beginTransaction();

        Students students = Students.builder()
                .name(name)
                .mark(mark)
                .build();
        session.save(students);

        session.getTransaction().commit();
    }

    @Override
    public void delStudent(Session session, Long id) {
        Students student = fetchStudentById(session, id);
        if (student != null) {
            session.beginTransaction();
            session.delete(student);
            session.getTransaction().commit();
        } else {
            log.error("can`t delete: " + id);
        }

    }

    @Override
    public Students fetchStudentById(Session session, Long id) {
        return session.get(Students.class, id);
    }

    @Override
    public List<Students> fetchAllStudent(Session session) {
        Query query = session.createQuery("from Students");
        List<Students> studentsList = query.list();
        return studentsList;
    }

    @Override
    public void updateStudentMarkById(Session session, Long id, int mark) {
        Students student = fetchStudentById(session, id);
        if (student != null) {
            student.setMark(mark);
            session.beginTransaction();
            session.update(student);
            session.getTransaction().commit();
        } else {
            log.error("No such user:" + id);
        }
    }
}
