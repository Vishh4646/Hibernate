package com.practice.MavenHibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.interview.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration config = new Configuration();
    	config.configure("confighibernate.xml");
    	System.out.println("Configuration done with Database");
    	SessionFactory sessionfactory=config.buildSessionFactory();
    	Session session=sessionfactory.openSession();
    	session.beginTransaction();
   
    	
    	Student st= new Student();
    	st.setsId(1);
    	st.setName("Vishal");
    	st.setLastname("Bhole");
    	 
    	session.save(st);
    	session.getTransaction().commit();
    	
    	//TO INSERT DATA
//    	
//    	Employee emp = new Employee();
//    	emp.setName("Rutuja");
//    	emp.setSalary("17000");
//
//    	session.save(emp);
//    	
//    	// TO DELETE DATA
//
//    	Employee emp1=session.get(Employee.class, 2);
//    
//    	session.delete(emp1);   
//    	
//    	// TO UPDATE OPERATION
//    	
//    	Employee emp2=session.get(Employee.class, 4);
//    	emp1.setName("Employee One");
//    	session.update(emp2);
//    	
//    	// TO SELECT DATA IN LIST    	
//    	
//    	Query q=session.createQuery("from Employee");
//    	List<Employee> list= q.list();
//    	for(Employee emp3 :list)
//    	{
//    		System.out.println(emp3);
//    	}
//    	
//    	
//    	
//    	// TO COMMIT DATA
//    	session.getTransaction().commit();
//    	
//    	
//    	System.out.println("Transaction Completed");
//    	session.close();
//    	sessionfactory.close();
    
    	
        
    }
}
