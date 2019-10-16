package org.improving.university;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;

@Component
public class App {
    {
        EntityManager em = JPAUtility.getEntityManager();
        public void run()
        {
            System.out.println("Starting count = "
                    + em.createQuery("Select count(*) from Student").getFirstResult());
        }
        try{
            em.getTransaction().begin();
            Student student = new Student("Jenn");
            em.persist(student);

            em.getTransaction().commit();
            System.out.println("GOOD JOB, successful");
        }catch( Exception e){
            System.out.println("Something Went Wrong..");
            em.getTransaction().rollback();
        }
    }
}
