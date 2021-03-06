package jpabook.jpashop;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import jpabook.jpashop.domain.Order;
import jpabook.jpashop.domain.OrderItem;

public class jpaMain
{
    public static void main(String[] args) {

        final EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        final EntityManager em = emf.createEntityManager();
        final EntityTransaction tx = em.getTransaction();

        tx.begin();

        try{


            tx.commit();
        }catch(Exception e){
            tx.rollback();
        }finally {
            em.close();
        }
        emf.close();
    }
}
