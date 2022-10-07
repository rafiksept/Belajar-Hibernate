package belajar.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtils {
    private static SessionFactory factory;

    public static SessionFactory getSession(){
        try{
            factory = new Configuration().configure().addAnnotatedClass(Product.class).buildSessionFactory();
            return factory;
        } catch (Throwable throwable){
            System.err.println("Failed to create sessionFactory object." + throwable);
            throw new ExceptionInInitializerError(throwable);
        }
    };
}
