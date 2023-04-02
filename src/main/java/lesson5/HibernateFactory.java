package lesson5;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateFactory {

    public static SessionFactory start() {
    Configuration configuration = new Configuration();
        configuration.configure();
        return configuration.buildSessionFactory();
    }
}
