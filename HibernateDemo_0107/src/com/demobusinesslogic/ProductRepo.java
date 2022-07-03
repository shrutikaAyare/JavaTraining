package com.demobusinesslogic;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.demo.entity.Product;
import com.demo.factory.HibernateUtil;

public class ProductRepo {

	static Session session = null;
	static Transaction trans = null;
	//static SessionFactory sessionfactory = null;

	// logic part create product or add product
	public static Product createProduct(Product p) {
		session = HibernateUtil.getSessionFactory().openSession();// obtain the session for insert operations
		trans = session.beginTransaction();// start transaction
		session.save(p);// this equivalent to "insert into table value()
		trans.commit();
		session.close();
		return p;

	}

	// view product
	@SuppressWarnings("unchecked")
	public static List viewProduct() {
		Session session = null;
        List productList = new ArrayList();
        try {
        	session = HibernateUtil.getSessionFactory().openSession();
        	session.beginTransaction();
        	
        	productList = session.createQuery("FROM Product").list();
//            String queryStr = "select pro from product pro";
//            Query query = session.createQuery(queryStr);
//            productList = query.list();
        } catch(Exception ex) {
            ex.printStackTrace();
            // handle exception here
        } finally {
            try {if(session != null) session.close();} catch(Exception ex) {}
        }
        return productList;

	}
	
	
	public static void updateRecord(Long id) {       
        try {
        	session = HibernateUtil.getSessionFactory().openSession();
        	session.beginTransaction();
 
            // Creating Transaction Entity
            Product prc = (Product) session.get(Product.class, id);
            prc.setColor("Yellow");
            prc.setDescription("added by shrutika");
           
            session.getTransaction().commit();
           System.out.println("product with id " + id + " is successfully updated");
        } catch(Exception sqlException) {
            if(null != session.getTransaction()) {
            	 System.out.println("\n.......Transaction Is Being Rolled Back.......\n");
                session.getTransaction().rollback();
            }
            sqlException.printStackTrace();
        } finally {
            if(session != null) {
            	session.close();
            }
        }
    }
 
    // Method 4(a): This Method Is Used To Delete A Particular Record From The Database Table
    public static void deleteRecord(Long id) {
        try {
        	session = HibernateUtil.getSessionFactory().openSession();
        	session.beginTransaction();
 
            Product prc = findRecordById(id);
            session.delete(prc);
 
            // Committing The Transactions To The Database
            session.getTransaction().commit();
            System.out.println("\nProduct With Id?= " + id + " Is Successfully Deleted From The Database!\n");
        } catch(Exception sqlException) {
            if(null != session.getTransaction()) {
            	 System.out.println("\n.......Transaction Is Being Rolled Back.......\n");
                session.getTransaction().rollback();
            }
            sqlException.printStackTrace();
        } finally {
            if(session != null) {
            	session.close();
            }
        }
    }
    
    
    public static Product findRecordById(Long id) {
        Product findStudentObj = null;
        try {
        	session = HibernateUtil.getSessionFactory().openSession();
        	session.beginTransaction();
 
            findStudentObj = (Product) session.load(Product.class, id);
        } catch(Exception sqlException) {
            if(null != session.getTransaction()) {
                
                session.getTransaction().rollback();
            }
            sqlException.printStackTrace();
        } 
        return findStudentObj;
    }

}
