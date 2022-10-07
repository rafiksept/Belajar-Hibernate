package belajar.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {
    public static void main(String[] args) {
        Session session = HibernateUtils.getSession().openSession();
        Transaction transaction;



        try{
            transaction = session.beginTransaction();

            Product product = new Product();
            product.setName("Handuk");
            product.setDescription("Handuk Keren");
            product.setPrice(10000);
            session.persist(product);
            transaction.commit();
        } catch (Throwable e){
            e.printStackTrace();
        } finally {
            session.close();
        }


    }
}
