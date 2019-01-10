package org.EmployeWorld.dao;

import org.EmployeWorld.model.Employe;

import java.util.List;

public interface EmployDao
{



    @SuppressWarnings("unchecked")
    List<Employe> getEmployeTableByName();

    public void save(Employe e);
    //public void addemploye(Employe employe);
}
