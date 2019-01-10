package org.EmployeWorld.pages;


import jdk.nashorn.internal.objects.annotations.Property;
import org.EmployeWorld.dao.EmployDao;
import org.EmployeWorld.model.Employe;
import org.apache.tapestry5.annotations.Component;
import org.apache.tapestry5.annotations.InjectPage;
import org.apache.tapestry5.corelib.components.Form;
import org.apache.tapestry5.ioc.annotations.Inject;

import java.text.Normalizer;
import java.util.List;

public class EmployDisplay {

   // @InjectPage
    // private Layout layout;

    @Inject
    private EmployDao employDao;

    @Property
    private Employe employe;


    @InjectPage
    private EmployeSave employeSave;

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }



    public List<Employe> getEmployes()
    {
        return employDao.getEmployeTableByName();
    }
}
