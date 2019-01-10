package org.EmployeWorld.pages;

import org.EmployeWorld.dao.EmployDao;
import org.EmployeWorld.model.Employe;
import org.apache.tapestry5.annotations.Component;
import org.apache.tapestry5.annotations.InjectPage;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.corelib.components.Form;
import org.apache.tapestry5.ioc.annotations.Inject;

public class EmployeSave {


    //private EmployeSave employeSave;

    @InjectPage
    private EmployDisplay employDisplay ;

    @Inject
    private EmployDao employDao;

    @Component
    private Form saveForm;

    @Property
    private  Long id;

    @Property
    private  String name;

    @Property
    private String address;

    @Property
    private String salary;

    @Property
     private String age;


    Object onSuccessFromsaveForm()
    {
        Employe emp =new Employe();
        emp.setName(name);
        emp.setAddress(address);
        emp.setSalary(salary);
        emp.setAge(age);
        emp.setId(id);
        employDao.save(emp);
        return employDisplay;
    }

}


