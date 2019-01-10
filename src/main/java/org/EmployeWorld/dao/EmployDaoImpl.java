package org.EmployeWorld.dao;


import org.hibernate.*;
import org.EmployeWorld.model.Employe;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class EmployDaoImpl<e> implements EmployDao {

    SessionFactory sessionFactory;


    @Autowired
    public EmployDaoImpl(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    //public EmployeeDaoImpl(SessionFactory sessionFactory) {
    // this.sessionFactory = sessionFactory;
    //}


    @Override
    public void save(Employe e) {
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(e);
        tx.commit();
        session.close();
    }


    @SuppressWarnings("unchecked")
    @Override
    public List<Employe> getEmployeTableByName() {
        Session currentSession = this.sessionFactory.openSession();

        Criteria c=currentSession.createCriteria(Employe.class);
        List rs=c.list();

        return rs;


        //Session session = this.sessionFactory.openSession();
        //List<Employe> empList = session.createQuery("from employee_table").list();
        //session.close();
        //return empList;
        //}
    }
}